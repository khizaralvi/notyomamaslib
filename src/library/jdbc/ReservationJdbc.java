package library.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import library.media.Reservation;
import library.media.ReservationCollection;

/**
 * This is the class that uses JDBC service package to manipulate the data in
 * Reservation.
 */
public class ReservationJdbc {

    private ReservationCollection rc = new ReservationCollection();
    private Connection con = null;
    private Statement st = null; // Select data
    private PreparedStatement ps = null; // Update, add, or delete data
    private ResultSet rs = null;
    private Reservation reservation = new Reservation();

    /**
     * This methods will stablish a connection with the database.
     */
    public void connect() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mediamanagement?autoReconnect=true&useSSL=false", "root", "");

        } catch (SQLException ex) {

            ex.printStackTrace();
        }

    }

    /**
     * This method allows us reserve one media for one specific patron.
     *
     * @param r reservation object passed from control class which tells us
     * which patron has reserved what media.
     * @return status message
     */
    public String reserveMedia(Reservation r) {

        // Checking if media is available
        if (!this.checkQuantity(r.getMediaId())) {
            return "Media not available";
        }

        // Check if reservation was not made before
        if (this.checkPatronReservation(r.getMediaId(), r.getPatronId())) {
            return "Patron already reserved this media";
        }

        connect(); // First, it must be connected to the database

        // Reserving media
        try {
            ps = con.prepareStatement("INSERT INTO reservation (patronId, mediaId, reservedDate) values(?,?,?)");
            ps.setInt(1, r.getPatronId());
            ps.setInt(2, r.getMediaId());
            ps.setString(3, r.getReservationDate());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ReservationJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Decrease quantity of the media available
        if (!this.decreaseQuantity(r.getMediaId())) {
            // Roll-back last transaction
            return "An error occured.";
        }

        return "Reservation was placed successfully!";
    }

    /**
     * Check if quantity is greater than zero.
     *
     * @param mediaId media unique identifier
     * @return true if quantity is greater than zero, false otherwise
     */
    public boolean checkQuantity(int mediaId) {
        connect(); // First, it must be connected to the database 

        // First, check if there are any copies to reserve
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT mediaQuantity FROM media WHERE mediaId = " + mediaId);

            while (rs.next()) {
                // Impossible to reserve media: no copies avaiable
                if (rs.getInt("mediaQuantity") == 0) {
                    return false;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReservationJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    /**
     * Check if the media was already reserved for the patron.
     *
     * @param mediaId media unique identifier
     * @param patronId patron unique identifier
     * @return true if media was already reserved for that patron, false
     * otherwise
     */
    public boolean checkPatronReservation(int mediaId, int patronId) {
        connect(); // First, it must be connected to the database 

        // Then, check if the patron already reserved this same media
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT reservationId, reservedDate FROM reservation WHERE mediaId = "
                    + mediaId + " AND patronId = " + patronId);

            // Impossible to reserve media: this patron has a reservation placed for this media
            while (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReservationJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    /**
     * Decrease quantity for a media.
     *
     * @param mediaId media unique identifier
     * @return true if update was made, false otherwise
     */
    public boolean decreaseQuantity(int mediaId) {
        connect(); // First, it must be connected to the database

        // Decreasing quantity
        try {
            ps = con.prepareStatement("UPDATE media SET mediaQuantity = mediaQuantity - 1 WHERE mediaId = "
                    + mediaId);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ReservationJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     * Increase quantity for a media.
     *
     * @param mediaId media unique identifier
     * @return true if update was made, false otherwise
     */
    public boolean increaseQuantity(int mediaId) {
        connect(); // First, it must be connected to the database

        // Decreasing quantity
        try {
            ps = con.prepareStatement("UPDATE media SET mediaQuantity = mediaQuantity + 1 WHERE mediaId = "
                    + mediaId);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ReservationJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     * Delete a reservation given its reservation id.
     *
     * @param reservationId reservation ID
     * @return the deleted object
     */
    public Reservation deleteReservation(int reservationId) {
        connect(); // First, it must be connected to the database
        Reservation r = new Reservation();
        
        r = this.searchReservation(reservationId);
        
        try {
            ps = con.prepareStatement("DELETE FROM reservation WHERE reservationId = ?");
            ps.setInt(1, r.getReservationId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ReservationJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(!this.increaseQuantity(r.getMediaId())) {
            // Roll back last transaction
            return null;
        }
        return r;
    }

    /**
     * This method lets us view all reserved media for one specific patron
     *
     * @param patronId represents patron whose reservation is required to be
     * displayed
     * @return an ArrayList with all reservations for that specific patron
     */
    public ArrayList<Reservation> viewPatronReserveList(int patronId) {
        connect(); // First, it must be connected to the database 

        /**
         * Cleaning the reservList collection to be used to collect all
         * reservation entries for the patron.
         */
        if (!rc.reserveList.isEmpty()) {
            rc.reserveList.clear();
        }
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM reservation WHERE patronId = " + patronId);
            while (rs.next()) {
                reservation.setReservationId(rs.getInt("reservationId"));
                reservation.setPatronId(rs.getInt("patronId"));
                reservation.setMediaId(rs.getInt("mediaId"));
                reservation.setReservationDate(rs.getString("reservedDate"));
                rc.reserveList.add(reservation);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReservationJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rc.reserveList;
    }

    /**
     * This method display all the reserved media in the library.
     *
     * @return an ArrayList with all reserved items in the library
     */
    public ArrayList<Reservation> viewLibReserveList() {

        connect();
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM reservation");
            while (rs.next()) {
                reservation.setReservationId(rs.getInt("ReservationId"));
                reservation.setPatronId(rs.getInt("patronId"));
                reservation.setMediaId(rs.getInt("mediaId"));
                reservation.setReservationDate(rs.getString("ReservedDate"));
                rc.reserveList.add(reservation);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ReservationJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rc.reserveList;
    }

    /**
     * Search a reservation by reservationId
     *
     * @param reservationId the reservation ID
     * @return the reservation object
     */
    public Reservation searchReservation(int reservationId) {
        Reservation r = new Reservation();

        connect(); // First, it must be connected to the database 

        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM reservation WHERE reservationId = " + reservationId);
            while (rs.next()) {
                r.setReservationId(rs.getInt("reservationId"));
                r.setPatronId(rs.getInt("patronId"));
                r.setMediaId(rs.getInt("mediaId"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ReservationJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
    
    /**
     * Search a reservation by patronId and mediaId.
     *
     * @param mediaId media ID
     * @param patronId patron ID
     * @return the reservation object
     */
    public Reservation searchReservation(int mediaId, int patronId) {
        Reservation r = new Reservation();

        connect(); // First, it must be connected to the database 

        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM reservation WHERE mediaId = " 
                    + mediaId + " AND patronId = " + patronId);
            while (rs.next()) {
                r.setReservationId(rs.getInt("reservationId"));
                r.setPatronId(rs.getInt("patronId"));
                r.setMediaId(rs.getInt("mediaId"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReservationJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

}

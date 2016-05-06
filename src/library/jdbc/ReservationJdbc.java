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
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?autoReconnect=true&useSSL=false", "root", "");

        } catch (SQLException ex) {

            ex.printStackTrace();
        }

    }

    /**
     * This method allows us reserve one media for one specific patron.
     *
     * @param r reservation object passed from control class which tells us
     * which patron has reserved what media.
     * @return true if the desired operation was successful, false otherwise
     */
    public boolean reserveMedia(Reservation r) {
        connect(); // First, it must be connected to the database 
        // First, check if there are any copies to reserve
        // Then, check if the patron already reserved this same media
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT mediaQuantity FROM mydb.media WHERE mediaId = " + r.getMediaId());
            rs.next();
            
            if (rs.getInt("mediaQuantity") == 0) {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReservationJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Reserving media
        try {
            ps = con.prepareStatement("INSERT INTO mydb.reservation values(?,?,?,?)");
            ps.setInt(1, r.getReservationId());
            ps.setString(2, r.getPatronId());
            ps.setString(3, r.getMediaId());
            ps.setString(4, r.getReservationDate());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ReservationJdbc.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        return true;
    }

    /**
     * Delete a reservation given its reservation id.
     *
     * @param r Reservation object retrieved from the database
     * @return the deleted object
     */
    public Reservation deleteReservation(Reservation r) {
        connect(); // First, it must be connected to the database

        try {
            ps = con.prepareStatement("DELETE FROM mydb.reservation WHERE ReservationId = ?");
            ps.setInt(1, r.getReservationId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ReservationJdbc.class.getName()).log(Level.SEVERE, null, ex);
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
    public ArrayList<Reservation> viewPatronReserveList(String patronId) {
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
            rs = st.executeQuery("SELECT * FROM mydb.reservation WHERE patronId = " + patronId);
            while (rs.next()) {
                reservation.setReservationId(rs.getInt("ReservationId"));
                reservation.setPatronId(rs.getString("patronId"));
                reservation.setMediaId(rs.getString("mediaId"));
                reservation.setReservationDate(rs.getString("ReservedDate"));
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
            rs = st.executeQuery("SELECT * FROM mydb.reservation");
            while (rs.next()) {
                reservation.setReservationId(rs.getInt("ReservationId"));
                reservation.setPatronId(rs.getString("patronId"));
                reservation.setMediaId(rs.getString("mediaId"));
                reservation.setReservationDate(rs.getString("ReservedDate"));
                rc.reserveList.add(reservation);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ReservationJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rc.reserveList;
    }

}

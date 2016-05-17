package library.jdbc;

//import java.util.Date;
import library.media.CheckedOutMedia;
import library.media.CheckedOutCollection;
import java.sql.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import library.media.Media;
import library.media.Reservation;

/**
 *
 * @author Abdul Basit
 */
public class CheckedOutJdbcClass {

    private Media m = null;
    private Connection con = null;
    private ResultSet rs = null;
    private Statement statement = null;
    private PreparedStatement prepared = null;
    CheckedOutCollection ch = null;

    /**
     * Constructor for CheckedOutJdbc
     */
    public CheckedOutJdbcClass() {

        ch = new CheckedOutCollection();

    }

    /**
     * This methods records info of the checked out media and the info of the
     * patron checking it out
     *
     * @param insertCheckoutMedia record of info pertaining to check out
     * @return true if recorded successfully or false otherwise
     */
    public boolean insertCheckoutMedia(CheckedOutMedia i) {

        connect();

        try {

            statement = con.createStatement();

            rs = statement.executeQuery("select *from checkedoutmedia where mediaid='" + i.getMediaId() + "'AND patronid='" + i.getPatronId() + "'");

            if (rs.next()) {
                System.out.println("Cannnot enter duplicate entries");

            } else {
                prepared = con.prepareStatement("insert into checkedoutmedia values(?,?,?,?,?)");
                prepared.setInt(1, i.getMediaId());
                prepared.setInt(2, i.getPatronId());
                prepared.setDate(3, i.getBorrowDate());
                prepared.setDate(4, i.getDueDate());
                prepared.setString(5, i.getPatronEmail());

                prepared.executeUpdate();

                System.out.println("Successfully inserted");
                return true;
            }
        } catch (SQLException ex) {

            ex.printStackTrace();
        }

        return false;

    }

    /**
     * This method allows people to search the checked out media allowing the
     * patron to view borrowing history
     *
     * @param patronid
     * @return true if this was successful or false otherwise
     */
    public CheckedOutCollection searchCheckedOutMedia(int patronid) {

        connect();
        try {
            statement = con.createStatement();

            rs = statement.executeQuery("select *from checkedoutmedia where patronID='" + patronid + "'");

            unpack(rs);

        } catch (SQLException ex) {
            Logger.getLogger(CheckedOutJdbcClass.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ch;
    }

    /**
     * This method marks the media that is currently checked out of the catalog,
     * as returned. It is only called when checkIn is true
     *
     * @param deletedCheckedOutMedia Media to be marked as returned
     * @return true if this was successful or false otherwise
     */
    public boolean deleteCheckedOutMedia(int patron, int media) {

        connect();
        try {
            statement = con.createStatement();

            prepared = con.prepareStatement("delete from checkedoutmedia where patronID=? AND mediaId=?");
            prepared.setInt(1, patron);
            prepared.setInt(2, media);

            prepared.executeUpdate();
                return true;
        } catch (SQLException se) {
            se.printStackTrace();
        }

        return false;
    }

    /**
     * This methods validates a renewal for media that is currently checked from
     * the catalog if it is not currently reserved already
     *
     * @param patronid
     * @param emailid
     * @param renewMedia Media is renewed
     * @return true if media was renewed successfully, false otherwise
     */
    public boolean renewMedia(int patronid, int mediaid) {

        connect();
        try {
            prepared = con.prepareStatement("update checkedoutmedia set dueDate=Date_add(dueDate,Interval 7 DAY)"
                    + "where patronid=? and mediaid=?");

            prepared.setInt(1, patronid);
            prepared.setInt(2, mediaid);

            prepared.executeUpdate();

        } catch (SQLException se) {
            se.printStackTrace();
        }

        return true;
    }

    public void connect() {

        String url = "jdbc:mysql://localhost:3306/library_system?autoReconnect=true&useSSL=false";
        String user = "root";
        String password = "rafa2012";

        try {
            con = DriverManager.getConnection(url, user, password);

            //          System.out.println("Connection successful");
        } catch (SQLException se) {
            se.printStackTrace();
        }

    }

    private void unpack(ResultSet rs) {
        CheckedOutMedia check = null;

        try {
            while (rs.next()) {
                check = new CheckedOutMedia(rs.getInt("mediaId"), rs.getInt("patronId"), rs.getDate("borrowDate"), rs.getDate("dueDate"), rs.getString("patronEmail"));
                ch.getMedia().add(check);

            }

        } catch (SQLException se) {
            se.printStackTrace();
        }
    }

}

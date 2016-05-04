package library.jdbc;

import library.media.CheckedOutMedia;
import library.media.CheckedOutCollection;
import java.sql.*;
import java.util.ArrayList;
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

    /**
     * Constructor for CheckedOutJdbc
     */
    public CheckedOutJdbcClass() {
    }

    /**
     * This methods records info of the checked out media and the info of the
     * patron checking it out
     *
     * @param insertCheckoutMedia record of info pertaining to check out
     * @return true if recorded successfully or false otherwise
     */
    public boolean insertCheckoutMedia(CheckedOutMedia insertCheckoutMedia) {
        return true;
    }

    /**
     * This method allows people to search the checked out media allowing the
     * patron to view borrowing history
     *
     * @param searchCheckedOutMedia provides checked out media history
     * @return true if this was successful or false otherwise
     */
    public boolean searchCheckedOutMedia(CheckedOutMedia searchCheckedOutMedia) {
        return true;
    }

    /**
     * This method marks the media that is currently checked out of the catalog,
     * as returned. It is only called when checkIn is true
     *
     * @param deletedCheckedOutMedia Media to be marked as returned
     * @return true if this was successful or false otherwise
     */
    public boolean deleteCheckedOutMedia(CheckedOutMedia deletedCheckedOutMedia) {
        return true;
    }

    /**
     * This methods validates a renewal for media that is currently checked from
     * the catalog if it is not currently reserved already
     *
     * @param renewMedia Media is renewed
     * @return true if media was renewed successfully, false otherwise
     */
    public boolean renewMedia(CheckedOutMedia renewMedia) {
        return true;
    }

    /**
     * This method uses JDBC to retrieve Patron Emails and
     * his/her due dates from the checkedOutMedia table in Database, stores them
     * into
     * String and Date arrayLists and compares the difference of due dates
     * with the current date using the Java.util.date and joda.time.DateTime
     * class.
     * @return an ArrayList of DueDates
     * @throws java.sql.SQLException Throughs exception
     */
    public ArrayList<Date> checkDueDates() throws SQLException {
        
        ArrayList<Date> DueDatesDifference = new ArrayList<Date>();
        return DueDatesDifference;

    }

    /**
     * This method uses Java.mail.Api and JDBC class to
     * retrieve Patron emails from checkedOutMedia table in Database and send
     * email notifications to the Patrons who have missed Due Date of their
     * return of media
     * @return returns true on successful delivery of email
     */
    public boolean SendLateNotification() {
        return true;

    }

    /**
     * This method uses Java.mail.Api and JDBC class to
     * retrieve Patron emails from checkedOutMedia table in Database and send
     * due date email notifications to the Patrons who have two days left to
     * return their media
     * @return returns true on successful delivery of email
     */
    public boolean SendDueDateNotification() {
        return true;

    }

}


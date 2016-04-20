package library.jdbc;

import java.sql.*;
import library.media.CheckedOutMedia;
import library.media.Media;

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
     * Constructor for CheckedOutJdbcClass.
     */
    public CheckedOutJdbcClass() {
    }

    /**
     * This methods reinserts a previously checked out media to the catalog upon return
     *
     * @param checkIn Media to be reinserted
     * @return true if the insertion was successful or false otherwise
     */
    public boolean CheckInMedia(Media checkIn) {
        return true;
    }

    /**
     * This method marks the media that is currently checked out of the catalog, as 
     * returned. It is only called when checkIn is true
     *
     * @param deleteCheckedOutMedia Media to be marked as returned
     * @return true if this was successful or false otherwise
     */
    public boolean deleteCheckedOutMedia(CheckedOutMedia deletedCheckedOutMedia) {
        return true;
    }

    /**
     * This methods validates a renewal for media that is currently checked from the catalog
     * if it is not currently reserved already
     *
     * @param renewMedia Media is renewed 
     * @return true if media was renewed successfully, false otherwise
     */
    public boolean renewMedia(CheckedOutMedia renewMedia) {
        return true;
    }

}
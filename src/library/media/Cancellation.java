package library.media;

import java.util.Date;

/**
 * This class holds the attributes required to cancel a reservation of media by a patron.
 * <ul>
 * <li>Media ID</li>
 * <li>Patron ID</li>
 * <li>Cancellation ID</li>
 * <li>Reservation date</li>
 * <li>Cancelled data<li>
 * </ul>
 * @author <a>Brett Landau</a>
 */

public class Cancellation {

    private int MediaId;
    private int PatronId;
    private String reserved_date;
    private int cancellationId;
    private String cancelled_date;

    /**
     *
     * @param cancellationId CancellationID is the unique id for the cancellation
     * @param MediaId MediaId is the unique id for every single media
     * @param PatronId PatronId is the unique id for every single patron
     * @param reserved_date records date the book was reserved
     * @param cancelled_date records date the book was Cancelled
     *
     */
    public Cancellation(int cancellationId, int MediaId, int PatronId, String reserved_date, String cancelled_date) {
        this.cancellationId = cancellationId;
        this.MediaId = MediaId;
        this.PatronId = PatronId;
        this.reserved_date = reserved_date;
        this.cancelled_date = cancelled_date;
    }

    Cancellation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method returns MediaID attribute of the object
     *
     * @return String
     */
    public int getMediaId() {
        return MediaId;
    }

    /**
     * This method lets us set the MediaId attribute for the object
     *
     * @param MediaId Media Id
     */
    public void setMediaId(int MediaId) {
        this.MediaId = MediaId;
    }

    /**
     * This method returns the PatronId attribute of the object
     *
     * @return String
     */
    public int getPatronId() {
        return PatronId;
    }

    /**
     * This method sets the PatronId attribute of the object
     *
     * @param PatronId Patron unique identifies
     */
    public void setPatronId(int PatronId) {
        this.PatronId = PatronId;
    }

    /**
     * This method lets us receive Date attribute of the object
     *
     * @return Date
     */
    public String getReserved_date() {
        return reserved_date;
    }

    /**
     * This method lets us return reserve date attribute of the object
     *
     * @param reserved_date date media was reserved
     */
    public void setReserved_date(String reserved_date) {
        this.reserved_date = reserved_date;
    }

    /**
     * This method lets us receive Date attribute of the object
     *
     * @return cancelled_date cancellation date
     */
    public String getCancelled_date() {
        return cancelled_date;
     }

    /**
     * This method lets us return cancellation date attribute of the object
     *
     * @param cancelled_date date media was cancelled
     */
    public void setCancelled_date(String cancelled_date) {
        this.cancelled_date = cancelled_date;
     }

    /**
     * This method returns the cancellation id .
     *
     * @return the date in which the cancellation was made
     */
    public int getCancellationId() {
        return cancellationId;
    }

    /**
     * This method sets the cancellation id.
     * @param cancellationId cancellation id
     */
    public void setCancellationId(int cancellationId) {
        this.cancellationId = cancellationId;
    }

    /**
     * This method is used to display contents of each object
     *
     * @return String This String contains the contents of each attribute for
     * the given object
     */
    @Override
    public String toString() {
        return "Reservation2{" + "MediaId=" + MediaId + ", PatronId=" + 
                PatronId + ", reserved_date=" + reserved_date + 
                ", cancelled_date=" + cancelled_date + ", cancellationID=" + 
                cancellationId + "}";
    }

    /**
     * This method is used to compare object passed with the object invoking the
     * method
     *
     * @param o Object that is sent to be compared
     * @return boolean value which
     */
    @Override
    public boolean equals(Object o) {
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }

}

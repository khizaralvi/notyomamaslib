package Bridge_media_package;

/**
 * CheckedOutMedia is the class that implements a media that was borrowed by a
 * specific user. It will store state information relevant to this operation.
 *
 * @author <a href="abasit1@oldwestbury.edu">Abdul Basit</a>
 * @version 1.0.0
 */
public class CheckedOutMedia extends Media {

    private String patron_id;
    private String media_id;
    private String borrow_date;
    private String due_date;
    private String date_returned;

    /**
     * Constructor for CheckedOutMedia.
     *
     * @param id Media unique identifier
     * @param title Media title
     * @param year Media publishing year
     * @param cost Media cost
     * @param patron_id Patrons id
     * @param media_id Medias id
     * @param borrow_date date borrowed
     * @param due_date date due
     * @param date_returned date returned
     */
    public CheckedOutMedia(String id, String title, String year, String cost,
            String patron_id, String media_id, String borrow_date,
            String due_date, String date_returned) {
        super(id, title, year, cost);
    }

    /**
     * Returns the Patron ID of the Patron who is checking out the media.
     *
     * @return patron id
     */
    public String getPatron_id() {
        return patron_id;
    }

    /**
     * Returns the Media ID of the Media that is being checked out.
     *
     * @return media id
     */
    public String getMedia_id() {
        return media_id;
    }

    /**
     * Returns the date that the Media is being checked out.
     *
     * @return borrow date
     */
    public String getBorrow_date() {
        return borrow_date;
    }

    /**
     * Sets the date that the Media is being checked out.
     *
     * @param borrow_date date borrowed
     */
    public void setBorrow_date(String borrow_date) {

    }

    /**
     * Returns the date that the Media is due back.
     *
     * @return due date
     */
    public String getDue_date() {
        return due_date;
    }

    /**
     * Sets the date that the Media is due back.
     *
     * @param due_date date due
     */
    public void setDue_date(String due_date) {

    }

    /**
     * Returns the date that the Media is actually returned.
     *
     * @return return date
     */
    public String getDate_returned() {
        return date_returned;
    }

    /**
     * Sets the date that the Media is actually returned.
     *
     * @param date_returned date returned
     */
    public void setDate_returned(String date_returned) {

    }

}

package library.media;

/**
 * CheckedOutMedia is the class that implements a media that was borrowed by a
 * specific user. It will store state information relevant to this operation.
 *
 * @author <a href="abasit1@oldwestbury.edu">Abdul Basit</a>
 * @version 1.0.0
 */
public class CheckedOutMedia  {

    private String mediaId;
    private String patronId;
    private String borrowDate;
    private String dueDate;
    private String patronEmail;

    /**
     * Constructor for CheckedOutMedia.
     *
     * @param mId Media unique identifier
     * @param pId Patron unique identifier
     * @param bDate date borrowed
     * @param dDate date due
     * @param pEmail Email of Patron
     */
    public CheckedOutMedia(String mediaId, String patronId, 
		String borrowDate, String dueDate, String patronEmail) {
    }

    /**
     * Returns the Media ID of the Media that is being checked out
     *
     * @return Media unique identifier
     */
    public String getMediaId() {
        return mediaId;
    }

    /**
     * Sets the Media Id
     *
     * @param mId Media unique identifier
     */
    public void setMediaId(String mediaId) {
    }

   
     /**
     * Returns the Patron ID of the Patron who is checking out the media
     *
     * @return Patron unique identifier
     */
    public String getPatronId() {
        return patronId;
    }

    /**
     * Sets the Patron Id
     *
     * @param pId Patron unique identifier
     */
    public void setPatronId(String patronId) {
    }

    /**
     * Returns the date that the Media is being checked out
     *
     * @return borrow date
     */
    public String getBorrowDate() {
        return borrowDate;
    }

    /**
     * Sets the date that the Media is being checked out
     *
     * @param bDate date borrowed
     */
    public void setBorrowDate(String borrowDate) {

    }

    /**
     * Returns the date that the Media is due back
     *
     * @return due date
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Sets the date that the Media is due back
     *
     * @param dDate date due
     */
    public void setDueDate(String dueDate) {

    }

    /**
     * Returns the Email Address of the Patron checking out the Media
     *
     * @return Email of Patron
     */
    public String getPatronEmail() {
        return patronEmail;
    }

    /**
     * Sets the the Email Address of the Patron checking out the Media
     *
     * @param pEmail Email of Patron
     */
    public void setPatronEmail(String patronEmail) {

    }


    /**
     * toString() for printing all the data associated with CheckOutMedia 
     *
     * @return the string with all the information of CheckedOutMedia
     */
    @Override
    public String toString() {
        return "";
    }

    /**
     * equals method to compare CheckedOutMedia objects
     *
     * @param com CheckedOutMedia Object
     * @return true if same, otherwise false
     */
    public boolean equals(CheckedOutMedia com) {
	return true;
    }

}
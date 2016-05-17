package library.media;

import java.sql.Date;

/**
 * CheckedOutMedia is the class that implements a media that was borrowed by a
 * specific user. It will store state information relevant to this operation.
 *
 * @author <a href="abasit1@oldwestbury.edu">Abdul Basit</a>
 * @version 1.0.0
 */
public class CheckedOutMedia {

    private int mediaId;
    private int patronId;
    private Date borrowDate;
    private Date dueDate;
    private String patronEmail;

    /**
     * Constructor for CheckedOutMedia.
     *
     * @param mediaId Media unique identifier
     * @param patronId Patron unique identifier
     * @param borrowDate date borrowed
     * @param dueDate date due
     * @param patronEmail Email of Patron
     */
    public CheckedOutMedia(int mediaId, int patronId,
            Date borrowDate, Date dueDate, String patronEmail) {

        this.patronId = patronId;
        this.mediaId = mediaId;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.patronEmail = patronEmail;

    }

    /**
     * Returns the Media ID of the Media that is being checked out
     *
     * @return Media unique identifier
     */
    public int getMediaId() {
        return mediaId;
    }

    /**
     * Sets the Media Id
     *
     * @param mediaId Media unique identifier
     */
    public void setMediaId(String mediaId) {
    }

    /**
     * Returns the Patron ID of the Patron who is checking out the media
     *
     * @return Patron unique identifier
     */
    public int getPatronId() {
        return patronId;
    }

    /**
     * Sets the Patron Id
     *
     * @param patronId Patron unique identifier
     */
    public void setPatronId(String patronId) {
    }

    /**
     * Returns the date that the Media is being checked out
     *
     * @return borrow date
     */
    public Date getBorrowDate() {
        return borrowDate;
    }

    /**
     * Sets the date that the Media is being checked out
     *
     * @param borrowDate date borrowed
     */
    public void setBorrowDate(String borrowDate) {

    }

    /**
     * Returns the date that the Media is due back
     *
     * @return due date
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * Sets the date that the Media is due back
     *
     * @param dueDate date due
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
     * @param patronEmail Email of Patron
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

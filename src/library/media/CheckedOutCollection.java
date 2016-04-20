package library.media;

import java.util.ArrayList;

/**
 * CheckedOutCollection is the collection of all Media that has been checked out
 * by a specific Patron. The CheckedOutCollection has an array for Media and an
 * array for Patrons
 *
 * @author <a href="abasit1@oldwestbury.edu">Abdul Basit</a>
 */
public class CheckedOutCollection {

    private ArrayList<Media> media;

    /**
     * Constructor for CheckedOutCollection
     *
     * @param media an ArrayList of Media
     */
    public CheckedOutCollection(ArrayList<Media> media) {
    }

    /**
     * Returns the array of available Media in the system
     *
     * @return an ArrayList of Media
     */
    public ArrayList<Media> getMedia() {
        return media;
    }

    /**
     * Sets the ArrayList of Media in CheckedOutCollection
     *
     * @param media ArrayList of Media
     */
    public void setMedia(ArrayList<Media> media) {
    }

    /**
     * This methods reinserts a previously checked out media to the catalog upon
     * return
     *
     * @param checkIn Media to be reinserted
     * @return true if the insertion was successful or false otherwise
     */
    public boolean CheckInMedia(Media checkIn) {
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
     * @author khizaralvi This method sends email notification to the user
     * reminding him/her of his/her overdue media and
     * @return true on successful delivery of email
     */
    public boolean SendLateNotification() {
        return true;

    }

    /**
     * @author khizaralvi This method sends email notification to the user
     * reminding him/her of his/her approaching due date and
     * @return true on successful delivery of email
     */
    public boolean SendDueDateNotification() {
        return true;

    }

    /**
     * toString() method to CheckedOutCollection
     *
     * @return detail for every Media
     */
    @Override
    public String toString() {
        return "";
    }
}

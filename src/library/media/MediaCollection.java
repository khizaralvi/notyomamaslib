package library.media;

import java.util.ArrayList;

/**
 * MediaCollection is the collection of all Media in the catalog. The
 * MediaColletion will store an array of Media and the total number of available
 * Media in the catalog.
 *
 * @author <a href="jessicacarneiro@ufmg.br">Jéssica Carneiro</a>
 */
public class MediaCollection {

    private ArrayList<Media> media;
    private int total;

    /**
     * Constructor for MediaCollection.
     *
     * @param media an ArrayList of Media
     * @param total total amount of Media
     */
    public MediaCollection(ArrayList<Media> media, int total) {
    }

    /**
     * Returns the array of Media stored in MediaCollection.
     *
     * @return an ArrayList of Media
     */
    public ArrayList<Media> getMedia() {
        return media;
    }

    /**
     * Sets the ArrayList of Media in MediaCollection.
     *
     * @param media ArrayList of Media
     */
    public void setMedia(ArrayList<Media> media) {
    }

    /**
     * Returns the total amount of Media in the catalog.
     *
     * @return total of Media as integer
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets the total of Media.
     *
     * @param total number of Media in the catalog
     */
    public void setTotal(int total) {
    }

    /**
     * This methods adds a new media to the catalog.
     *
     * @param m Media to be added
     * @return true if the insertion was successful or false otherwise
     */
    public boolean addMedia(Media m) {
        total++;
        return true;
    }

    /**
     * This method edits an existing media in the catalog. Each subtype class
     * will have their own implementation of this method
     *
     * @param mediaId Media unique identifier
     * @param attribute attribute to edit
     * @param newValue new value provided to that attribute
     * @return true if the edition was successful or false otherwise
     */
    public boolean editMedia(String mediaId, String attribute,
            String newValue) {
        return true;
    }

    /**
     * This methods deletes an existing media from the catalog.
     *
     * @param mediaId Media id to delete
     * @return boolean if media was deleted successfully, false otherwise
     */
    public boolean deleteMedia(String mediaId) {
        total--;
        return true;
    }

    /**
     * This method will perform a search in the catalog.
     *
     * @param attribute attribute that serves as the key for search
     * @param value value typed by user to perform search
     * @return an ArrayList of Media with all entries retrieved from the search
     */
    public ArrayList<Media> searchMedia(String attribute, String value) {
        ArrayList<Media> resultSet = new ArrayList<>();
        return resultSet;
    }

    /**
     * This methods performs a reservation of a media to a patron account.
     *
     * @param patronId Patron Id
     * @param mediaId Media Id to be reserved
     * @return an object of type Reservation
     */
    public Reservation reserveMedia(String patronId, String mediaId) {
        Reservation reserved = new Reservation(patronId, mediaId);
        return reserved;
    }

    /**
     * toString() method to MediaCollection
     *
     * @return detail for every Media
     */
    @Override
    public String toString() {
        return "";
    }
}

package library.media;

import java.util.ArrayList;

/**
 * MediaCollection is the collection of all Media in the catalog. The
 * MediaColletion will store an array of Media and the total number of available
 * Media in the catalog.
 *
 * @author <a>Adil Imam</a>
 */
public class MediaCollection {

    private ArrayList<Media> media;

    /**
     * Default constructor for MediaCollection
     */
    public MediaCollection() {
        this.media = new ArrayList<> ();
    }

    /**
     * Parameterized Constructor for MediaCollection.
     *
     * @param media an ArrayList of Media
     */
    public MediaCollection(ArrayList<Media> media) {
        this.media = new ArrayList<> (media);
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
     * @return true if media is set successfully or false otherwise
     */
    public boolean setMedia(ArrayList<Media> media) {
        return false;
    }

    /**
     * This methods adds a new media to the catalog.
     *
     * @param m Media to be added
     */
    public void addMedia(Media m) {
        this.media.add(m);
    }

    /**
     * This method edits an existing media in the catalog. Each subtype class
     * will have their own implementation of this method
     *
     * @param editedMedia Media object with all modifications
     * @return true if the edition was successful or false otherwise
     */
    public boolean editMedia(Media editedMedia) {
        return true;
    }

    /**
     * This methods deletes an existing media from the catalog.
     *
     * @param mediaId Media id to delete
     * @return Media object that is deleted successfully, otherwise null is
     * returned if the media is not found!!
     */
    public Media deleteMedia(String mediaId) {
        return null;
    }

    /**
     * This method will perform a search in the catalog.
     *
     * @param attribute attribute by which patrons want to filter the media
     * @param value value typed by user to perform search
     * @return an ArrayList of Media with all media rows retrieved from the
     * search
     */
    public ArrayList<Media> searchMedia(String attribute, String value) {
        ArrayList<Media> resultSet = new ArrayList<>();
        return resultSet;
    }

    /**
     * toString() method to MediaCollection
     *
     * @return detail for every Media
     */
    @Override
    public String toString() {

        String type;
        String aggregate = "";
        for (int i = 0; i < media.size(); i++) {
            type = media.get(i).getMediaType();

            if (type.equals("b")) {
                aggregate += String.valueOf(media.get(i).getMediaId()) + "\t" + media.get(i).getMediaTitle() + "\t"
                        + media.get(i).getMediaCost() + "\t" + media.get(i).getMediaYear() + "\t" + media.get(i).getBookGenre() + "\t\tBook\t"
                        + media.get(i).getQuantity() + "\t" + media.get(i).getPublisher()
                        + "\t" + media.get(i).getIsbn() + "\t" + media.get(i).getEdition() + "\t" + media.get(i).getVolume() + "\t*\t*\n";

            }

            if (type.equals("m")) {
                aggregate += String.valueOf(media.get(i).getMediaId()) + "\t" + media.get(i).getMediaTitle() + "\t\t" + media.get(i).getMediaCost()
                        + "\t" + media.get(i).getMediaYear() + "\t" + media.get(i).getGenre() + "\t\tMovie\t" + media.get(i).getQuantity() + "\t*\t\t" + media.get(i).getMovie_Code() + "\t*\t*\t"
                        + media.get(i).getRunning_time() + "\t" + media.get(i).getDirector() + "\n";

            }
            if (type.equals("a")) {
                aggregate += String.valueOf(media.get(i).getMediaId()) + "\t" + media.get(i).getMediaTitle() + "\t\t" + media.get(i).getMediaCost()
                        + "\t" + media.get(i).getMediaYear() + "\t" + media.get(i).getDocumentType() + "\t\tEbook\t" + media.get(i).getQuantity() + "\t" + media.get(i).get_Ebook_Publisher()
                        + "\t\t" + media.get(i).getEbook_ISBN() + "\t*\t*\t*\t*\n";

            }

        }

        return aggregate;
    }

}

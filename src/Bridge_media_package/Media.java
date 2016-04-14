package Bridge_media_package;

import Jdbc_media_package.MediaJdbcClass;
import java.util.ArrayList;

/**
 * Media is the abstract base class for all media material existing in the
 * library system.
 * <p>
 * The Media class encapsulates all state information common among all different
 * types of Media. These state information includes: </p>
 * <ul>
 * <li>A unique Media ID</li>
 * <li>Title</li>
 * <li>Publishing year</li>
 * </ul>
 *
 * @author <a href="jessicacarneiro@ufmg.br">Jéssica Carneiro</a>
 * @version 1.0.0
 */
public abstract class Media {

    private String mediaId;
    private String mediaTitle;
    private String mediaYear;
    private String mediaCost;

    private MediaJdbcClass mjc = new MediaJdbcClass();

    /**
     * Constructor for Media.
     *
     * @param id Media unique identifier
     * @param title Media title
     * @param year Media publishing year
     * @param cost Media cost
     */
    public Media(String id, String title, String year, String cost) {

    }

    /**
     * This methods adds a new media to the catalog.
     *
     * @return Boolean values shows if the insertion was successful or not
     */
    public boolean addMedia() {
        //  mjc.add_media(this);
        return false;
    }

    /**
     * This method edits an existing media in the catalog. Each subtype class
     * will have their own implementation of this method
     *
     * @param media_id Media_id
     * @param attribute attribute to edit
     * @param new_value new value provided to that attribute
     */
    public void editMedia(String media_id, String attribute, String new_value) {
        // Media m=searchMedia(media_id);
        //switch statement to check confirm right attribute and then put the new value
        // mjc.editMedia(this, media_id, attribute, new_value);
    }

    /**
     * This methods deletes an existing media from the catalog.
     *
     * @param Media_id Media id to delete
     * @return boolean shows if media is deleted successfully
     *
     */
    public boolean deleteMedia(String Media_id) {

        return false;
    }

    /**
     * This method will perform a search in the catalog.
     *
     * @param attribute attribute that serves as the key for our search
     *
     *
     * @return Media object that was targeted by search method trying to search.
     */
    public ArrayList<Media> searchMedia(String attribute) {

        return (mjc.searchMedia(this, attribute));

    }

    /**
     * This method displays all media in the table
     */
    public void browseMedia() {

    }
    
    /**
     * This methods performs a reservation of a media to a patron account.
     * 
     * @param patronId Patron's Id
     * @return an object of type ReservationList
     */
    public ReservationList reserveMedia(String patronId) {
        ReservationList reserved = new ReservationList(this);
        return reserved;
    }
    
    /**
     * Returns the Media ID
     *
     * @return mediaId Media unique identifier
     */
    public String getMediaId() {
        return mediaId;
    }

    /**
     * Returns the Media title
     *
     * @return mediaTitle Media title
     */
    public String getMediaTitle() {
        return mediaTitle;
    }

    /**
     * Returns the Media publication year
     *
     * @return mediaYear Publication year in format YYYY
     */
    public String getMediaYear() {
        return mediaYear;
    }

    /**
     * Returns the Media cost
     *
     * @return mediaCost Cost of media in US$
     */
    public String getMediaCost() {
        return mediaCost;
    }

    /**
     * Sets the Media Id
     *
     * @param id Media unique identifier
     */
    public void setMediaId(String id) {
    }

    /**
     * Sets the Media title
     *
     * @param title Media title
     */
    public void setMediaTitle(String title) {
    }

    /**
     * Sets the Media publication year
     *
     * @param year Publication year in format YYYY
     */
    public void setMediaYear(String year) {
    }

    /**
     * Sets the Media cost
     *
     * @param cost Cost of media in US$
     */
    public void setMediaCost(String cost) {
    }

}

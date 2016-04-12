package media_mgt;

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
    private double mediaCost;

    /**
     * Constructor for Media.
     *
     * @param id Media unique identifier
     * @param title Media title
     * @param year Media publishing year
     * @param cost Media cost
     */
    Media(String id, String title, String year, double cost) {
    }

    /**
     * This methods adds a new media to the catalog.
     *
     */
    public void addMedia() {
    }
    
    /**
     * This methods edits an existing media in the catalog.
     *
     */
    public void editMedia() {
    }
    
    /**
     * This methods deletes an existing media from the catalog.
     *
     */
    public void deleteMedia() {
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
    public double getMediaCost() {
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
    public void setMediaCost(double cost) {
    }
}

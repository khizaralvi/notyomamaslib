package library.media;

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
 * <li>Media cost</li>
 * </ul>
 *
 * @author <a href="jessicacarneiro@ufmg.br">Jéssica Carneiro</a>
 */
public abstract class Media {

    private String mediaId;
    private String mediaTitle;
    private String mediaYear;
    private String mediaCost;
    private char mediaType; // Media types: A (Academic), B (Book), M (Movie)
    private int quantity;

    /**
     * Constructor for Media.
     *
     * @param id Media unique identifier
     * @param title Media title
     * @param year Media publishing year
     * @param cost Media cost
     * @param type Type of Media
     * @param quantity amount of media available
     */
    public Media(String id, String title, String year, String cost, 
            char type, int quantity) {
    }

    /**
     * Returns the Media ID
     *
     * @return Media unique identifier
     */
    public String getMediaId() {
        return mediaId;
    }

    /**
     * Sets the Media Id
     *
     * @param id Media unique identifier
     */
    public void setMediaId(String id) {
    }

    /**
     * Returns the Media title
     *
     * @return Media title
     */
    public String getMediaTitle() {
        return mediaTitle;
    }

    /**
     * Sets the Media title
     *
     * @param title Media title
     */
    public void setMediaTitle(String title) {
    }

    /**
     * Returns the Media publication year
     *
     * @return Publication year in format YYYY
     */
    public String getMediaYear() {
        return mediaYear;
    }

    /**
     * Sets the Media publication year
     *
     * @param year Publication year in format YYYY
     */
    public void setMediaYear(String year) {
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
     * Sets the Media cost
     *
     * @param cost Cost of media in US$
     */
    public void setMediaCost(String cost) {
    }

    /**
     * Returns the type of media. Media types: A (Academic), B (Book), M (Movie)
     *
     * @return a char indicating which type of Media is this.
     */
    public char getMediaType() {
        return mediaType;
    }

    public void setMediaType(char mediaType) {
    }

    /**
     * toString() method to print Media details
     *
     * @return string with all attributes of Media
     */
    @Override
    public String toString() {
        return "";
    }

    /**
     * equals method to compare two Media objects.
     *
     * @param m Media object
     * @return true if same object, false otherwise.
     */
    public boolean equals(Media m) {
        return m.mediaId.equals(this.mediaId);
    }
}

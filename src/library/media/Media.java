package library.media;

import java.util.ArrayList;

/**
 * Media is the base class for all media material existing in the library
 * system.
 * <p>
 * The Media class encapsulates all state information common among all different
 * types of Media. This state information includes: </p>
 * <ul>
 * <li>A unique Media ID</li>
 * <li>Title</li>
 * <li>Publishing year</li>
 * <li>Media cost</li>
 * </ul>
 *
 * @author <a>Adil Imam</a>
 */
public class Media {

    private int mediaId;
    private String mediaTitle;
    private String mediaYear;
    private double mediaCost;
    private String mediaType; // Media types: A (Academic), B (Book), M (Movie)
    private int quantity;
    private String mediaCategory;

    /**
     * Default Constructor.
     */
    public Media() {
    }

    /**
     * Constructor for Media.
     *
     * @param id Media unique identifier
     * @param title Media title
     * @param year Media publishing year
     * @param cost Media cost
     * @param type Type of Media
     * @param quantity amount of media available
     * @param category
     */
    public Media(int id, String title, String year, double cost,
            String type, int quantity, String category) {

        this.mediaId = id;
        this.mediaTitle = title;
        this.mediaYear = year;
        this.mediaType = type;
        this.quantity = quantity;
        this.mediaCost = cost;
        this.mediaCategory = category;
    }

    /**
     * Returns the Media ID
     *
     * @return Media unique identifier
     */
    public int getMediaId() {
        return mediaId;
    }

    /**
     * Sets the Media Id
     *
     * @param id Media unique identifier
     */
    public void setMediaId(int id) {
        this.mediaId = id;
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
        this.mediaTitle = title;
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
        this.mediaYear = year;
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
     * Sets the Media cost
     *
     * @param cost Cost of media in US$
     *
     */
    public void setMediaCost(double cost) {
        this.mediaCost = cost;
    }

    /**
     * Returns the type of media. Media types: A (Academic), B (Book), M (Movie)
     *
     * @return a char indicating which type of Media is this.
     */
    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * Sets media type. Media types: A (Academic), B (Book), M (Movie)
     *
     * @param mediaType a char indicating which type of Media is this.
     */
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    /**
     * Returns quantity available for media.
     *
     * @return quantity available.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets quantity available of Media.
     *
     * @param q available quantity
     */
    public void setQuantity(int q) {
        this.quantity = q;
    }

    public void setCategory(String category) {
        this.mediaCategory = category;
    }

    public String getCategory() {
        return this.mediaCategory;
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

    public String getIsbn() {
        return null;
    }

    /**
     * Sets the ISBN code
     *
     * @param isbn ISBN code
     * @return boolean
     */
    public void setIsbn(String isbn) {

    }

    /**
     * Returns the book edition
     *
     * @return book edition
     */
    public String getEdition() {
        return null;
    }

    /**
     * Sets the book edition
     *
     * @param edition book edition
     * @return boolean
     */
    public void setBookEdition(String volume) {
    }

    /**
     * Returns the book volume
     *
     * @return book volume
     */
    public String getVolume() {
        return null;
    }

    /**
     * Sets the book volume
     *
     * @param volume book volume
     * @return true if volume is set successfully o false otherwise
     */
    public void setBookVolume(String volume) {
    }

    /**
     * Returns the number of pages
     *
     * @return number of pages
     */
    public String getNumOfPagesOfBooks() {
        return null;
    }

    /**
     * Returns the publisher name.
     *
     * @return publisher name
     */
    public String getPublisher() {
        return null;
    }

            /**
     * Sets the publisher name
     *
     * @param publisher publisher name
     * @return boolean
     */
    public void setPublisher(String publisher) {
    }

    /**
     * Returns all the authors for the book.
     *
     * @return an ArrayList of strings with the name of all authors.
     */
    public ArrayList<String> getAuthors() {
        return null;
    }

    /**
     * Returns the director name.
     *
     * @return director name
     */
    public String getDirector() {
        return null;
    }

    /**
     * Sets director name.
     *
     * @param director director name
     */
    public void setDirector(String director) {

    }

    /**
     * Returns all main actors.
     *
     * @return an ArrayList of strings with name of main actors
     */
    public ArrayList<String> getActors() {
        return null;
    }

    /**
     * Sets list of main actors.
     *
     * @param actors an ArrayList of strings with name of main actors
     * @return true if actors are set successfully or false otherwise
     */
    public boolean setActors(ArrayList<String> actors) {
        return false;
    }

    /**
     * Returns the duration of the movie.
     *
     * @return duration of movie in minutes
     */
    public String getRunning_time() {
        return null;
    }

    /**
     * Sets the duration of the movie.
     *
     * @param running_time duration of movie in minutes
     * @return true if running_time is set successfully or false otherwise
     */
    public boolean setRunning_time(String running_time) {
        return true;
    }

    public void setAcademicPublisher(String publisher) {
    }

    /**
     * Sets the publisher name.
     *
     * @return ""
     */
    public String getAcademicPublisher() {
        return "";
    }

    /**
     * Returns a list with all authors.
     *
     * @return an ArrayList of strings with all authors.
     */
    public ArrayList<String> getAuthors_of_Ebook() {
        return null;
    }

    /**
     * Sets authors of academic material.
     *
     * @param authors an ArrayList of strings with the name of all authors.
     * @return boolean
     */
    public void setAuthors(ArrayList<String> authors) {

    }

    public String getAcademicISBN() {
        return null;
    }

    public String getMovie_Code() {
        return null;
    }

    public void setAcademicISBN(String str) {

    }

}

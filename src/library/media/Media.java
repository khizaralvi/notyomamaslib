package library.media;

import java.util.ArrayList;

/**
 * Media is the base class for all media material existing in the
 * library system.
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

    private String mediaId;
    private String mediaTitle;
    private String mediaYear;
    private String mediaCost;
    private String mediaType; // Media types: A (Academic), B (Book), M (Movie)
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
            String type, int quantity) {
        
        this.mediaId=id;
        this.mediaTitle=title;
        this.mediaYear=year;
        this.mediaType=type;
        this.quantity=quantity;
        this.mediaCost=cost;
        
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
     * @return true if mediaId is set successfully or false otherwise
     */
    public boolean setMediaId(String id) {
    return true;
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
     * @return true if MediaTitle is set successfully or false otherwise
     */
    public boolean setMediaTitle(String title) {
    return true;
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
     * @return true if mediaYear is set successfully or false otherwise
     */
    public boolean setMediaYear(String year) {
    return true;
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
     * @return true if mediaCOst is set successfully or false otherwise
     * 
     */
    public boolean setMediaCost(String cost) {
    return true;
    }

    /**
     * Returns the type of media. Media types: A (Academic), B (Book), M (Movie)
     *
     * @return a char indicating which type of Media is this.
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Sets media type. Media types: A (Academic), B (Book), M (Movie)
     * 
     * @param mediaType a char indicating which type of Media is this.
     * @return true when mediaType is set successfully or false otherwise
     */
    public boolean setMediaType(char mediaType) {
    return true;
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
     * @return true if quantity is set successfully of false otherwise
     */
    public boolean setQuantity(int q) {
        return true;
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

   public String getIsbn()
   {
    return null;
   }
    /**
     * Sets the ISBN code
     *
     * @param isbn ISBN code
     * @return boolean
     */

    public boolean setIsbn(String isbn)
    {
    return true;
    }

    /**
     * Returns the book edition
     *
     * @return book edition
     */
    public String getEdition()
    {
      return null;
    }
    /**
     * Sets the book edition
     *
     * @param edition book edition
     * @return true if edition is set successfully or false otherwise
     */
    public boolean setEdition(int edition){return true;}

    /**
     * Returns the book volume
     *
     * @return book volume
     */
    public String getVolume(){return null;}

    /**
     * Sets the book volume
     *
     * @param volume book volume
     * @return true if volume is set successfully o false otherwise
     */
    public boolean setVolume(int volume)
    {
    return true;
    }

    /**
     * Returns the number of pages
     *
     * @return number of pages
     */
    
     public String getNumOfPages_of_Books()
     {
      return null;
     }

    /**
     * Returns the publisher name.
     *
     * @return publisher name
     */
    public String getPublisher()
    {
     return null;
    }
    /**
     * Sets the publisher name
     *
     * @param publisher publisher name
     * @return true if publisher is set or false otherwise
     */
    public boolean setPublisher(String publisher)
    {
    return true;
    }

    /**
     * Returns all the authors for the book.
     *
     * @return an ArrayList of strings with the name of all authors.
     */
    public  ArrayList<String> getAuthors()
    {
    return null;
    }
    /**
     * Sets the authors list for the book.
     *
     * @param authors an ArrayList of strings with the name of all authors.
     * @return true if authors are set successfully or false otherwise
     */
   public boolean setAuthors(ArrayList<String> authors)
   {
       return true;
   }

   public String getGenre()
   {
   return null;
   }

    /**
     * Sets genre of movie.
     *
     * @param genre genre of movie
     * @return true if genre is set successfully or false otherwise
     */
    public boolean setGenre(String genre)
    {
    return true;
    }

    /**
     * Returns the director name.
     *
     * @return director name
     */
    public String getDirector()
    {
      return null;
    }

    /**
     * Sets director name.
     *
     * @param director director name
     * @return true if director is set successfully or false otherwise
     */
    public boolean setDirector(String director)
    {
    return true;
    }

    /**
     * Returns all main actors.
     *
     * @return an ArrayList of strings with name of main actors
     */
   public ArrayList<String> getActors()
   {
   return null;
   }

    /**
     * Sets list of main actors.
     *
     * @param actors an ArrayList of strings with name of main actors
     * @return true if actors are set successfully or false otherwise
     */
    public boolean setActors(ArrayList<String> actors)
    {    
    return false;
    }
    /**
     * Returns the duration of the movie.
     *
     * @return duration of movie in minutes
     */
    public String getRunning_time()
    {
     return null;
    }

    /**
     * Sets the duration of the movie.
     *
     * @param running_time duration of movie in minutes
     * @return true if running_time is set successfully or false otherwise
     */
    public boolean setRunning_time(String running_time)
    {
        return true;
    }

    
    public String get_Ebook_Publisher()
    {
    return null;
    }
    /**
     * Sets the publisher name.
     *
     * @param publisher publisher name
     * @return true if EBook_publisher is set successfully or false otherwise
     */
   public boolean set_Ebook_Publisher(String publisher)
   {
       return true;
   }

    /**
     * Returns number of pages.
     *
     * @return number of pages.
     */
   public String getNumberOfPages_of_Ebook()
   {
    return null;
   }

    /**
     * Sets number of pages.
     *
     * @param numberOfPages number of pages
     * @return true if numberOfPages_of_EBook are set successfully or false otherwise
     */
    public boolean setNumberOfPages_of_Ebook(String numberOfPages)
    {
    return true;
    }

    /**
     * Returns a list with all authors.
     *
     * @return an ArrayList of strings with all authors.
     */
    public ArrayList<String> getAuthors_of_Ebook()
    {
      return null;
    }
    

    /**
     * Sets authors of academic material.
     *
     * @param authors an ArrayList of strings with the name of all authors.
     * @return true if authors are set successfully
     */
    public boolean setAuthors_of_Ebook(ArrayList<String> authors)
    {
    return true;
    }

    /**
     * Returns the type of academic material. These type could be journal,
     * these, dissertation.
     *
     * @return document type
     */
    public String getDocumentType()
    {
    return null;
    }

    /**
     * Sets the type of academic material. These type could be journal, these,
     * dissertation.
     *
     * @param documentType type of document
     * @return true if document type is set successfully or false otherwise
     */
    public boolean setDocumentType(String documentType)
    {
    return true;
    }
    
    
}

package library.media;

import java.util.ArrayList;

/**
 * MediaAcademic is the class for all media material of type academic materials,
 * such as journals, theses, dissertations, etc. It inherits from Media
 * superclass.
 * <p>
 * The MediaAcademic class encapsulates all state information related to
 * academic materials. These state information includes: </p>
 * <ul>
 * <li>Publisher</li>
 * <li>Number of Pages</li>
 * <li>Authors</li>
 * <li>Type of material</li>
 * </ul>
 *
 * @author <a>Adil Imam</a>
 * @version 1.0.0
 */
public class MediaAcademic extends Media {

    private String publisher;
    private String numberOfPages;
    private ArrayList<String> authors;
    private String academicISBN;

    /**
     * LATE_FEE is the amount of money charged in cents per late day by the
     * Patron.
     */
    public static double LATE_FEE = 0.10;

    /**
     * RENEWABLE is true if media can be renewed by the patron, or false
     * otherwise.
     */
    public static boolean RENEWABLE = true;

    /**
     * RENEW_TIMES represents how many times a patron can renew a media.
     */
    public static int RENEW_TIMES = 1;

    /**
     * Default constructor.
     */
    public MediaAcademic() {
        super();
    }

    /**
     * Constructor for MediaAcademic
     *
     * @param id Media unique identifier
     * @param title Media title
     * @param year Media publishing year
     * @param cost Media cost
     * @param publisher Journals publisher
     * @param author Authors list
     * @param numberOfPages Total number of pages of journal
     * @param documentType Document type of the journal
     * @param quantity amount of media available
     * @param ebook_ISBN unique EBOOK_ISBN
     * @param category
     */
    public MediaAcademic(int id, String title, String year, double cost,
            String publisher, ArrayList<String> author,
            String numberOfPages, String documentType, int quantity, String ebook_ISBN,
            String category) {
        super(id, title, year, cost, "a", quantity, category);

        this.authors = author;
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
        this.academicISBN = ebook_ISBN;
    }

    /**
     * Returns the publisher.
     *
     * @return publisher name.
     */
    @Override
    public String getAcademicPublisher() {
        return this.publisher;
    }

    /**
     * Sets the publisher name.
     *
     * @param publisher publisher name
     * @return boolean
     */
    @Override
    public void setAcademicPublisher(String publisher) {
        this.publisher = publisher;
    }

    
    /**
     * Returns a list with all authors.
     *
     * @return an ArrayList of strings with all authors.
     */
    @Override
    public ArrayList<String> getAuthors_of_Ebook() {
        return authors;
    }

    /**
     * Sets authors of academic material.
     *
     * @param authors an ArrayList of strings with the name of all authors.
     * @return boolean
     */
    @Override
    public void setAuthors(ArrayList<String> authors) {
        this.authors=authors;
    }

    /**
     *
     * @return ISBN
     */
    @Override
    public String getAcademicISBN() {
        return this.academicISBN;

    }
    
    /**
     * 
     */
    public void setAcademicISBN(String isbn)
    {
      this.academicISBN=isbn;
    }

    /**
     * toString method for MediaAcademic object.
     *
     * @return string with all detail information about the academic material.
     */
    @Override
    public String toString() {
        return "";
    }
}

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
    private String documentType;
    private String ebook_ISBN;
    
    /**
     * LOAN_PERIOD is the duration of a loan in days.
     */
    public static int LOAN_PERIOD = 28;

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
     */
    public MediaAcademic(int id, String title, String year, String cost,
            String publisher, ArrayList<String> author,
            String numberOfPages, String documentType, int quantity, String ebook_ISBN) {
        super(id,title, year, cost,"a", quantity);
        
    this.authors=author;
    this.documentType=documentType;
    this.publisher=publisher;
    this.numberOfPages=numberOfPages;
    this.ebook_ISBN=ebook_ISBN;
    }

    /**
     * Returns the publisher.
     *
     * @return publisher name.
     */
    
    
    
    @Override
    public String get_Ebook_Publisher() {
        return publisher;
    }

    /**
     * Sets the publisher name.
     *
     * @param publisher publisher name
     * @return boolean
     */
    @Override
    public boolean set_Ebook_Publisher(String publisher) {
    return true;
    }

    /**
     * Returns number of pages.
     *
     * @return number of pages.
     */
    @Override
    public String getNumberOfPages_of_Ebook() {
        return numberOfPages;
    }

    /**
     * Sets number of pages.
     *
     * @param numberOfPages number of pages
     * @return boolean
     */
    @Override
    public boolean setNumberOfPages_of_Ebook(String numberOfPages) {
    return true;
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
    public boolean setAuthors_of_Ebook(ArrayList<String> authors) {
    return true;
    }

    /**
     * Returns the type of academic material. These type could be journal,
     * these, dissertation.
     *
     * @return document type
     */
    @Override
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the type of academic material. These type could be journal, these,
     * dissertation.
     *
     * @param documentType type of document
     * @return boolean
     */
    @Override
    public boolean setDocumentType(String documentType) {
    return true;
    }

    /**
     * 
     * @return ISBN
     */
    @Override
    public String getEbook_ISBN()
    {
    return this.ebook_ISBN;
    
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

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
 * @author <a href="jessicacarneiro@ufmg.br">Jéssica Carneiro</a>
 * @version 1.0.0
 */
public class MediaAcademic extends Media {

    private String publisher;
    private String numberOfPages;
    private ArrayList<String> authors;
    private String documentType;

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
     */
    public MediaAcademic(String id, String title, String year, String cost,
            String publisher, ArrayList<String> author,
            String numberOfPages, String documentType, int quantity) {
        super(id, title, year, cost, 'A', quantity);
    }

    /**
     * Returns the publisher.
     *
     * @return publisher name.
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the publisher name.
     *
     * @param publisher publisher name
     */
    public void setPublisher(String publisher) {
    }

    /**
     * Returns number of pages.
     *
     * @return number of pages.
     */
    public String getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * Sets number of pages.
     *
     * @param numberOfPages number of pages
     */
    public void setNumberOfPages(String numberOfPages) {
    }

    /**
     * Returns a list with all authors.
     *
     * @return an ArrayList of strings with all authors.
     */
    public ArrayList<String> getAuthors() {
        return authors;
    }

    /**
     * Sets authors of academic material.
     *
     * @param authors an ArrayList of strings with the name of all authors.
     */
    public void setAuthors(ArrayList<String> authors) {
    }

    /**
     * Returns the type of academic material. These type could be journal,
     * these, dissertation.
     *
     * @return document type
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the type of academic material. These type could be journal, these,
     * dissertation.
     *
     * @param documentType type of document
     */
    public void setDocumentType(String documentType) {
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

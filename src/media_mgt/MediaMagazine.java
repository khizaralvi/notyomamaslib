package media_mgt;

/**
 * MediaMagazine is the class for all magazines. It inherits from Media
 * superclass.
 * <p>
 * The MediaMagazine class encapsulates all state information related to
 * magazines. These state information includes: </p>
 * <ul>
 * <li>Issue</li>
 * <li>Month</li>
 * <li>Publisher</li>
 * </ul>
 *
 * @author <a href="jessicacarneiro@ufmg.br">Jéssica Carneiro</a>
 * @version 1.0.0
 */
public class MediaMagazine extends Media {

    private int magazineIssue;
    private int magazineMonth;
    private String magazinePublisher;
    private String magazineISSN;

    /**
     * Loan period is the duration of a loan in days.
     */
    public static int LOAN_PERIOD = 14;

    /**
     * Late fee is the amount of money charged in cents per late day by the
     * Patron.
     */
    public static double LATE_FEE = 0.15;

    /**
     * RENEWABLE is true if media can be renewed by the patron, or false
     * otherwise.
     */
    public static boolean RENEWABLE = false;

    /**
     * Constructor for MediaMagazine.
     *
     * @param id Media unique identifier
     * @param title Media title
     * @param year Media publishing year
     * @param cost Media cost
     * @param issue Magazine issue number
     * @param month Magazine month publication
     * @param publisher Magazine publisher name
     * @param issn ISSN code for that magazine
     */
    public MediaMagazine(String id, String title, String year, double cost,
            int issue, int month, String publisher, String issn) {
        super(id, title, year, cost);
    }
    
    /**
     * This methods edits an existing media of type magazine in the catalog.
     * <p>This method receives all editable attributes (all except mediaID) 
     * when the use submits the modifications to update the entry in the 
     * catalog.</p>
     *
     * @param id Media unique identifier
     * @param title Media title
     * @param year Media publishing year
     * @param cost Media cost
     * @param issue Magazine issue number
     * @param month Magazine month publication
     * @param publisher Magazine publisher name
     * @param issn ISSN code for that magazine
     */
    public void editMedia(String id, String title, String year, double cost,
            int issue, int month, String publisher, String issn) {  
    }

    /**
     * Returns magazine issue number. The issue is the number of that specific
     * publication.
     *
     * @return issue number
     */
    public int getIssueNumber() {
        return magazineIssue;
    }

    /**
     * Returns magazine month number [1-12].
     *
     * @return magazine month publication
     */
    public int getMonth() {
        return magazineMonth;
    }

    /**
     * Returns magazine publisher name.
     *
     * @return name of publisher
     */
    public String getPublisher() {
        return magazinePublisher;
    }

    
    /**
     * Returns the ISSN code for the magazine.
     * 
     * @return ISSN code of magazine
     */
    public String getISSN() {
        return magazineISSN;
    }

    /**
     * Sets issue number.
     *
     * @param issue magazine issue number
     */
    public void setIssueNumber(int issue) {
    }

    /**
     * Sets magazine month number [1-12]
     *
     * @param month magazine month publication
     */
    public void setMonth(int month) {
    }

    /**
     * Sets magazine publisher.
     *
     * @param publisher name of publisher
     */
    public void setPublisher(String publisher) {
    }

    /**
     * Sets ISSN code for magazine.
     * 
     * @param issn ISSN code
     */
    public void setISSN(String issn) {
    }

}
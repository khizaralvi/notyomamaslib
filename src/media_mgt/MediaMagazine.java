package media_mgt;

/**
 * MediaMagazine is the class for all magazines. It inherits from Media
 * superclass.
 * <p>
 * The MediaMagazine class encapsulates all state information related to
 * magazines. These state information includes: </p>
 * <ul>
 * <li></li>
 * <li></li>
 * <li></li>
 * </ul>
 *
 * @author <a href="jessicacarneiro@ufmg.br">Jéssica Carneiro</a>
 * @version 1.0.0
 */
public class MediaMagazine extends Media {

    private int magazineIssue;
    private int magazineMonth;

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
     */
    public MediaMagazine(String id, String title, String year, double cost,
            int issue, int month) {
        super(id, title, year, cost);
    }

    /**
     * Adds a new media of type magazine to the catalog.
     *
     */
    @Override
    public void addMedia() {
        super.addMedia();
    }

    /**
     * This methods edits an existing media of type magazine in the catalog.
     *
     */
    @Override
    public void editMedia() {
        super.editMedia();
    }

    /**
     * This methods deletes an existing media of type magazine from the catalog.
     *
     */
    @Override
    public void deleteMedia() {
        super.deleteMedia();
    }

    /**
     * Returns magazine issue number.
     *
     * @return magazineIssue issue number
     */
    public int getIssueNumber() {
        return magazineIssue;
    }

    /**
     * Returns magazine month number [1-12]
     *
     * @return magazineMonth magazine month publication
     */
    public int getMonth() {
        return magazineMonth;
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

}

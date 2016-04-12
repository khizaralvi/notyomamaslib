package media_mgt;


/**
 * MediaCD is the class for all media material of type CDs.
 * It inherits from Media superclass.
 * <p>
 * The MediaCD class encapsulates all state information related to CDs.
 * These state information includes: </p>
 * <ul>
 * <li></li>
 * <li></li>
 * <li></li>
 * </ul>
 *
 * @author <a href="jessicacarneiro@ufmg.br">Jéssica Carneiro</a>
 * @version 1.0.0
 */
public class MediaCD extends Media {

    /**
     * Loan period is the duration of a loan in days.
     */
    public static int LOAN_PERIOD = 14;

    /**
     * Late fee is the amount of money charged in cents per late day by the
     * Patron.
     */
    public static double LATE_FEE = 0.50;

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
     * Constructor for MediaCD
     *
     * @param id Media unique identifier
     * @param title Media title
     * @param year Media publishing year
     * @param cost Media cost
     */
    public MediaCD(String id, String title, String year, double cost) {
        super(id, title, year, cost);
    }

}

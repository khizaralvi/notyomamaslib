
/**
 * MediaMagazine is the class for all magazines.
 * It inherits from Media superclass.
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
     * Constructor for MediaMagazine
     *
     * @param id Media unique identifier
     * @param title Media title
     * @param year Media publishing year
     * @see Media#Media(java.lang.String, java.lang.String, java.lang.String) 
     */
    public MediaMagazine(String id, String title, String year) {
        super(id, title, year);
    }

}

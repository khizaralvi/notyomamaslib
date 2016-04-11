package media_mgt;


/**
 * MediaMovie is the class for all material of type movie.
 * It inherits from Media superclass.
 * <p>
 * The MediaMovie class encapsulates all state information related to movies.
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
public class MediaMovie extends Media {

    /**
     * Loan period is the duration of a loan in days.
     */
    public static int LOAN_PERIOD = 7;

    /**
     * Late fee is the amount of money charged in cents per late day by the
     * Patron.
     */
    public static double LATE_FEE = 2.00;

    /**
     * RENEWABLE is true if media can be renewed by the patron, or false
     * otherwise.
     */
    public static boolean RENEWABLE = false;

    /**
     * Constructor for MediaMovie
     * 
     * @param id Media unique identifier
     * @param title Media title
     * @param year Media publishing year
     * @see Media#Media(java.lang.String, java.lang.String, java.lang.String) 
     */
    public MediaMovie(String id, String title, String year) {
        super(id, title, year);
    }

}

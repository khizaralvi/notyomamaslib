package media_mgt;


/**
 * MediaAcademic is the class for all media material of type academic
 * materials, such as journals, theses, dissertations, etc.
 * It inherits from Media superclass.
 * <p>
 * The MediaAcademic class encapsulates all state information related to academic materials.
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
public class MediaAcademic extends Media {

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
     * @see Media#Media(java.lang.String, java.lang.String, java.lang.String) 
     */
    public MediaAcademic(String id, String title, String year) {
        super(id, title, year);
    }

}

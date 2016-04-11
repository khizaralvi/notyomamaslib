package media_mgt;


/**
 * MediaEletronic is the class for all electronic media, such as eBooks, PDFs, 
 * etc.
 * It inherits from Media superclass.
 * <p>
 * The MediaEletronic class encapsulates all state information related to 
 * electronic materials. These state information includes: </p>
 * <ul>
 * <li></li>
 * <li></li>
 * <li></li>
 * </ul>
 *
 * @author <a href="jessicacarneiro@ufmg.br">Jéssica Carneiro</a>
 * @version 1.0.0
 */
public class MediaEletronic extends Media {

    /**
     * Loan period is the duration of a loan in days.
     */
    public static int LOAN_PERIOD = 14;

    /**
     * RENEWABLE is true if media can be renewed by the patron, or false
     * otherwise.
     */
    public static boolean RENEWABLE = false;

    /**
     * Constructor for MediaEletronic
     *
     * @param id Media unique identifier
     * @param title Media title
     * @param year Media publishing year
     * @see Media#Media(java.lang.String, java.lang.String, java.lang.String) 
     */
    public MediaEletronic(String id, String title, String year) {
        super(id, title, year);
    }

}

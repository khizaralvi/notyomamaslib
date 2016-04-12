package media_mgt;

/**
 * MediaBook is the class for all media material of type book. It inherits from
 * Media superclass.
 * <p>
 * The MediaBook class encapsulates all state information related to books.
 * These state information includes: </p>
 * <ul>
 * <li>ISBN</li>
 * <li>Edition</li>
 * <li>Publisher</li>
 * </ul>
 *
 * @author <a href="jessicacarneiro@ufmg.br">Jéssica Carneiro</a>
 * @version 1.0.0
 */
public class MediaBook extends Media {

    private String bookIsbn;
    private int bookEdition;
    private String bookPublisher;

    /**
     * Loan period is the duration of a loan in days.
     */
    public static int LOAN_PERIOD = 28;

    /**
     * Late fee is the amount of money charged in cents per late day by the
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
    public static int RENEW_TIMES = 2;

    /**
     * Constructor for MediaBook.
     *
     * @param id Media unique identifier
     * @param title Media title
     * @param year Media publishing year
     * @param cost Media cost
     * @param isbn Book ISBN
     * @param edition Book edition as an integer number (1, 2, ...)
     * @param publisher Book publisher name
     */
    public MediaBook(String id, String title, String year, String isbn, int edition, String publisher, double cost) {
        super(id, title, year, cost);
    }

    /**
     * Adds new media of type book to the catalog.
     */
    @Override
    public void addMedia() {
        super.addMedia();
    }

    /**
     * This methods edits an existing media of type book in the catalog.
     *
     */
    @Override
    public void editMedia() {
        super.editMedia();
    }

    /**
     * This methods deletes an existing media of type book from the catalog.
     *
     */
    @Override
    public void deleteMedia() {
        super.deleteMedia();
    }

    /**
     * Returns the ISBN code
     *
     * @return bookIsbn ISBN code
     */
    public String getIsbn() {
        return bookIsbn;
    }

    /**
     * Returns the book edition
     *
     * @return bookEdition book edition
     */
    public int getEdition() {
        return bookEdition;
    }

    /**
     * Returns the publisher name
     *
     * @return bookPublisher publisher name
     */
    public String getPublisher() {
        return bookPublisher;
    }

}

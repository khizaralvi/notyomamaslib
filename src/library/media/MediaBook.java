package library.media;

import java.util.ArrayList;

/**
 * MediaBook is the class for all media material of type book. It inherits from
 * Media superclass.
 * <p>
 * The MediaBook class encapsulates all state information related to books.
 * These state information includes: </p>
 * <ul>
 * <li>ISBN</li>
 * <li>Author(s)</li>
 * <li>Edition</li>
 * <li>Volume</li>
 * <li>Number of pages</li>
 * <li>Publisher</li>
 * </ul>
 *
 * @author <a>Adil Imam</a>
 * @version 1.0.0
 */
public class MediaBook extends Media {

    private String bookIsbn;
    private String bookEdition;
    private String bookVolume;
    private String bookPages;
    private String bookPublisher;
    private ArrayList<String> bookAuthors;
    private String bookGenre;

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
     * @param volume Volume of the book
     * @param pages number of pages of the book
     * @param publisher Book publisher name
     * @param quantity amount of media available
     * @param auth list of authors for the book
     * @param bookGenre genre of the book
     */
    public MediaBook(String id, String title, String year, String isbn,
            String edition, String volume, String pages, String publisher,
            String cost, int quantity, ArrayList<String> auth, String bookGenre) {
        super(id, title, year, cost,"b", quantity);
        
        this.bookEdition=edition;
        this.bookVolume=volume;
        this.bookPages=pages;
        this.bookPublisher=publisher;;
        this.bookIsbn=isbn;
        this.bookAuthors=auth;
        this.bookGenre=bookGenre;
        
    }

    /**
     * Returns the ISBN code
     *
     * @return ISBN code
     */
    @Override
    public String getIsbn() {
        return bookIsbn;
    }

    /**
     * Sets the ISBN code
     *
     * @param isbn ISBN code
     * @return boolean
     */
    @Override
    public boolean setIsbn(String isbn) {
    return true;
    }

    /**
     * Returns the book edition
     *
     * @return book edition
     */
    @Override
    public String getEdition() {
        return bookEdition;
    }

    /**
     * Sets the book edition
     *
     * @param edition book edition
     * @return boolean
     */
    @Override
    public boolean setEdition(int edition) {
    return true;
    }

    /**
     * Returns the book volume
     *
     * @return book volume
     */
    @Override
    public String getVolume() {
        return bookVolume;
    }

    /**
     * Sets the book volume
     *
     * @param volume book volume
     * @return boolean
     */
    @Override
    public boolean setVolume(int volume) {
    return true;
    }

    /**
     * Returns the number of pages
     *
     * @return number of pages
     */
    @Override
    public String getNumOfPages_of_Books() {
        return bookPages;
    }

    /**
     * Returns the publisher name.
     *
     * @return publisher name
     */
    @Override
    public String getPublisher() {
        return bookPublisher;
    }

    /**
     * Sets the publisher name
     *
     * @param publisher publisher name
     * @return boolean
     */
    @Override
    public boolean setPublisher(String publisher) {
    return true;
    }

    /**
     * Returns all the authors for the book.
     *
     * @return an ArrayList of strings with the name of all authors.
     */
    @Override
    public ArrayList<String> getAuthors() {
        return bookAuthors;
    }

    /**
     * Sets the authors list for the book.
     *
     * @param authors an ArrayList of strings with the name of all authors.
     * @return boolean
     */
    @Override
    public boolean setAuthors(ArrayList<String> authors) {
    return true;
    }

    /**
     * toString method for MediaBook object.
     *
     * @return string with all detail information about the book.
     */
    @Override
    public String toString() {
        return "";
    }

    @Override
    public String getBookGenre() {
        return bookGenre;
    }



}
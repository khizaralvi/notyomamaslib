package library.media;

import java.util.ArrayList;

/**
 * MediaCD is the class for all media material of type CDs. It inherits from
 * Media superclass.
 * <p>
 * The MediaCD class encapsulates all state information related to CDs. These
 * state information includes: </p>
 * <ul>
 * <li></li>
 * <li></li>
 * <li></li>
 * </ul>
 *
 * @author <a href="abasit1@oldwestbury.edu">Abdul Basit</a>
 * @version 1.0.0
 */
public class MediaCD extends Media {

    private ArrayList<String> artists;
    private String genre;
    private String album;
    private String total_duration;

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
     * @param artists an ArrayList of strings with the name of all artists
     * @param genre genre of the cd
     * @param album cd's album name
     * @param total_duration length of playback
     */
    public MediaCD(String id, String title, String year, String cost,
            ArrayList<String> artists, String genre, String album,
            String total_duration) {
        super(id, title, year, cost);
    }

    /**
     * Returns all of the artists for the cd.
     *
     * @return an ArrayList of strings with the name of all artists
     */
    public ArrayList<String> getArtists() {
        return artists;
    }

    /**
     * Sets the lists of artists for the cd.
     *
     * @param artists an ArrayList of strings with the name of all artists
     */
    public void setArtists(ArrayList<String> artists) {

    }

    /**
     * Returns the genre of the cd
     *
     * @return genre of cd
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets the genre of the cd.
     *
     * @param genre genre of the cd
     */
    public void setGenre(String genre) {

    }

    /**
     * Returns the cd's album name
     *
     * @return album of cd
     */
    public String getAlbum() {
        return album;
    }

    /**
     * Sets the cd's album name
     *
     * @param album cd's album name
     */
    public void setAlbum(String album) {

    }

    /**
     * Returns the length of duration
     *
     * @return length of duration
     */
    public String getTotal_duration() {
        return total_duration;
    }

    /**
     * Sets the length of the duration
     *
     * @param total_duration length of playback
     */
    public void setTotal_duration(String total_duration) {

    }

}

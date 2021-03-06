package library.media;

import java.util.ArrayList;

/**
 * MediaMovie is the class for all material of type movie. It inherits from
 * Media superclass.
 * <p>
 * The MediaMovie class encapsulates all state information related to movies.
 * These state information includes: </p>
 * <ul>
 * <li>Genre</li>
 * <li>Director</li>
 * <li>Actors</li>
 * <li>Running time</li>
 * </ul>
 *
 * @author <a>Adil Imam</a>
 * @version 1.0.0
 */
public class MediaMovie extends Media {

    private String director;
    private String running_time;

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
     * Default constructor.
     */
    public MediaMovie() {
        super();
    }

    /**
     * Constructor for MediaMovie
     *
     * @param id Media unique identifier
     * @param title Media title
     * @param year Media publishing year
     * @param cost Media cost
     * @param Moviegenre Media genre
     * @param director Director name
     * @param running_time Duration in minutes
     * @param movie_code unique code for each movie
     * @param quantity amount of media available
     */
    public MediaMovie(int id, String title, String year, double cost,
            String director,
            String running_time, int quantity,
            String category) {
        super(id, title, year, cost, "M", quantity, category);
        this.director = director;
        this.running_time = running_time;
    }

    /**
     * Returns the director name.
     *
     * @return director name
     */
    @Override
    public String getDirector() {
        return director;
    }

    /**
     * Sets director name.
     *
     * @param director director name
     */
    @Override
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * Returns all main actors.
     *
     * @return an ArrayList of strings with name of main actors
     */
    /**
     * Returns the duration of the movie.
     *
     * @return duration of movie in minutes
     */
    @Override
    public String getRunning_time() {
        return running_time;
    }

    /**
     * Sets the duration of the movie.
     *
     * @param running_time duration of movie in minutes
     * @return boolean
     */
    @Override
    public boolean setRunning_time(String running_time) {
        this.running_time = running_time;
        return true;
    }
    



    /**
     * toString method for MediaMovie object.
     *
     * @return string with all detail information about the movie.
     */
    @Override
    public String toString() {
        return "";
    }
}

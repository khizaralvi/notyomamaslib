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

    private String Movie_genre;
    private String director;
    private String running_time;
    private String movie_code;
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
     * @param cost Media cost
     * @param Moviegenre Media genre
     * @param director Director name
     * @param actors List of main actors
     * @param running_time Duration in minutes
     * @param quantity amount of media available
     */
    public MediaMovie(String id, String title, String year, String cost,
            String Moviegenre, String director,
            String running_time, int quantity)
    {
       super(id, title, year, cost,"m", quantity);
       this.Movie_genre=Moviegenre;
       this.director=director;
    
       this.running_time=running_time;       
       this.movie_code=id;
    }

    /**
     * Returns genre of movie.
     *
     * @return genre of movie
     */
    @Override
    public String getGenre() {
        return Movie_genre;
    }

    /**
     * Sets genre of movie.
     *
     * @param genre genre of movie
     * @return boolean
     */
    @Override
    public boolean setGenre(String genre) {
       this.Movie_genre=genre;
       return true;
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
     * @return boolean
     */
    @Override
    public boolean setDirector(String director) {
    return true;
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
    * 
     * @return 
    */
  
    @Override
     public String getMovie_Code()
    {
        return this.movie_code;
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
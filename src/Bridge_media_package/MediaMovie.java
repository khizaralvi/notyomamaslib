package Bridge_media_package;

import java.util.ArrayList;


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

      private String genre;
      private String director;
      private ArrayList<String> actors;
      private String running_time;
      
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
     */
    public MediaMovie(String id, String title, String year,String cost,String genre,String director,ArrayList<String> actors, String running_time) {
        super(id, title, year, cost);
        this.actors=actors;
        this.director=director;
        this.genre=genre;
        this.running_time=running_time;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<String> getActors() {
        return actors;
    }

    public void setActors(ArrayList<String> actors) {
        this.actors = actors;
    }

    public String getRunning_time() {
        return running_time;
    }

    public void setRunning_time(String running_time) {
        this.running_time = running_time;
    }
    
    
    
    
    

}

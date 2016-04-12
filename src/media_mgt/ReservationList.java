package media_mgt;

/**
 * ReservationList is the class that implements a list of reservations made 
 * by the users. 
 * 
 * @author <a href="jessicacarneiro@ufmg.br">Jéssica Carneiro</a>
 * @version 1.0.0
 */
public class ReservationList extends Media {
    
    /**
     * Constructor for ReservationList.
     * 
     * @param id Media unique identifier
     * @param title Media title
     * @param year Media publishing year
     * @param cost Media cost
     */
    public ReservationList(String id, String title, String year, double cost) {
        super(id, title, year, cost);
    }
    
}

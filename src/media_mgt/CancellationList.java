package media_mgt;

/**
 * CancellationList is the class that implements a list of canceled 
 * reservations made by the users.
 * 
 * @author <a href="jessicacarneiro@ufmg.br">Jéssica Carneiro</a>
 * @version 1.0.0
 */
public class CancellationList extends Media {
    
    /**
     * Constructor for CancellationList
     * 
     * @param id Media unique identifier
     * @param title Media title
     * @param year Media publishing year
     * @param cost Media cost
     */
    public CancellationList(String id, String title, String year, double cost) {
        super(id, title, year, cost);
    }
    
}

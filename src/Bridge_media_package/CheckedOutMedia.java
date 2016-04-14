package Bridge_media_package;

/**
 * CheckedOutMedia is the class that implements a media that was borrowed
 * by a specific user. It will store state information relevant to this
 * operation. 
 * 
 * @author <a href="jessicacarneiro@ufmg.br">Jéssica Carneiro</a>
 * @version 1.0.0
 */
public class CheckedOutMedia extends Media {

    /**
     * Constructor for CheckedOutMedia.
     * 
     * @param id Media unique identifier
     * @param title Media title
     * @param year Media publishing year
     * @param cost Media cost
     */
    public CheckedOutMedia(String id, String title, String year, String cost) {
        super(id, title, year, cost);
    }

}

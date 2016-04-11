package media_mgt;

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
     * @see Media#Media(java.lang.String, java.lang.String, java.lang.String) 
     */
    public CheckedOutMedia(String id, String title, String year) {
        super(id, title, year);
    }

}

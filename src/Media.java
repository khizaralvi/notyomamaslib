/**
 * Media is the abstract base class for all media material
 * existing in the library system. 
 * <p>The Media class encapsulates all state information common
 * among all different types of Media. These state information
 * includes: </p>
 * <ul>
 * <li>A unique Media ID</li>
 * <li>Media's title</li>
 * <li>Media's publishing year</li>
 * </ul>
 * @author <a href="jessicacarneiro@ufmg.br">Jéssica Carneiro</a>
 * @version 1.0.0
 */

public abstract class Media {
    private String mediaId; 
    private String mediaTitle;
    private String mediaYear;
    
    /**
     * Default constructor for Media.
     */
    Media () {
        
    }
}

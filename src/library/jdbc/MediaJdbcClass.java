package library.jdbc;

import library.media.Media;
import java.sql.*;
import java.util.ArrayList;
import library.media.Reservation;

/**
 * The MediaJdbcClass is the bridge between the MediaCollection and the JDBC 
 * (database). This class implements all communications with the database 
 * related to the functions of MediaCollection.
 * 
 * @author <a href="mailto:jessicacarneiro@ufmg.br">Jéssica Carneiro</a>
 */
public class MediaJdbcClass {

    private Media m = null;
    private Connection con = null;
    private ResultSet rs = null;
    private Statement statement = null;
    private PreparedStatement prepared = null;

    /**
     * Constructor for MediaJdbcClass.
     */
    public MediaJdbcClass() {
    }

    /**
     * This methods adds a new media to the catalog.
     *
     * @param m Media to be added
     * @return true if the insertion was successful or false otherwise
     */
    public boolean addMedia(Media m) {
        return true;
    }

    /**
     * This method edits an existing media in the catalog. Each subtype class
     * will have their own implementation of this method
     *
     * @param editedMedia Media object with all modifications
     * @return true if the edition was successful or false otherwise
     */
    public boolean editMedia(Media editedMedia) {
        return true;
    }

    /**
     * This methods deletes an existing media from the catalog.
     *
     * @param mediaId Media id to delete
     * @return boolean if media was deleted successfully, false otherwise
     */
    public boolean deleteMedia(String mediaId) {
        return true;
    }

    /**
     * This method will perform a search in the catalog.
     *
     * @param attribute attribute that serves as the key for search
     * @param value value typed by user to perform search
     * @return an ArrayList of Media with all entries retrieved from the search
     */
    public ArrayList<Media> searchMedia(String attribute, String value) {
        ArrayList<Media> resultSet = new ArrayList<>();
        return resultSet;
    }

}

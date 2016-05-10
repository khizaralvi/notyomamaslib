/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import library.jdbc.MediaJdbcClass;
import library.media.Media;
import library.media.MediaAcademic;
import library.media.MediaBook;
import library.media.MediaCollection;
import library.media.MediaMovie;

/**
 *
 * @author Adil Imam
 */
public class MediaJdbcTest {

    MediaJdbcClass media = new MediaJdbcClass();

    MediaCollection collection = new MediaCollection();

    public static void main(String[] args) throws SQLException {

        // media.connect();
        //Media m1=m;
        ArrayList<String> arr = new ArrayList();
        arr.add("Naresh Gupta");
        arr.add("Darren lehman");

        // MediaMovie m2=new MediaMovie("04905","Into the wild","2009","25","Action","Ridley Scott","150",9);
        //MediaAcademic m3=new MediaAcademic("42545","Advanced Java","2004","150","Doritos",arr,"232","pdf",23);
        //new MediaJdbcTest().testAdd(m2);
        new MediaJdbcTest().testSearch(1, "2012");
        new MediaJdbcTest().testSearch(2, "Naresh Gupta");
        new MediaJdbcTest().testSearch(3, "Database Systems");
        new MediaJdbcTest().testSearch(4, "Science");
        new MediaJdbcTest().testSearch(5, "11");

        /// media.addMedia(m3);
        // MediaBook m=new MediaBook("35436","Database Systems","2012","12314","4th","3rd","780","St Johns","150",15,arr,"Science");
        //media.addMedia(m);
        //collection =media.searchMedia(2,"Darren lehman");
        //collection= media.searchMedia(4,"Science");
//collection =media.searchMedia("mediaCategory","Science");
//collection = media.Browse_Media();
    }

    public void testAdd(Media m) {
        try {
            media.addMedia(m);
        } catch (SQLException ex) {
            Logger.getLogger(MediaJdbcTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void testSearch(int i, String val) {

        collection = media.searchMedia(i, val);
        System.out.println("MediaId       Title            Cost     Year     Genre     MediaType   Quantity  Publisher  MediaCode Edition  Volume RunningTime  Director");
        System.out.println(collection.toString());

    }

}

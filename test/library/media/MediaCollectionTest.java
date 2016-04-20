/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.media;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jessicacarneiro
 */
public class MediaCollectionTest {
    
    public MediaCollectionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMedia method, of class MediaCollection.
     */
    @Test
    public void testGetMedia() {
        System.out.println("getMedia");
        MediaCollection instance = null;
        ArrayList<Media> expResult = null;
        ArrayList<Media> result = instance.getMedia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMedia method, of class MediaCollection.
     */
    @Test
    public void testSetMedia() {
        System.out.println("setMedia");
        ArrayList<Media> media = null;
        MediaCollection instance = null;
        instance.setMedia(media);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addMedia method, of class MediaCollection.
     */
    @Test
    public void testAddMedia() {
        System.out.println("addMedia");
        Media m = null;
        MediaCollection instance = null;
        boolean expResult = false;
        boolean result = instance.addMedia(m);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of editMedia method, of class MediaCollection.
     */
    @Test
    public void testEditMedia() {
        System.out.println("editMedia");
        Media editedMedia = null;
        MediaCollection instance = null;
        boolean expResult = false;
        boolean result = instance.editMedia(editedMedia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteMedia method, of class MediaCollection.
     */
    @Test
    public void testDeleteMedia() {
        System.out.println("deleteMedia");
        String mediaId = "";
        MediaCollection instance = null;
        boolean expResult = false;
        boolean result = instance.deleteMedia(mediaId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of searchMedia method, of class MediaCollection.
     */
    @Test
    public void testSearchMedia() {
        System.out.println("searchMedia");
        String attribute = "";
        String value = "";
        MediaCollection instance = null;
        ArrayList<Media> expResult = null;
        ArrayList<Media> result = instance.searchMedia(attribute, value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of reserveMedia method, of class MediaCollection.
     */
    @Test
    public void testReserveMedia() {
        System.out.println("reserveMedia");
        String patronId = "";
        String mediaId = "";
        MediaCollection instance = null;
        Reservation expResult = null;
        Reservation result = instance.reserveMedia(patronId, mediaId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class MediaCollection.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        MediaCollection instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

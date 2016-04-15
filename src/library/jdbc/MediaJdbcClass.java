/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.jdbc;

import library.media.Media;
import library.media.MediaAcademic;
import library.media.MediaBook;
import library.media.MediaCD;
import library.media.MediaEletronic;
import library.media.MediaMagazine;
import library.media.MediaMovie;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Adil Imam
 */
public class MediaJdbcClass{
    
   private Media m=null;
   private Connection con=null;
   private ResultSet rs=null;
   private Statement statement=null;
   private PreparedStatement prepared=null;
   private ArrayList<Media> media;
   private Media media_var;
   private MediaBook media_book;
   private MediaCD media_cd;
   private MediaEletronic media_electronic;
   private MediaMagazine media_megazine;
   private MediaMovie media_movie;
   private MediaAcademic media_academy;
   
   public MediaJdbcClass()
   {
   
   
   }
    
  
   
   /**
    * 
    * @param m an object of reference type Media
    * @return boolean shows if the add media was successful or not 
    */
   public boolean add_media(Media m)
   {
    //  System.out.println(m.getClass().toString());
      //System.out.println("This will store it into database");
    
       //the following steps are done to get the correct subclass to store that to the right table
     // int index=m.getClass().toString().indexOf(".");
      //System.out.println(m.getClass().toString().substring(index+1));
      
        return false;
   
   }
   
   /**
    * 
    * @param Media_id delete the media identified by the given id
    * @return shows if delete was successful or not
    */
   public boolean deleteMedia(String Media_id) {
    
     return false;   
    }
   
   /**
    * 
    * @param m object of reference type Media
    * @param attribute the attribute to search for
    * @return ArrayList of Media
    */
  
 public ArrayList<Media> searchMedia(Media m,String attribute) {

     //you will get the class like that
     // int index=m.getClass().toString().indexOf(".");
     //System.out.println(m.getClass().toString().substring(index+1));
     
     //since result set is a list by itself..it would need a list to be mapped onto
     //that list will be returned back to Media Class
     
        return null;
     
    }
   
 /**
  * 
  * @param media_id
  * @param attribute
  * @param new_value 
  */
 public void editMedia(Media m,String media_id, String attribute, String new_value)
     {
            // Media m=searchMedia(media_id);
                 //switch statement to check confirm right attribute and then put the new value
     }
    
    
}

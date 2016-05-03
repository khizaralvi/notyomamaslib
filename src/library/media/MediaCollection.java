package library.media;

import java.util.ArrayList;

/**
 * MediaCollection is the collection of all Media in the catalog. The
 * MediaColletion will store an array of Media and the total number of available
 * Media in the catalog.
 *
 * @author <a>Adil Imam</a>
 */
public class MediaCollection {

    private ArrayList<Media> media;

    /**
     * Default COnstructor for MediaCollection
     */
    
    public MediaCollection()
    {
    media=new ArrayList();
    
    }
    
    
    /**
     * Parameterized Constructor for MediaCollection.
     *
     * @param media an ArrayList of Media
     */
  
    
    
    public MediaCollection(ArrayList<Media> media) {
    }

    /**
     * Returns the array of Media stored in MediaCollection.
     *
     * @return an ArrayList of Media
     */
    public ArrayList<Media> getMedia() {
        return media;
    }

    /**
     * Sets the ArrayList of Media in MediaCollection.
     *
     * @param media ArrayList of Media
     * @return true if media is set successfully or false otherwise
     */
    public boolean setMedia(ArrayList<Media> media) {
   return false;
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
     * @return Media object that is deleted successfully, otherwise null is returned if the media is not found!!
     */
    public Media deleteMedia(String mediaId) {
        return null;
    }

    /**
     * This method will perform a search in the catalog.
     *
     * @param attribute attribute by which patrons want to filter the media
     * @param value value typed by user to perform search
     * @return an ArrayList of Media with all media rows retrieved from the search
     */

    public ArrayList<Media> searchMedia(String attribute, String value) {
        ArrayList<Media> resultSet = new ArrayList<>();
        return resultSet;
    }

     /**
     * toString() method to MediaCollection
     *
     * @return detail for every Media
     */
   
    @Override
    public String toString() {
    
        String type;
        String aggregate="";
      for(int i=0;i<media.size();i++)
       {
        type =media.get(i).getMediaType();
        
            if(type.equals("b"))
             {
                 aggregate+=media.get(i).getMediaId()+" "+media.get(i).getMediaTitle()+" "
                 +" "+media.get(i).getMediaCost()+" "+media.get(i).getEdition()+" "+media.get(i).getPublisher()
                         
                +" "+media.get(i).getIsbn()+" "+media.get(i).getMediaYear()+" "+media.get(i).getNumOfPages_of_Books()+"\n";
                                             
             }    
          if(type.equals("m"))
          {
         aggregate+=media.get(i).getMediaId()+" "+media.get(i).getMediaTitle()+" "+media.get(i).getMediaCost()+
         " "+media.get(i).getMediaYear()+" "+media.get(i).getDirector()+" "+media.get(i).getRunning_time()+"\n";
           
          }
          if(type.equals("a"))
          {
             aggregate+=media.get(i).getMediaId()+" "+media.get(i).getMediaTitle()+" "+media.get(i).getMediaCost()+
         " "+media.get(i).getMediaYear()+" "+media.get(i).getNumberOfPages_of_Ebook()+" "+media.get(i).get_Ebook_Publisher()+"\n";
              
          
          }
            
       
       }

      return aggregate;
       }
        
    }
    


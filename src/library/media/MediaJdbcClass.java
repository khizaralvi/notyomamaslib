package library.jdbc;

import library.media.Media;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import library.media.MediaAcademic;
import library.media.MediaBook;
import library.media.MediaCollection;
import library.media.MediaMovie;
import library.media.Reservation;

/**
 * The MediaJdbcClass is the bridge between the MediaCollection and the JDBC 
 * (database). This class implements all communications with the database 
 * related to the functions of MediaCollection.
 * 
 * @author <a>Adil Imam</a>
 */
public class MediaJdbcClass {

    private Media m = null;
    private Connection con = null;
    private ResultSet rs = null;
    private Statement statement = null;
    private PreparedStatement prepared = null;
    private CallableStatement precall=null; 
    private MediaBook book=null;
    private MediaMovie movie=null;
    private MediaAcademic academic=null;
    private PreparedStatement prepared2=null;
    private PreparedStatement prepared3=null;
    private ResultSet rs1=null;
    
    private  ArrayList<String> fake=new ArrayList();
    
   private MediaCollection collection=new MediaCollection();
    /**
     * Constructor for MediaJdbcClass.
     */
    public MediaJdbcClass() {
        try {
            //fake.add("Bard pitt");
            connect();
            statement=con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(MediaJdbcClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    /**
     * This methods adds a new media to the catalog.
     *
     * @param m Media to be added
     * @return true if the insertion was successful or false otherwise
     * @throws java.sql.SQLException it throws SQL Exception
     */
    public boolean addMedia(Media m) throws SQLException {
    
        connect();
         
          // prepared2=con.prepareStatement("insert into mydb.authorbooks values(?,?)");
           prepared2=con.prepareStatement("insert into mydb.author (auhorname) value(?)");
           prepared3=con.prepareStatement("insert into mydb.authorbooks values(?,?)");
           
           
           try {
           
            String str=m.getMediaType();
           
       prepared=con.prepareStatement("insert into mydb.media(mediaTitle,mediaYear,mediaCategory,mediaCost,"
                      + "mediaType,"+ "mediaQuantity,mediaPublisher,"
                      + "mediaCode,bookEdition,bookVolume,runningTime,movieDirector)"
                      + "values(?,?,?,?,?,?,?,?,?,?,?,?)");
              statement=con.createStatement();
         
           //populate the appropriate fields for each media Subtype   
              switch(str)
             {
                 case "b":
                 {
                     prepared.setString(1,m.getMediaTitle());
                     prepared.setString(2,m.getMediaYear());
                     prepared.setString(3,m.getBookGenre());
                     prepared.setString(4,m.getMediaCost());
                     prepared.setString(5,m.getMediaType());
                     prepared.setInt(6,m.getQuantity());
                     prepared.setString(7,m.getPublisher());
                     prepared.setString(8,m.getIsbn());
                     prepared.setString(9,m.getEdition());
                     prepared.setString(10,m.getVolume());
                     prepared.setString(11,null);
                     prepared.setString(12,null);
                     
                     rs=statement.executeQuery("select *from mydb.media where mediaCode='"+m.getIsbn()+"'");
                     if(rs.next())
                     {
                         System.out.println("Book with the given ISBN is already in the system");
                     }
                         else
                     {
                         prepared.executeUpdate();
         
                           fake=m.getAuthors();
                           
                           System.out.println("author list size= "+fake.size());
                           
                        for(int i=0;i<fake.size();i++)
                           {
                              //prepared2.setString(1,m.getMediaId());
                              prepared2.setString(1, fake.get(i));
                              
                              // checking if the same author name doesnt exist in the table
                              rs=statement.executeQuery("select *from mydb.author where auhorname='"+fake.get(i)+"'");
                              if(rs.next())
                              {
                                        
                              }
                              else
                              {
                              prepared2.executeUpdate();
                              
                              }
                           }
                     for(int i=0;i<fake.size();i++)
                    {
                       rs=statement.executeQuery("select *from mydb.author where auhorname='"+fake.get(i)+"'");
                       rs.next();
                    
                      prepared3.setString(2,rs.getString("authorID"));
                         
                       rs=statement.executeQuery("select *from mydb.media where mediaCode='"+m.getIsbn()+"'");
                    
                       rs.next();
                      
                      prepared3.setString(1,rs.getString("mediaId"));
                    
                      prepared3.executeUpdate();
                    }
                     }
                  break;
               
                 }
                 
                 case "m":
                 {
                     
                    // prepared.setString(1,m.getMediaId());
                     prepared.setString(1,m.getMediaTitle());
                     prepared.setString(2,m.getMediaYear());
                     prepared.setString(3,m.getGenre());
                     prepared.setString(4,m.getMediaCost());
                     prepared.setString(5,m.getMediaType());
                     prepared.setInt(6,m.getQuantity());
                     prepared.setString(7,null);
                     prepared.setString(8,m.getMovie_Code());
                     prepared.setString(9,null);
                     prepared.setString(10,null);
                     
                     prepared.setString(11,m.getRunning_time());
                     prepared.setString(12,m.getDirector());
                    
                      prepared.executeUpdate();
         
                     break;
                     
                     
                 }
                 
                 case "a":
                 {
                    // prepared.setString(1,m.getMediaId());
                     prepared.setString(1,m.getMediaTitle());
                     prepared.setString(2,m.getMediaYear());
                     prepared.setString(3,m.getDocumentType());
                     prepared.setString(4,m.getMediaCost());
                     prepared.setString(5,m.getMediaType());
                     prepared.setInt(6,m.getQuantity());
                     prepared.setString(7,m.get_Ebook_Publisher());
                     prepared.setString(8,m.getEbook_ISBN());
                     prepared.setString(9,null);
                     prepared.setString(10,null);
                     prepared.setString(11,null);
                     prepared.setString(12,null);
                     
                     prepared.executeUpdate();
                 
                                     fake=m.getAuthors_of_Ebook();
                           
                           System.out.println("author list size= "+fake.size());
                           
                        for(int i=0;i<fake.size();i++)
                           {
                              //prepared2.setString(1,m.getMediaId());
                              prepared2.setString(1, fake.get(i));
                              
                              // checking if the same author name doesnt exist in the table
                              rs=statement.executeQuery("select *from mydb.author where auhorname='"+fake.get(i)+"'");
                              if(rs.next())
                              {
                                        
                              }
                              else
                              {
                              prepared2.executeUpdate();
                              
                              }
                           }
                     for(int i=0;i<fake.size();i++)
                    {
                       rs=statement.executeQuery("select *from mydb.author where auhorname='"+fake.get(i)+"'");
                       rs.next();
                    
                 prepared3.setString(2,rs.getString("authorID"));
                         
                 rs=statement.executeQuery("select *from mydb.media where mediaCode='"+m.getEbook_ISBN()+"'");
                    
                 rs.next();
                      
                      prepared3.setString(1,rs.getString("mediaId"));
                    
                      prepared3.executeUpdate();
                    }
                 
                     
                     
                     
                     
               
                                 
                     
                     
                     
                     
                     
                     break;
                 }
                 default:
                     break;
             }
             
             
             System.out.println("Successfully made entry into the database");
             
         //    prepared.close();
         }
         
        
        catch (SQLException ex) {
              ex.printStackTrace();
                             }
        finally{
        
           // prepared.close();
           // statement.close();
           // rs.close();
           // con.close();
        }
        
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
       
        String type=editedMedia.getMediaType();
        
        try {
            prepared=con.prepareStatement("update mydb.media set mediaTitle=?,mediaYear=?,mediaCategory=?,mediaCost=?,mediaType=?,mediaQuantity=?,mediaPublisher=?,bookEdition=?,bookVolume=?,runningTime=?,movieDirector=?"
                    + " where mediaId=?");
         
            switch(type)
           
            {
                case "b":  
                { 
                
             prepared.setString(1,editedMedia.getMediaTitle());
             prepared.setString(2,editedMedia.getMediaYear());
             prepared.setString(3,editedMedia.getBookGenre());
             prepared.setString(4,editedMedia.getMediaCost());
             prepared.setString(5,editedMedia.getMediaType());
             prepared.setInt(6,editedMedia.getQuantity());
             prepared.setString(7,editedMedia.getPublisher());
             
             prepared.setString(8,editedMedia.getEdition());
             prepared.setString(9,editedMedia.getVolume());
             prepared.setString(10,null);
             prepared.setString(11,null);
             prepared.setInt(12,editedMedia.getMediaId());
             
             prepared.executeUpdate();
             
            break;
                }
                case "m":
                {
             prepared.setString(1,editedMedia.getMediaTitle());
             prepared.setString(2,editedMedia.getMediaYear());
             prepared.setString(3,editedMedia.getBookGenre());
             prepared.setString(4,editedMedia.getMediaCost());
             prepared.setString(5,editedMedia.getMediaType());
             prepared.setInt(6,editedMedia.getQuantity());
             prepared.setString(7,null);
           
             prepared.setString(8,null);
             prepared.setString(9,null);
             prepared.setString(10,editedMedia.getRunning_time());
             prepared.setString(11,editedMedia.getDirector());
             prepared.setInt(12,editedMedia.getMediaId());
             
             prepared.executeUpdate();
                
                break;
                
                }
                case "a":
                {
                
             prepared.setString(1,editedMedia.getMediaTitle());
             prepared.setString(2,editedMedia.getMediaYear());
             prepared.setString(3,editedMedia.getDocumentType());
             prepared.setString(4,editedMedia.getMediaCost());
             prepared.setString(5,editedMedia.getMediaType());
             prepared.setInt(6,editedMedia.getQuantity());
             prepared.setString(7,editedMedia.get_Ebook_Publisher());
           
             prepared.setString(8,null);
             prepared.setString(9,null);
             prepared.setString(10,null);
             prepared.setString(11,null);
             prepared.setInt(12,editedMedia.getMediaId());
             
             prepared.executeUpdate();
                
                
                
                break;
                
                }
        }
        }
        catch (SQLException ex) {
            Logger.getLogger(MediaJdbcClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
       
        return true;
    
        }

    /**
     * This methods deletes an existing media from the catalog.
     *
     * @param mediaId Media id to delete
     * @return Media object thats deleted
     */
    public Media deleteMedia(String mediaId) {
        
        
        connect();
        try{
        
            
            prepared=con.prepareStatement("delete from mydb.media where mediaId=?");
            prepared.setString(1,mediaId);
            
            int i=prepared.executeUpdate();
             if(i>0)
             {
               return null;  
             }
             else
             {
               return null;  //when it returns false, it means no tuple got deleted
             }
             
        }
        
        catch(SQLException se)
        {
        }
        
        
        
        
        
        return null;
    }

    /**
     * This method will perform a search in the catalog.
     *
     * @param attribute attribute by which patrons want to filter the media
     * @param value value typed by user to perform search
     * @return MediaCollection object which contains an ArrayList of media
     */
    public MediaCollection searchMedia(int attribute, String value) {
        //ArrayList<Media> resultSet = new ArrayList<>();
    connect();    
       try{
        prepared=con.prepareStatement("select *from (mydb.media join mydb.authorbooks using(mediaId)) \n" +
                     " where authorId=(select authorID from mydb.author where auhorname=?);");
          // precall=con.prepareCall("call mydb.Search_Media_by_Year(?)");
        PreparedStatement prepared2 = con.prepareStatement("select *from mydb.media where media.mediaYear=?;");
        switch(attribute)
        {
        
            case 1:
            {
              //  precall.setString(1,"");
              prepared2.setString(1,value);
              rs=prepared2.executeQuery();
                
            break;
            }
            case 2:
            {
             // precall.setString(1,"mydb.search_books_by_author");
              
            prepared.setString(1,value);
            rs=prepared.executeQuery();
               
              
              break;
            }
            case 3:
            {
                rs=statement.executeQuery("select *from mydb.media where mediaTitle='"+value+"'");
                       
            break;
            }
            case 4:
            {
              rs=statement.executeQuery("select *from mydb.media where mediaCategory='"+value+"'");
              break;
            }
            case 5:
            {
              rs=statement.executeQuery("select *from mydb.media where mediaId='"+value+"'");
            }
            default:
                break;
        }
       
       // precall.executeQuery();
        
       unpack(rs);
       //testPrint(rs); 
       
       }
       catch(SQLException se)
       {
         se.printStackTrace();
       }
       
       // unpack rs into object//
        return collection;
    }


  private void connect()
  {
   
        try {
            Class.forName("com.mysql.jdbc.Driver");
       //     System.out.println("Driver Found");
        } 
         catch (ClassNotFoundException ex) {
           
            ex.printStackTrace();
        }
         
        String url="jdbc:mysql://localhost:3306/mydb?autoReconnect=true&useSSL=false";
        String user="root";
        String password="rafa2012";

        try{
          con=DriverManager.getConnection(url,user,password);
      
     //          System.out.println("Connection successful");
     }
     
     catch(SQLException se)
        {
           se.printStackTrace();
        }
     
     
  }

  private void unpack(ResultSet rs)
   {
       try{
       while(rs.next())
    {
       switch(rs.getString("mediaType"))
       {
           case "b":
           {
           book=new MediaBook(rs.getInt("mediaId"),rs.getString("mediaTitle"),rs.getString("mediaYear"),
           rs.getString("mediaCode"),rs.getString("bookEdition"),rs.getString("bookVolume"),
           null ,rs.getString("mediaPublisher"),rs.getString("mediaCost"),rs.getInt("mediaQuantity"),null,rs.getString("mediaCategory"));
      
         collection.getMedia().add(book);
           
           break;
          
           }
           case "m":
           {
           
     movie=new MediaMovie(rs.getInt("mediaId"),rs.getString("mediaTitle"),rs.getString("mediaYear"),
      
    rs.getString("mediaCost"),rs.getString("mediaCategory"),rs.getString("movieDirector"),rs.getString("runningTime"),rs.getInt("mediaQuantity"),rs.getString("mediaCode"));
             
           collection.getMedia().add(movie);
               
           break;
           }
           case "a":
           {
           academic=new MediaAcademic(rs.getInt("mediaId"),rs.getString("mediaTitle"),rs.getString("mediaYear"),
      
    rs.getString("mediaCost"),rs.getString("mediaPublisher"),null,null,rs.getString("mediaCategory"),rs.getInt("mediaQuantity"),rs.getString("mediaCode"));
         
           collection.getMedia().add(academic);
           
           break;
           }
       } 
    }
       }
       catch(SQLException se)
       {
           se.printStackTrace();
       }
   }
  /*
  public void testPrint(ResultSet rs)
  {
      

        try {

    rs.next();
            System.out.println(rs.getString("mediaId")+" "+rs.getString("mediaTitle")+" "+rs.getString("mediaYear")+" "+ rs.getString("bookISBN"));
        } catch (SQLException ex) {
            Logger.getLogger(MediaJdbcClass.class.getName()).log(Level.SEVERE, null, ex);
        }

}
*/

  /**
   * Browse Media
   * 
     * @return 
   */
  
  public MediaCollection Browse_Media()
  {
     connect();
     
        try {
            rs=statement.executeQuery("select *from mydb.media");
        } catch (SQLException ex) {
            Logger.getLogger(MediaJdbcClass.class.getName()).log(Level.SEVERE, null, ex);
        }
  unpack(rs);
  return collection;
        
  }
}

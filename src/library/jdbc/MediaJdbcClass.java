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
    
    private  ArrayList fake=new ArrayList();
    
   private MediaCollection collection=new MediaCollection();
    /**
     * Constructor for MediaJdbcClass.
     */
    public MediaJdbcClass() {
    fake.add("Bard pitt");
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
         
            
        try {
           
            String str=m.getMediaType();
           
              prepared=con.prepareStatement("insert into mydb.media values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
              statement=con.createStatement();
              rs=statement.executeQuery("select *from mydb.media where mediaId='"+m.getMediaId()+"'");
   
              
         if(rs.next())
         { 
            System.out.println("Cannot add duplicate students");
         }
          else
         {
             switch(str)
             {
                 case "b":
                 {
                     prepared.setString(1,m.getMediaId());
                     prepared.setString(2,m.getMediaTitle());
                     prepared.setString(3,m.getMediaYear());
                     prepared.setString(4,m.getMediaCost());
                     prepared.setString(5,m.getMediaType());
                     prepared.setInt(6,m.getQuantity());
                     prepared.setString(7,m.getIsbn());
                     prepared.setString(8,m.getEdition());
                     prepared.setString(9,m.getVolume());
                     prepared.setString(10,m.getNumOfPages_of_Books());
                     prepared.setString(11,null);
                     prepared.setString(12,null);
                     prepared.setString(13,null);
                     prepared.setString(14,null);
                     prepared.setString(15, null);
                     prepared.setString(16, null);
                     break;
                 }
                 
                 case "m":
                 {
                     
                     prepared.setString(1,m.getMediaId());
                     prepared.setString(2,m.getMediaTitle());
                     prepared.setString(3,m.getMediaYear());
                     prepared.setString(4,m.getMediaCost());
                     prepared.setString(5,m.getMediaType());
                     prepared.setInt(6,m.getQuantity());
                     prepared.setString(7,null);
                     prepared.setString(8,null);
                     prepared.setString(9,null);
                     prepared.setString(10,null);
                     prepared.setString(11,null);
                     
                     prepared.setString(12,m.getGenre());
                     prepared.setString(13,null);
                     prepared.setString(14,m.getRunning_time());
                     
                     prepared.setString(15,null);
                     prepared.setString(16, null);
                     break;
                     
                     
                 }
                 
                 case "a":
                 {
                     prepared.setString(1,m.getMediaId());
                     prepared.setString(2,m.getMediaTitle());
                     prepared.setString(3,m.getMediaYear());
                     prepared.setString(4,m.getMediaCost());
                     prepared.setString(5,m.getMediaType());
                     prepared.setInt(6,m.getQuantity());
                     prepared.setString(7,null);
                     prepared.setString(8,null);
                     prepared.setString(9,null);
                     prepared.setString(10,null);
                     prepared.setString(11,null);
                     prepared.setString(12,null);
                     prepared.setString(13,null);
                     prepared.setString(14,null);
                     prepared.setString(15,m.get_Ebook_Publisher());
                     prepared.setString(16,m.getNumberOfPages_of_Ebook());
                     break;
                 }
                 default:
                     break;
             }
             
             prepared.executeUpdate();
             
             System.out.println("Successfully made entry into the database");
             
             prepared.close();
         }
         
        }
        catch (SQLException ex) {
              ex.printStackTrace();
                             }
        finally{
        
            prepared.close();
            statement.close();
            rs.close();
            con.close();
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
    public MediaCollection searchMedia(String attribute, String value) {
        //ArrayList<Media> resultSet = new ArrayList<>();
    connect();    
       try{
        precall=con.prepareCall("call mydb.Search_Media_by_Year(?)");
        
        switch(attribute)
        {
        
            case "mediaYear":
            {
            precall.setString(1,value);
                            
            break;
            }
            default:
                break;
        }
       
        precall.executeQuery();
        rs=precall.getResultSet();
        
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
            System.out.println("Driver Found");
        } 
         catch (ClassNotFoundException ex) {
           
            ex.printStackTrace();
        }
         
        String url="jdbc:mysql://localhost:3306/mydb?autoReconnect=true&useSSL=false";
        String user="root";
        String password="rafa2012";

        try{
          con=DriverManager.getConnection(url,user,password);
      
               System.out.println("Connection successful");
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
           book=new MediaBook(rs.getString("mediaId"),rs.getString("mediaTitle"),rs.getString("mediaYear"),
           rs.getString("bookISBN"),rs.getString("bookEdition"),rs.getString("bookVolume"),
           rs.getString("bookPages"),rs.getString("bookPublisher"),rs.getString("mediaCost"),rs.getInt("mediaQuantity")           );
                 
         collection.getMedia().add(book);
           
           break;
          
           }
           case "m":
           {
           
     movie=new MediaMovie(rs.getString("mediaId"),rs.getString("mediaTitle"),rs.getString("mediaYear"),
      
    rs.getString("mediaCost"),rs.getString("movieGenre"),"Martin Austin",fake,rs.getString("runningTime"),rs.getInt("mediaQuantity"));
             
           collection.getMedia().add(movie);
               
           break;
           }
           case "a":
           {
           academic=new MediaAcademic(rs.getString("mediaId"),rs.getString("mediaTitle"),rs.getString("mediaYear"),
      
    rs.getString("mediaCost"),rs.getString("publisher"),fake,rs.getString("numOfPages")," ",4);
         
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

}

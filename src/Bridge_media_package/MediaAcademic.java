package Bridge_media_package;

import java.util.ArrayList;


/**
 * MediaAcademic is the class for all media material of type academic
 * materials, such as journals, theses, dissertations, etc.
 * It inherits from Media superclass.
 * <p>
 * The MediaAcademic class encapsulates all state information related to academic materials.
 * These state information includes: </p>
 * <ul>
 * <li></li>
 * <li></li>
 * <li></li>
 * </ul>
 *
 * @author <a href="jessicacarneiro@ufmg.br">Jéssica Carneiro</a>
 * @version 1.0.0
 */
public class MediaAcademic extends Media {

    private String publish_sphere;
    private String number_of_pages;
    private ArrayList<String> authors;
    private String document_type;
    
    /**
     * LOAN_PERIOD is the duration of a loan in days.
     */
    public static int LOAN_PERIOD = 28;

    /**
     * LATE_FEE is the amount of money charged in cents per late day by the
     * Patron.
     */
    public static double LATE_FEE = 0.10;

    /**
     * RENEWABLE is true if media can be renewed by the patron, or false
     * otherwise.
     */
    public static boolean RENEWABLE = true;

    /**
     * RENEW_TIMES represents how many times a patron can renew a media.
     */
    public static int RENEW_TIMES = 1;

    /**
     * Constructor for MediaAcademic
     *
     * @param id Media unique identifier
     * @param title Media title
     * @param year Media publishing year
     * @param cost Media cost 
     * @param publishing_sphere Journals publishing country
     * @param author Authors list 
     * @param num_of_pages Total number of pages of journal
     * @param  document_type Document type of the journal
     */
    public MediaAcademic(String id, String title, String year,String cost,String publishing_sphere,ArrayList<String> author, String num_of_pages,String document_type) {
        super(id, title, year, cost);
        this.publish_sphere=publishing_sphere;
        this.document_type=document_type;
        this.number_of_pages=num_of_pages;
        this.authors=author;
    }

    public String getPublish_sphere() {
        return publish_sphere;
    }

    public void setPublish_sphere(String publish_sphere) {
        this.publish_sphere = publish_sphere;
    }

    public String getNumber_of_pages() {
        return number_of_pages;
    }

    public void setNumber_of_pages(String number_of_pages) {
        this.number_of_pages = number_of_pages;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }

    public String getDocument_type() {
        return document_type;
    }

    public void setDocument_type(String document_type) {
        this.document_type = document_type;
    }

   
}

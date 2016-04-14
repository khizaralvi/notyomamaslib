package Bridge_media_package;

import java.util.ArrayList;


/**
 * MediaEletronic is the class for all electronic media, such as eBooks, PDFs, 
 * etc.
 * It inherits from Media superclass.
 * <p>
 * The MediaEletronic class encapsulates all state information related to 
 * electronic materials. These state information includes: </p>
 * <ul>
 * <li></li>
 * <li></li>
 * <li></li>
 * </ul>
 *
 * @author <a href="jessicacarneiro@ufmg.br">Jéssica Carneiro</a>
 * @version 1.0.0
 */
public class MediaEletronic extends Media {

    private String issn;
    private String ebook_format;
    private String publisher;
    private ArrayList<String> authors;
   
    
    /**
     * Loan period is the duration of a loan in days.
     */
    public static int LOAN_PERIOD = 14;

    /**
     * RENEWABLE is true if media can be renewed by the patron, or false
     * otherwise.
     */
    public static boolean RENEWABLE = false;

    /**
     * Constructor for MediaEletronic
     *
     * @param id Media unique identifier
     * @param title Media title
     * @param year Media publishing year
     * @param cost Media cost
     * @param issn International Standard Serial number for Journal
     * @param publsher Name of the publisher
     * @param authors List of Authors
     */
    public MediaEletronic(String id, String title, String year,String cost,String issn,String format,String publisher,ArrayList<String> authors) {
        super(id, title, year, cost);
          this.authors=authors;
          this.publisher=publisher;
          this.ebook_format=format;
          this.issn=issn;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getEbook_format() {
        return ebook_format;
    }

    public void setEbook_format(String ebook_format) {
        this.ebook_format = ebook_format;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }

}

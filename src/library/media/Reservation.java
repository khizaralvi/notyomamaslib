/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.media;

import java.util.Date;

/**
 *
 * This class holds attributes required to hold data about one reserved media
 *
 * @author Adil Imam
 */
public class Reservation {

    private String MediaId;
    private String PatronId;
    private Date reserved_date;

    /**
     *
     * @param MediaId MediaId is the unique id for every single media
     * @param PatronId PatronId is the unique id for every single patron
     * @param reserved_date records date the book was reserved
     *
     */
    public Reservation(String MediaId, String PatronId, Date reserved_date) {
        this.MediaId = MediaId;
        this.PatronId = PatronId;
        this.reserved_date = reserved_date;
    }

    /**
     * This method returns MediaID attribute of the object
     *
     * @return String
     */
    public String getMediaId() {
        return MediaId;
    }

    /**
     * This method lets us set the MediaId attribute for the object
     *
     * @param MediaId Media Id
     */
    public void setMediaId(String MediaId) {
        this.MediaId = MediaId;
    }

    /**
     * This method returns the PatronId attribute of the object
     *
     * @return String
     */
    public String getPatronId() {
        return PatronId;
    }

    /**
     * This method sets the PatronId attribute of the object
     *
     * @param PatronId Patron unique identifies
     */
    public void setPatronId(String PatronId) {
        this.PatronId = PatronId;
    }

    /**
     * This method lets us receive Date attribute of the object
     *
     * @return Date
     */
    public Date getReserved_date() {
        return reserved_date;
    }

    /**
     * This method lets us return reserve date attribute of the object
     *
     * @param reserved_date date media was reserved
     */
    public void setReserved_date(Date reserved_date) {
        this.reserved_date = reserved_date;
    }

    /**
     * This method is used to display contents of each object
     *
     * @return String This String contains the contents of each attribute for
     * the given object
     */
    @Override
    public String toString() {
        return "Reservation2{" + "MediaId=" + MediaId + ", PatronId=" + PatronId + ", reserved_date=" + reserved_date + '}';
    }

    /**
     * This method is used to compare object passed with the object invoking the
     * method
     *
     * @param o Object that is sent to be compared
     * @return boolean value which
     */
    @Override
    public boolean equals(Object o) {
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }

}

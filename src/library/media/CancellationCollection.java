/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.media;

import java.util.ArrayList;
import library.jdbc.CancellationJDBC;

public class CancellationCollection {

    private ArrayList<Cancellation> cancellation;
    private CancellationJDBC cancel;

    public CancellationCollection() {
        cancellation = new ArrayList();
        cancel = new CancellationJDBC();
    }

    /**
     * This method lets us cancel one media reservation for one specific patron
     *
     * @param r cancellation object passed from control class which tells us
     * which patron has cancelled what media reservation
     * @return Boolean represents whether the desired operation was successful
     * or not
     */
    public Boolean CancelMedia(Cancellation r) {
        cancellation.add(r);
        return false;
    }
    
        /**
     * Delete a cancellation
     * @param 
     * @return the deleted object
     */
    public Cancellation deleteCancellation(String cancellationId) {
        Cancellation deletedC = new Cancellation();
        return deletedC;
    }


    /**
     * This method lets us view all reserved media for one specific patron
     *
     * @param PatronId represents patron whose cancellation is required to be
     * displayed
     */
    public void View_SpecificUser_CancellationList(String PatronId) {

    }

    /**
     * This method display all the cancelled books in the library
     */
    public void view_All_Cancellation_List() {

        cancellation.toString();

    }

    @Override
    public String toString() {
        return "CancellationCollection{" + "cancellation=" + cancellation + '}';
    }

    /**
     *
     * @return ArrayList lets you return the arrayList holding objects of
     * Cancellation
     */
    public ArrayList<Cancellation> getArr() {
        return cancellation;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }

}

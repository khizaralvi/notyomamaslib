package library.media;

import java.util.Date;

/**
 * CancellationList is the class that implements a list of canceled 
 * reservations made by the users.
 * 
 * @author <a href="jessicacarneiro@ufmg.br">Jéssica Carneiro</a>
 * @version 1.0.0
 */
public class CancellationList {
    
    private ReservationList mediaReserved;
    private Date dateCanceled;

    /**
     * Constructor for CancellationList.
     * 
     * @param reserved An object of type CheckedOutMedia
     * @param cancellation Date in which cancellation was performed.
     */
    public CancellationList(ReservationList reserved, Date cancellation) {
    }

    /**
     * Returns the object of type ReservationList.
     * 
     * @return object of type ReservationList
     */
    public ReservationList getMediaReserved() {
        return mediaReserved;
    }

    /**
     * Sets the object of type ReservationList.
     * 
     * @param mediaReserved object of type ReservationList
     */
    public void setMediaReserved(ReservationList mediaReserved) {
        this.mediaReserved = mediaReserved;
    }

    /**
     * Returns the date in which the cancellation was performed.
     * 
     * @return cancellation date
     */
    public Date getDateCanceled() {
        return dateCanceled;
    }

    /**
     * Sets the date in which the cancellation was performed.
     * 
     * @param dateCanceled cancellation date
     */
    public void setDateCanceled(Date dateCanceled) {
        this.dateCanceled = dateCanceled;
    }
    
}

package uni.pu.fmi.models;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.*;

/**
 * 
 */
public class Schedule {

    /**
     * Default constructor
     */
    public Schedule() {
    }

    /**
     * 
     */
    private Dentist dentist;

    /**
     * 
     */
    private List<LocalDateTime> freeHours;

    /**
     * 
     */
    private List<LocalDateTime> reservedHours;

    /**
     * 
     */
    private Receptionist receptionist;

    /**
     * @return
     */
    public Dentist getDentist() {
        // TODO implement here
        return null;
    }

    /**
     * @param dentist
     */
    public void setDentist(Dentist dentist) {
        // TODO implement here
    }

    /**
     * @param hour 
     * @return
     */
    public boolean isFreeHour(LocalDateTime hour) {
        // TODO implement here
        return false;
    }

}
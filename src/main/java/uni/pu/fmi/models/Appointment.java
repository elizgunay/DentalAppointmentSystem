package uni.pu.fmi.models;

import java.sql.Time;
import java.util.*;

/**
 * 
 */
public class Appointment {

    /**
     * Default constructor
     */
    public Appointment() {
    }

    private String date;

    private String time;

    private String name;

    private String phone;

    private String treatment;


    /**
     * 
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date
     */
    public void setDate(String date) {
        this.date = date;    }

    /**
     * @return
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    public String getPhone() {
       return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

}
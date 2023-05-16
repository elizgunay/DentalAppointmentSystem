package uni.pu.fmi.models;

import java.util.*;

/**
 * 
 */
public class Patient {

    /**
     * Default constructor
     */
    public Patient() {
    }

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String phone;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private Set<Appointment> appointments;

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return
     */
    public Appointment getAppointment() {
        // TODO implement here
        return null;
    }

    /**
     * @param appointment
     */
    public void setAppointment(Appointment appointment) {
        // TODO implement here
    }

}
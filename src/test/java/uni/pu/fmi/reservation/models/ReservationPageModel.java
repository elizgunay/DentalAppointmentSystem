package uni.pu.fmi.reservation.models;

import uni.pu.fmi.controllers.ReservationController;


public class ReservationPageModel {
    private String name;
    private String date;
    private String time;
    private String phone;

    private String treatment;

    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public void addPhone(String phone){
        this.phone = phone;
    }

    public void addTreatment(String treatment){
        this.treatment = treatment;
    }

    public void addName(String name){
        this.name = name;
    }

    public void addDate(String date){
        this.date = date;
    }

    public void addTime(String time){
        this.time = time;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getPhone(String phone) {
       return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void clickButton() {
        ReservationController reservationController = new ReservationController();
        message = reservationController.reservation(date,time,name,treatment,phone);
    }

}

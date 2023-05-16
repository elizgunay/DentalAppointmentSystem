package uni.pu.fmi.edit.models;

import uni.pu.fmi.controllers.EditController;
import uni.pu.fmi.reservation.models.ReservationPageModel;

public class EditPageModel extends ReservationPageModel{
    private String new_date;
    private String new_time;
    private String new_name;
    private String new_treatment;

    public String getNew_date() {
        return new_date;
    }

    public String getNew_time() {
        return new_time;
    }

    public String getNewName() {
        return new_name;
    }

    public String getNewTreatment() {
        return new_treatment;
    }

    public void setNewDate(String new_date) {
        this.new_date = new_date;
    }

    public void setNewTime(String new_time) {
        this.new_time = new_time;
    }

    public void setNewName(String new_name) {
        this.new_name = new_name;
    }

    public void setNewTreatment(String new_treatment) {
        this.new_treatment = new_treatment;
    }

    public void addNewName(String new_name){
        this.new_name = new_name;

    }
    @Override
    public void clickButton() {
        EditController editController = new EditController();
        setMessage(editController.edit(getDate(),getTime(),getName(),getTreatment()));
    }

}

package uni.pu.fmi.controllers;

import org.apache.commons.lang3.StringUtils;
import uni.pu.fmi.DB;
import uni.pu.fmi.models.Appointment;

import java.util.Map;
import java.util.regex.Pattern;

public class EditController {

    public EditController() {
    }

    public String edit(String new_date,String new_time,String new_name,
                       String new_treatment){

        if(StringUtils.isBlank(new_name) || new_name.length() < 3 ){
            return "Въведените данни са невалидни";
        }

        if (StringUtils.isBlank(new_time)) {
            return "Моля,избере удобен за вас час!";
        }
        if(StringUtils.isBlank(new_treatment)){
            return "Изберете услуга";
        }
        if(!isTimeBusy(new_date,new_time)){
            return "Зает час!";
        }

        if(!isTimeExists(new_date,new_time)){
            return "Не може да бъде редактиран несъществуващ час.";
        }

        Map<String, Appointment> appDB = new DB().getAppointmentsDB();

        Appointment editedAppointment = new Appointment();
        editedAppointment.setDate(new_date);
        editedAppointment.setTime(new_time);
        editedAppointment.setName(new_name);
        editedAppointment.setTreatment(new_treatment);
//        appDB.put(new_name, editedAppointment);
//        appDB.compute(new_name,(k,v) -> (v == null ? editedAppointment : v));

        appDB.compute(new_name, (key, oldAppointment) -> {
            if (oldAppointment != null) {
                oldAppointment.setDate(new_date);
                oldAppointment.setTime(new_time);
                oldAppointment.setTreatment(new_treatment);
                return oldAppointment;
            } else {
                return editedAppointment;
            }
        });
        return "Резервацията е успешно редактирана";

    }
    Map<String, Appointment> appDB = new DB().getAppointmentsDB();

    private boolean isTimeBusy(String date, String time) {
        for (Map.Entry<String, Appointment> entry : appDB.entrySet()) {
            Appointment appointment = entry.getValue();
            if (appointment.getDate().equals(date) && appointment.getTime().equals(time)) {
                return false;
            }
        }
        return true;
    }

    private boolean isTimeExists(String new_date,String new_time){
        return appDB.values().stream()
                .anyMatch(u -> u.getDate().equals(new_date) || u.getTime().equals(new_time));


    }
}

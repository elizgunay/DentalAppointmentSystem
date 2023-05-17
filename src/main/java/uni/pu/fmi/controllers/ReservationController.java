package uni.pu.fmi.controllers;

import org.apache.commons.lang3.StringUtils;
import uni.pu.fmi.DB;
import uni.pu.fmi.models.Appointment;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class ReservationController {
    public ReservationController() {
    }

    public String reservation(String date, String time,String name, String treatment, String phone) {

        if(StringUtils.isBlank(name)){
            return "Въведете име!";
        }

        if (StringUtils.isBlank(phone)) {
            return "Моля,въведете телефонен номер!";
        }

        if (!isValidPhone(phone)) {
            return "Невалиден телефонен номер!";
        }

        if (StringUtils.isBlank(time)) {
            return "Моля,избере удобен за вас час!";
        }

        if (!isTimeBusy(date, time)) {
            return "Зает час!Моля изберете друг!";
        }

        if (StringUtils.isBlank(treatment)) {
            return "Изберете причина за посещението!";
        }
        Map<String, Appointment> appDB = new DB().getAppointmentsDB();

        Appointment appointment = new Appointment();
        appointment.setDate(date);
        appointment.setTime(time);
        appointment.setName(name);
        appointment.setTreatment(treatment);
        appointment.setPhone(phone);
        appDB.put(name, appointment);
        return "Успешно запазихте своя час!";

    }

    public boolean isValidPhone(String phone) {
        String regex = "^(08[7-9][2-9][0-9]{6})$";
        return phone.matches(regex);
    }


    private boolean isTimeBusy(String date, String time) {
        Map<String, Appointment> appDB = new DB().getAppointmentsDB();
        for (Map.Entry<String, Appointment> entry : appDB.entrySet()) {
            Appointment appointment = entry.getValue();
            if (appointment.getDate().equals(date) && appointment.getTime().equals(time)) {
                return false;
            }
        }
        return true;
    }


}
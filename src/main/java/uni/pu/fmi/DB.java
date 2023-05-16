package uni.pu.fmi;

import uni.pu.fmi.models.Appointment;

import java.util.HashMap;
import java.util.Map;

public class DB {

    private final Map<String, Appointment> appointments = new HashMap<>();

    public DB() {
        initDb();
    }

    private void initDb() {
        Appointment appointment1 = new Appointment();
        appointment1.setDate("2023-05-14");
        appointment1.setTime("9:00 AM");
        appointment1.setPhone("0887448898");
        appointment1.setName("ivan");
        appointment1.setTreatment("Първичен преглед");
        appointments.put("ivan",appointment1);

        Appointment appointment2 = new Appointment();
        appointment2.setDate("2023-05-15");
        appointment2.setTime("11:00 AM");
        appointment2.setPhone("0877748329");
        appointment2.setName("ivan2");
        appointment2.setTreatment("Първичен преглед");
        appointments.put("ivan2",appointment2);

        Appointment appointment3 = new Appointment();
        appointment3.setDate("2023-06-07");
        appointment3.setTime("15:30 PM");
        appointment3.setName("Mariq");
        appointment3.setTreatment("Полиране + Избелване");
        appointments.put("Mariq",appointment3);


        Appointment appointment4 = new Appointment();
        appointment4.setDate("2023-06-08");
        appointment4.setTime("17:30 PM");
        appointment4.setName("Mitko");
        appointment4.setTreatment("Полиране + Избелване");
//        appointments.compute("mitko",(k,v) -> (v == null ? appointment4 : v));
        appointments.put("Mitko",appointment4);

        Appointment appointment5 = new Appointment();
        appointment5.setDate("2023-06-09");
        appointment5.setTime("17:30 PM");
        appointment5.setName("Petar");
        appointment5.setTreatment("Почистване");
        appointments.put("Petar",appointment5);

        Appointment appointment6 = new Appointment();
        appointment6.setDate("2023-06-09");
        appointment6.setTime("17:30 PM");
        appointment6.setName("Marian");
        appointment6.setTreatment("Почистване");
        appointments.put("Marian",appointment6);

    }
    public Map<String,Appointment> getAppointmentsDB(){
        return appointments;
    }
}

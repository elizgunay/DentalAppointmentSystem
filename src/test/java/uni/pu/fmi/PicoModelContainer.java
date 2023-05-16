package uni.pu.fmi;

import uni.pu.fmi.edit.models.EditPageModel;
import uni.pu.fmi.reservation.models.ReservationPageModel;

public class PicoModelContainer {

    private ReservationPageModel reservationPageModel;

    private EditPageModel editPageModel;

    public EditPageModel getEditPageModel() {
        return editPageModel;
    }

    public void setEditPageModel(EditPageModel editPageModel) {
        this.editPageModel = editPageModel;
    }

    public ReservationPageModel getReservationPageModel(){
        return reservationPageModel;
    }

    public void setReservationPageModel(ReservationPageModel reservationPageModel) {
        this.reservationPageModel  = reservationPageModel;
    }
    public ReservationPageModel getActiveModel(){

//        if(reservationPageModel != null){
//           return reservationPageModel;
//        }
//        return reservationPageModel;
        return reservationPageModel != null?
                reservationPageModel:editPageModel;

//        if(reservationPageModel != null){
//            return reservationPageModel;
//        } else {
//            return new ReservationPageModel();
//        }
    }
}

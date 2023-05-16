package uni.pu.fmi.edit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import uni.pu.fmi.PicoModelContainer;
import uni.pu.fmi.edit.models.EditPageModel;
import uni.pu.fmi.reservation.models.ReservationPageModel;

import static org.junit.Assert.assertEquals;

public class EditSteps {
    private final PicoModelContainer picoModelContainer;

    public EditSteps(PicoModelContainer picoModelContainer) {
        this.picoModelContainer = picoModelContainer;
    }

    @Given("Отваряме екрана за редактиране на час")
    public void openEditPage() {
         picoModelContainer.setEditPageModel(new EditPageModel());
        ;
    }
    @When("Редактираме резервацията с нова дата: {string}")
    public void editDate(String new_date) {

        picoModelContainer.getActiveModel().setDate(new_date);
    }
    @When("Редактираме резервацията с нов час: {string}")
    public void editTime(String new_time) {
        picoModelContainer.getActiveModel().setTime(new_time);
    }
    @When("Редактираме резервацията с ново име: {string}")
    public void editName(String new_name) {
        picoModelContainer.getActiveModel().setName(new_name);

    }
    @When("Редактираме резервацията с нова услуга: {string}")
    public void newTreatment(String new_treatment) {
        picoModelContainer.getActiveModel().setTreatment(new_treatment);
    }
    @When("Натискаме бутона за редактиране")
    public void clickEditButton() {
        picoModelContainer.getActiveModel().clickButton();
    }



}

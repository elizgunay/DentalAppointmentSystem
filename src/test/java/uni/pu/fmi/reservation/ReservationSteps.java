package uni.pu.fmi.reservation;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import uni.pu.fmi.PicoModelContainer;

import uni.pu.fmi.reservation.models.ReservationPageModel;


public class ReservationSteps {

    private final PicoModelContainer picoModelContainer;

    public ReservationSteps(PicoModelContainer picoModelContainer) {
        this.picoModelContainer = picoModelContainer;
    }

    @Given("Отваряме екрана за запазване на час")
    public void openReservationPage() {
        picoModelContainer.setReservationPageModel(new ReservationPageModel());
    }
    @When("Избираме дата от календара:{string}")
    public void selectDate(String date)  {
        picoModelContainer.getActiveModel().addDate(date);

    }
    @When("Избираме час от календара:{string}")
    public void selectTime(String time) {
        picoModelContainer.getActiveModel().addTime(time);
    }

    @When("Въвеждаме име: {string}")
    public void addName(String name) {
        picoModelContainer.getActiveModel().addName(name);

    }
    @When("Избираме услуга: {string}")
    public void selectTreatment(String treatment) {
        picoModelContainer.getActiveModel().addTreatment(treatment);
    }
    @When("Въвеждаме тел.номер: {string}")
    public void addPhone(String phone) {
        picoModelContainer.getActiveModel().addPhone(phone);
    }
    @When("Натискаме бутона за запазване на час")
    public void clickButton() {
        picoModelContainer.getActiveModel().clickButton();
    }
    @Then("Виждаме съобщение:{string}")
    public void checkMessage(String expectedMessage) {
        Assert.assertEquals(expectedMessage,picoModelContainer.getActiveModel().getMessage());
    }


}

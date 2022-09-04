package sophosSolutions.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import sophosSolutions.task.SelectDataPicker;
import sophosSolutions.task.UseAlerts;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class PruebaFlujoTresStepDefinitions {
    String name;
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("dado que el usuario {string} debe usar los alerts")
    public void dadoQueElUsuarioDebeUsarLosAlerts(String name) {
        this.name=name;
    }

    @When("cuando el use los botones e ingrese el {string}  en el alert correspondiente")
    public void cuandoElUseLosBotonesEIngreseElEnElAlertCorrespondiente(String name) {
        theActorCalled(name).attemptsTo(
                UseAlerts.whitData(name)
        );
    }
    @Then("entonces se cierran los alerts y se muestra el mensaje de envio correcto")
    public void entoncesSeCierranLosAlertsYSeMuestraElMensajeDeEnvioCorrecto() {

    }
}

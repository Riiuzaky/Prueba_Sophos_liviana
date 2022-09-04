package sophosSolutions.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import sophosSolutions.questions.ViewDataPicker;
import sophosSolutions.task.AddRegisterNew;
import sophosSolutions.task.SelectDataPicker;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class PruebaFlujoDosStepDefinitions {

    String name;
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("dado que el usuario {string} debe ingresar una fecha")
    public void dadoQueElUsuarioDebeIngresarUnaFecha(String name) {
        this.name=name;
    }

    @When("cuando el ingrese los datos {string} {string} {string} {string} en el datapicker")
    public void cuandoElIngreseLosDatosEnElDatapicker(String year, String month, String day, String time) {
        theActorCalled(name).attemptsTo(
                SelectDataPicker.whitData(year, month, day, time)
        );
    }

    @Then("entonces se debera observar la fecha {string} {string} {string} {string} en el datapicker")
    public void entoncesSeDeberaObservarLaFechaEnElDatapicker(String year, String month, String day, String time) {
        theActorInTheSpotlight().should(
                seeThat("Comparacion fecha uno", ViewDataPicker.obtenerTextoDataPicker1(), equalTo(ViewDataPicker.transformDateOne(year, month, day))),
                seeThat("Comparacion fecha dos", ViewDataPicker.obtenerTextoDataPicker2(), equalTo(ViewDataPicker.transformDateTwo(year, month, day, time)))
        );


    }



}

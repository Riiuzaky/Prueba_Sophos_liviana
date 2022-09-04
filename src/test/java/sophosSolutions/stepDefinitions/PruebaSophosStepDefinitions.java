package sophosSolutions.stepDefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import sophosSolutions.questions.ViewDataOnTable;
import sophosSolutions.task.AddRegisterNew;
import sophosSolutions.task.EliminateRegister;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class PruebaSophosStepDefinitions {
    String name;
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("dado que el usuario {string} debe registrar los datos en la compania")
    public void dadoQueElUsuarioDebeRegistrarLosDatosEnLaCompania(String name) {

        this.name=name;

    }

    @When("cuando el ingrese los datos {string} {string} {string} {string} {string} {string} en el formulario")
    public void cuandoElIngreseLosDatosEnElFormulario(String firtName, String lastName, String email, String age, String salary, String departament) {


            theActorCalled(name).attemptsTo(
                    AddRegisterNew.whitData(firtName, lastName, email, age, salary, departament)
            );



    }
    @Then("entonces se debera observar sus datos {string} {string} {string} {string} {string} {string} en la tabla")
    public void entoncesSeDeberaObservarSusDatosEnLaTabla(String firstName, String lastName, String email, String age, String salary, String departament) {
        theActorInTheSpotlight().should(

                seeThat("Esta visible", ViewDataOnTable.tableIsVisible(firstName+"11",lastName+"11","11"+email,age,salary,departament), equalTo(true))

        );


    }


    // segundo paso borrar

    @When("cuando el encuentre el registro con los datos {string} {string} en la tabla")
    public void cuandoElEncuentreElRegistroConLosDatosEnLaTabla(String firtName, String lastName) {
        theActorCalled(name).attemptsTo(
                EliminateRegister.whitData(firtName,lastName)
        );
    }
    @Then("entonces no se debera observar sus datos {string} {string} en la tabla")
    public void entoncesNoSeDeberaObservarSusDatosEnLaTabla(String firstName, String lastName) {
        theActorInTheSpotlight().should(

                seeThat("Esta visible", ViewDataOnTable.tableNoIsVisible(firstName,lastName), equalTo(false))

        );
    }


}

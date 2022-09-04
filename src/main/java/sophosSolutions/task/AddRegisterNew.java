package sophosSolutions.task;

import net.serenitybdd.screenplay.actions.Open;
import sophosSolutions.interactions.GeneralActions;
import sophosSolutions.userInterfaces.ToolsQaElementsPage;
import sophosSolutions.userInterfaces.ToolsQaHomePage;
import sophosSolutions.userInterfaces.ToolsQaWebTablesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddRegisterNew implements Task{

    private String firstName;
    private String lastName;
    private String email;
    private String age;
    private String salary;
    private String departament;

    public AddRegisterNew(String firstName, String lastName, String email, String age, String salary, String departament) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.salary = salary;
        this.departament = departament;
    }

    public static Performable whitData(String firstName, String lastName, String email, String age, String salary, String departament){
        return  instrumented(AddRegisterNew.class,firstName,lastName,email,age,salary,departament);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(ToolsQaHomePage.class),
                GeneralActions.darClick(ToolsQaHomePage.BUTTON_ELEMENTS),
                GeneralActions.darClick(ToolsQaElementsPage.BUTTON_WEB_TABLES)

        );

        for(int i=0;i<12;i++){
            theActorInTheSpotlight().attemptsTo(
                    GeneralActions.darClick(ToolsQaWebTablesPage.BUTTON_ADD),
                    GeneralActions.ingresarTexto(firstName+i,ToolsQaWebTablesPage.INPUT_FIRTS_NAME),
                    GeneralActions.ingresarTexto(lastName+i,ToolsQaWebTablesPage.INPUT_LAST_NAME),
                    GeneralActions.ingresarTexto(i+email,ToolsQaWebTablesPage.INPUT_EMAIL),
                    GeneralActions.ingresarTexto(age,ToolsQaWebTablesPage.INPUT_AGE),
                    GeneralActions.ingresarTexto(salary,ToolsQaWebTablesPage.INPUT_SALARY),
                    GeneralActions.ingresarTexto(departament,ToolsQaWebTablesPage.INPUT_DEPARTAMENT),
                    GeneralActions.darClick(ToolsQaWebTablesPage.BUTTON_SUBMIT)
            );
        };


    }
}

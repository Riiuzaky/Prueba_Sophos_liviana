package sophosSolutions.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.By;
import sophosSolutions.interactions.GeneralActions;
import sophosSolutions.userInterfaces.ToolsQaElementsPage;
import sophosSolutions.userInterfaces.ToolsQaHomePage;
import sophosSolutions.userInterfaces.ToolsQaWebTablesPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EliminateRegister implements Task {

    private String firstName;
    private String lastName;
    private By register;

    public EliminateRegister(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.register = By.xpath("//div[@class='rt-tr-group'][div[contains(.,'"+firstName+"')] and div[contains(.,'"+lastName+"')]]//span[contains(@id,'delete-record-')]");
    }

    public static Performable whitData(String firstName, String lastName){
        return  instrumented(EliminateRegister.class,firstName,lastName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(ToolsQaHomePage.class),
                GeneralActions.darClick(ToolsQaHomePage.BUTTON_ELEMENTS),
                GeneralActions.darClick(ToolsQaElementsPage.BUTTON_WEB_TABLES),
                GeneralActions.darClick(register)
        );
    }
}

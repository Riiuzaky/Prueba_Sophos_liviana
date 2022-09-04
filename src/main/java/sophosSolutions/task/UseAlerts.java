package sophosSolutions.task;

import javafx.scene.control.Alert;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actions.SendKeysIntoBy;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import sophosSolutions.interactions.GeneralActions;
import sophosSolutions.userInterfaces.ToolsQaAlertsPage;
import sophosSolutions.userInterfaces.ToolsQaDataPickersPage;
import sophosSolutions.userInterfaces.ToolsQaHomePage;
import sophosSolutions.userInterfaces.ToolsQaWidgetsPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UseAlerts implements Task {

    private  String name;

    public UseAlerts(String name) {
        this.name = name;
    }

    public static Performable whitData(String name){
        return  instrumented(UseAlerts.class,name);
    }

    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(ToolsQaHomePage.class),
                GeneralActions.darClick(ToolsQaHomePage.BUTTON_ALERTS),
                GeneralActions.darClick(ToolsQaAlertsPage.BUTTON_ALERTS),
                GeneralActions.darClick(ToolsQaAlertsPage.BUTTON_ALERT_NORMALY),
                Switch.toAlert().andAccept(),
                GeneralActions.darClick(ToolsQaAlertsPage.BUTTON_TIME_ALERT)



        );
        Thread.sleep(6000);

        actor.attemptsTo(
                Switch.toAlert().andAccept(),
                GeneralActions.darClick(ToolsQaAlertsPage.BUTTON_CONFIRM_ALERT),
                Switch.toAlert().andAccept(),
                GeneralActions.darClick(ToolsQaAlertsPage.BUTTON_CONFIRM_ALERT),
                Switch.toAlert().andAccept()

        );

        Thread.sleep(18000);

    }
}

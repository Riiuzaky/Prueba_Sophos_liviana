package sophosSolutions.interactions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouseToWebElement;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromBy;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import sophosSolutions.userInterfaces.ToolsQaDataPickersPage;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectTimeDataPickerTwo implements Performable {

    private String time;

    public SelectTimeDataPickerTwo(String time) {
        this.time = time;
    }

    public static Performable whitData(String year){
        return  instrumented(SelectTimeDataPickerTwo.class,year);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        By dato = By.xpath("//div[@class='react-datepicker__time-box']//ul[@class='react-datepicker__time-list']//li[contains(.,'"+time+"')]");
        By listaTime = By.xpath("//ul[@class='react-datepicker__time-list']");


        /*while(!Visibility.of(dato).answeredBy(actor)){
            actor.attemptsTo(
                    Click.on(ToolsQaDataPickersPage.BAJAR_YEAR_DATAPICKER2)
            );
        }*/
        actor.attemptsTo(
                Click.on(dato)
        );



    }

}

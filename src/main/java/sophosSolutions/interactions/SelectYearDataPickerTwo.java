package sophosSolutions.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Visibility;
import org.openqa.selenium.By;
import sophosSolutions.userInterfaces.ToolsQaDataPickersPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectYearDataPickerTwo implements Performable {

    private String year;

    public SelectYearDataPickerTwo(String year) {
        this.year = year;
    }

    public static Performable whitData(String year){
        return  instrumented(SelectYearDataPickerTwo.class,year);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        By dato = By.xpath("//div[@class='react-datepicker__year-option'][contains(.,'"+year+"')]");



        while(!Visibility.of(dato).answeredBy(actor)){
            actor.attemptsTo(
                    Click.on(ToolsQaDataPickersPage.BAJAR_YEAR_DATAPICKER2)
            );
        }

        actor.attemptsTo(
                Click.on(dato)
        );



    }
}

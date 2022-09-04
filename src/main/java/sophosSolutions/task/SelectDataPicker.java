package sophosSolutions.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import sophosSolutions.interactions.GeneralActions;
import sophosSolutions.interactions.SelectTimeDataPickerTwo;
import sophosSolutions.interactions.SelectYearDataPickerTwo;
import sophosSolutions.userInterfaces.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectDataPicker implements Task {

    private String year;
    private String month;
    private String day;
    private String time;

    public SelectDataPicker(String year, String month, String day, String time) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.time = time;
    }

    public static Performable whitData(String year, String month, String day, String time){
        return  instrumented(SelectDataPicker.class,year,month,day,time);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.browserOn().the(ToolsQaHomePage.class),
                GeneralActions.darClick(ToolsQaHomePage.BUTTON_WIDGETS),
                GeneralActions.darClick(ToolsQaWidgetsPage.BUTTON_DATAPICKERS),
                GeneralActions.darClick(ToolsQaDataPickersPage.INPUT_FIRST_DATAPICKER),
                GeneralActions.selectYearDataPicker(ToolsQaDataPickersPage.SELECT_YEAR,year),
                GeneralActions.selectMonthDataPicker(ToolsQaDataPickersPage.SELECT_MONTH,month),
                GeneralActions.selectDayDataPicker(day),
                GeneralActions.darClick(ToolsQaDataPickersPage.INPUT_SECOND_DATAPICKER),
                GeneralActions.darClick(ToolsQaDataPickersPage.SELECT_YEAR_PICKER2),
                SelectYearDataPickerTwo.whitData(year),
                GeneralActions.darClick(ToolsQaDataPickersPage.SELECT_MONTH_PICKER2),
                GeneralActions.selectMonthDataPicker2(month),
                GeneralActions.selectDayDataPicker(day),
                SelectTimeDataPickerTwo.whitData(time)

        );
    }
}

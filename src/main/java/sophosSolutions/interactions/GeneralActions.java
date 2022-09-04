package sophosSolutions.interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Select;
import org.openqa.selenium.By;

public class GeneralActions {

    public static Performable darClick(By object){
        return Click.on(object);

    }

    public static Performable darDoubleClick(By object){
        return DoubleClick.on(object);

    }

    public static Performable ingresarTexto(String dato, By object){
        return Enter.theValue(dato).into(object);

    }

    public static Performable selectYearDataPicker(By object,String option){
        return Select.option(option).from(object);

    }

    public static Performable selectMonthDataPicker(By object,String option){
        return Select.option(option).from(object);

    }

    public static Performable selectDayDataPicker(String day){

        By dato = By.xpath("//div[contains(@class,'"+day+"')]");
        //moverse a traves de las fechas
        return Click.on(dato);

    }

    public static Performable selectOptionDataPicker(String option){

        By dato = By.xpath("//div[contains(.,'"+option+"')]");
        return Click.on(dato);

    }

    public static Performable selectMonthDataPicker2(String option){
        By dato = By.xpath("//div[@class='react-datepicker__month-option'][contains(.,'"+option+"')]");
        return Click.on(dato);

    }







}

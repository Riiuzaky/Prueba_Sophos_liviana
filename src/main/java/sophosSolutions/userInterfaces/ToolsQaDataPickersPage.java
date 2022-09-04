package sophosSolutions.userInterfaces;

import org.openqa.selenium.By;


import java.util.List;

public class ToolsQaDataPickersPage {

    public static By INPUT_FIRST_DATAPICKER = By.id("datePickerMonthYearInput");
    public static By INPUT_SECOND_DATAPICKER = By.id("dateAndTimePickerInput");

    public static By SELECT_YEAR = By.xpath("//select[@class='react-datepicker__year-select']");
    public static By SELECT_MONTH = By.xpath("//select[@class='react-datepicker__month-select']");


    public static By SELECT_MONTH_PICKER2 = By.xpath("//span[@class='react-datepicker__month-read-view--selected-month']");
    public static By SELECT_YEAR_PICKER2 = By.xpath("//span[@class='react-datepicker__year-read-view--selected-year']");

    public static By BAJAR_YEAR_DATAPICKER2 = By.xpath("//div[@class='react-datepicker__year-option']//a[@class='react-datepicker__navigation react-datepicker__navigation--years react-datepicker__navigation--years-previous']");





}

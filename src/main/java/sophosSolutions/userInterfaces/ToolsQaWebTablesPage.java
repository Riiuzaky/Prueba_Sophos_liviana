package sophosSolutions.userInterfaces;

import org.openqa.selenium.By;

public class ToolsQaWebTablesPage {
    public static By BUTTON_ADD = By.id("addNewRecordButton");
    public static By INPUT_FIRTS_NAME = By.id("firstName");
    public static By INPUT_LAST_NAME = By.id("lastName");
    public static By INPUT_EMAIL = By.id("userEmail");
    public static By INPUT_AGE = By.id("age");
    public static By INPUT_SALARY = By.id("salary");
    public static By INPUT_DEPARTAMENT = By.id("department");
    public static By BUTTON_SUBMIT = By.id("submit");
    public static By BUTTON_NEXT = By.xpath("//div[@class='-next']//button[contains(text(),'Next')]");
    public static By INPUT_PAGE = By.xpath("//div[@class='-pageJump']//input");
    public static By TOTAL_PAGES = By.xpath("//span[@class='-totalPages']");




    //div[@class='rt-tr-group']//div[@class='rt-tr -even'][div[contains(.,'123')] and div[contains(.,'456')] and div[contains(.,'24')] and div[contains(.,'jonathans.cruzm@gmail.com')] and div[contains(.,'4500000')] and div[contains(.,'QA')]]

}

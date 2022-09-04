package sophosSolutions.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demoqa.com/")
public class ToolsQaHomePage extends PageObject {
    public static By BUTTON_ELEMENTS = By.xpath("(//div[@class='category-cards']//div[@class='card mt-4 top-card'])[1]");
    public static By BUTTON_WIDGETS = By.xpath("(//div[@class='category-cards']//div[@class='card mt-4 top-card'])[4]");
    public static By BUTTON_ALERTS = By.xpath("(//div[@class='category-cards']//div[@class='card mt-4 top-card'])[3]");
}

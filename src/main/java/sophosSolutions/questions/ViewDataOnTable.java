package sophosSolutions.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.questions.Visibility;
import org.openqa.selenium.By;
import sophosSolutions.userInterfaces.ToolsQaWebTablesPage;

public class ViewDataOnTable{

    public static Question<Boolean> tableIsVisible(String firstName, String lastName, String email, String age, String salary, String departament){

        return Question.about("Verificar si existe el registro").answeredBy(actor -> {
            By register = By.xpath("//div[@class='rt-tr-group']//div[div[contains(.,'"+firstName+"')] and div[contains(.,'"+lastName+"')] and div[contains(.,'"+email+"')] and div[contains(.,'"+age+"')] and div[contains(.,'"+salary+"')] and div[contains(.,'"+departament+"')]]");


            Integer totalPages = Text.of(ToolsQaWebTablesPage.TOTAL_PAGES).asInteger().answeredBy(actor);

            for (int i = 0; i < totalPages; i++) {
                if (Visibility.of(register).answeredBy(actor)) {
                    return true;
                } else {
                    actor.attemptsTo(
                            Scroll.to(ToolsQaWebTablesPage.BUTTON_NEXT),
                            Click.on(ToolsQaWebTablesPage.BUTTON_NEXT)
                            //WaitUntil.the(ToolsQaWebTablesPage.BUTTON_ADD, isVisible())
                            /*Wait.until(
                                    Value.of(ToolsQaWebTablesPage.INPUT_PAGE), equalTo("2")
                            )*/

                    );
                }
            }

            /*do{
                if(Visibility.of(register).answeredBy(actor)){
                    return true;
                }else{
                    actor.attemptsTo(
                    Scroll.to(ToolsQaWebTablesPage.BUTTON_NEXT),
                    Click.on(ToolsQaWebTablesPage.BUTTON_NEXT),
                    //WaitUntil.the(ToolsQaWebTablesPage.BUTTON_ADD, isVisible())
                            Wait.until(
                                    Value.of(ToolsQaWebTablesPage.INPUT_PAGE) , equalTo("2")
                            )

                    );
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }
            }while (Enabled.of(ToolsQaWebTablesPage.BUTTON_NEXT).answeredBy(actor));

            if(Visibility.of(register).answeredBy(actor)){
                return true;
            }
            */
            return false;

        });

    }

    public static Question<Boolean> tableNoIsVisible(String firstName, String lastName){

        By register = By.xpath("//div[@class='rt-tr-group'][div[contains(.,'"+firstName+"')] and div[contains(.,'"+lastName+"')]]");
        Question<Boolean> isVisible = actor -> false;
        Question<Boolean> isTrue = actor -> true;
        Question<Boolean> isEnabled = actor -> true;


        for (int i=0;i<20;i++) {
            isVisible = Visibility.of(register);
            isEnabled = Enabled.of(ToolsQaWebTablesPage.BUTTON_NEXT);

            if(isVisible.equals(isTrue)){
                isVisible = actor -> true;
                break;
            }else{
                if(i>=20 || isEnabled.equals(false)){
                    break;
                }
                Click.on(ToolsQaWebTablesPage.BUTTON_NEXT);
            }

        }
        return isVisible;
    }


    public static Question<String> obtenerTexto(){
        return actor -> TextContent.of("").asString().answeredBy(actor);
    }



}

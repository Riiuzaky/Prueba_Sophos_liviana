package sophosSolutions.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
//@RunWith(SerenityParameterizedRunner.class)
//@UseTestDataFrom(value = "testData/dataPrueba.csv")
@CucumberOptions(
        glue = "sophosSolutions.stepDefinitions",
        features = "src/test/resources/features/pruebaSophos.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class PruebaSophos {

}

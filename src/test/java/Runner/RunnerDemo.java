package Runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (plugin = {}, features = "C:\\javapro\\Test2Practice\\src\\test\\resources\\features",
glue = "StepDef")
public class RunnerDemo {
}

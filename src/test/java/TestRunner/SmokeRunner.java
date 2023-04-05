package TestRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features",glue = "StepDefinitions" ,dryRun = false, tags = "@testCase1")// dryRun just generates the code with true (keyword)/ and will run the testCase with false (keyword)
public class SmokeRunner {

}

//tags option will execute only the tagged testcase as mentioned in your runner class
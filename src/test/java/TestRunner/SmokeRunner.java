package TestRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features",
        glue = "StepDefinitions" ,
        dryRun = false, // dryRun just generates the code with true (keyword)/ and will run the testCase with false (keyword)
        tags = "@testCase2",
        plugin = {"pretty", "html:target/Cucumber.html","json:target/Cucumber.json","rerun:target/failed.txt"}
        //plugin = {"pretty"}
)

public class SmokeRunner {

}

//tags option will execute only the tagged testcase as mentioned in your runner class
//target folder is mostly used for storing the test case execution reports generated using Cucumber
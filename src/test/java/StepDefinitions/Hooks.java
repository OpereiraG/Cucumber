package StepDefinitions;

import Utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends CommonMethods {

    @Before
    public void preConditions(){
        openBrowserAndLaunchApplication();

    }

    //Scenario class holds the complete information of your tests execution in the Cucumber framework
    @After
    public void postConditions(Scenario scenario){
        byte[] pic;
        if (scenario.isFailed()){
            pic=takeScreenShot("failed/"+scenario.getName());
        }else {
            pic=takeScreenShot("passed/"+scenario.getName());
        }
        //attach my screenshot in my report

        scenario.attach(pic,"image/png",scenario.getName());


        closeBrowser();
    }

}

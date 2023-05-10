package StepDefinitions;

import Utils.CommonMethods;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Google extends CommonMethods {
    @When("user enter text")
    public void user_enter_text() throws InterruptedException {
        doClick(googlePage.sendTextGoogle);
        Thread.sleep(2000);
        sendText(googlePage.sendTextGoogle, "Facebook");
        googlePage.sendTextGoogle.sendKeys(Keys.ENTER);

    }

}

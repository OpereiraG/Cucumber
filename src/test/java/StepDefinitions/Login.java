package StepDefinitions;

import Pages.LoginPage;
import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class Login extends CommonMethods {

    @Given("open the browser and launch HMRS application")
    public void open_the_browser_and_launch_hmrs_application() {
       // new ChromeDriver();
    openBrowserAndLaunchApplication();



    }

    @When("user enters valid email and valid password")
    public void user_enters_valid_email_and_valid_password() {
       // driver.findElement(By.id("txtUsername")).sendKeys(ConfigReader.getPropertyValue("username"));

        //LoginPage loginPage = new LoginPage();

        sendText(loginPage.usernameTextBox,ConfigReader.getPropertyValue("username"));
        //driver.findElement(By.id("txtPassword")).sendKeys(ConfigReader.getPropertyValue("password"));

        sendText(loginPage.passwordTextBox,ConfigReader.getPropertyValue("password"));
    }

    @When("click on login button")
    public void click_on_login_button() {

        //LoginPage loginPage = new LoginPage();


        doClick(loginPage.loginBtn);
    }

    @Then("user successfully logged into the application")
    public void user_successfully_logged_in() {
        boolean userloggedIn = driver.findElement(By.xpath("//a[contains(text(), 'Welcome')]")).isDisplayed();
            if (userloggedIn) {
                System.out.println("User is logged in Successfully");
            }
        }
    @Then("Close the browser")
    public void close_the_browser() {
        closeBrowser();
    }
    @When("user enters valid {string} and valid {string}")
    public void user_enters_valid_and_valid(String username, String password) {
//LoginPage loginPage = new LoginPage();

        sendText(loginPage.usernameTextBox,username);


        sendText(loginPage.passwordTextBox,password);
    }
    @When("user enters username and password and verifies login")
    public void user_enters_username_and_password_and_verifies_login(DataTable dataTable) {
       // LoginPage loginPage = new LoginPage();
        List<Map<String ,String >> userCredentials=dataTable.asMaps();
        for (Map<String, String> userCredential : userCredentials) {
            String username = userCredential.get("username");
            String password = userCredential.get("password");


            sendText(loginPage.usernameTextBox,username);


            sendText(loginPage.passwordTextBox,password);


            doClick(loginPage.loginBtn);


            doClick(loginPage.welcomeIcon);


            doClick(loginPage.logoutLink);

        }

    }

}


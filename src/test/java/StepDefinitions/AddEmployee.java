package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class AddEmployee extends CommonMethods {

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
    }
    @When("user clicks on add employee button")
    public void user_clicks_on_add_employee_button() {
        driver.findElement(By.id("menu_pim_addEmployee")).click();

    }
    @When("user enters firstname,middle name and lastname")
    public void user_enters_firstname_middle_name_and_lastname() {
        driver.findElement(By.id("firstName")).sendKeys(ConfigReader.getPropertyValue("firstName"));
        driver.findElement(By.id("middleName")).sendKeys(ConfigReader.getPropertyValue("middleName"));
        driver.findElement(By.id("lastName")).sendKeys(ConfigReader.getPropertyValue("lastName"));

    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        driver.findElement(By.id("btnSave")).click();
    }
}

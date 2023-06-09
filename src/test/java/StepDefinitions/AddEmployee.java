package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddEmployee extends CommonMethods {

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        //WebElement pimTab = driver.findElement(By.id("menu_pim_viewPimModule"));
        doClick(addEmployeePage.pimTab);
    }
    @When("user clicks on add employee button")
    public void user_clicks_on_add_employee_button() {
       //WebElement addEmpBtn = driver.findElement(By.id("menu_pim_addEmployee"));
       doClick(addEmployeePage.addEmpBtn);

    }
    @When("user enters firstname,middle name and lastname")
    public void user_enters_firstname_middle_name_and_lastname() {

        //driver.findElement(By.id("firstName")).sendKeys(ConfigReader.getPropertyValue("firstName"));
        //WebElement firsNameTextBox = driver.findElement(By.id("firstName"));
        sendText(addEmployeePage.firsNameTextBox, ConfigReader.getPropertyValue("firstName"));

        //driver.findElement(By.id("middleName")).sendKeys(ConfigReader.getPropertyValue("middleName"));
        //WebElement middleNameTextBox = driver.findElement(By.id("middleName"));
        sendText(addEmployeePage.middleNameTextBox, ConfigReader.getPropertyValue("middleName"));

        //driver.findElement(By.id("lastName")).sendKeys(ConfigReader.getPropertyValue("lastName"));
        //WebElement lastNameTextBox = driver.findElement(By.id("lastName"));
        sendText(addEmployeePage.lastNameTextBox, ConfigReader.getPropertyValue("lastName"));

    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        //WebElement btnSave = driver.findElement(By.id("btnSave"));
        doClick(addEmployeePage.btnSave);
    }
}

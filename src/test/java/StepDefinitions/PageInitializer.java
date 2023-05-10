package StepDefinitions;

import Pages.AddEmployeePage;
import Pages.GooglePage;
import Pages.LoginPage;

public class PageInitializer {
public static LoginPage loginPage;
public static AddEmployeePage addEmployeePage;
public static GooglePage googlePage;
    public static void initializePageObjects(){
        loginPage=new LoginPage();
        addEmployeePage=new AddEmployeePage();
        googlePage = new GooglePage();
    }

}

// This class will manage the object creation of different page Objects in our Framework.
// Instead of calling the age objects again and again, this class will take good care of that step

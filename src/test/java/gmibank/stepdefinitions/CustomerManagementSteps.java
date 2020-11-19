package gmibank.stepdefinitions;

import gmibank.pages.CustomerManagementPage;
import gmibank.pages.LoginPage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;

public class CustomerManagementSteps {

    CustomerManagementPage customerManagmentPage=new CustomerManagementPage();
    LoginPage loginPage=new LoginPage();

    @Given("user click on sign in")
    public void user_click_on_sign_in() {
    loginPage.accountMenu.click();
    loginPage.signInLink.click();
    }

    @Given("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
    loginPage.userName.sendKeys(ConfigurationReader.getProperty("employeeUsername"));
    loginPage.password.sendKeys(ConfigurationReader.getProperty("employeePassword"));
    loginPage.submitButton.click();
    }

    @Given("user clicks on My Operations link")
    public void user_clicks_on_My_Operations_link() {
        customerManagmentPage.myOperationsLink.click();

    }

    @Given("user clicks on Manage Customers link")
    public void user_clicks_on_Manage_Customers_link() {
        customerManagmentPage.manageCustomersLink.click();
    }

    @Given("user clicks on Create a new customer link")
    public void user_clicks_on_Create_a_new_customer_link() {

        customerManagmentPage.createANewCustomerButton.click();
    }
}

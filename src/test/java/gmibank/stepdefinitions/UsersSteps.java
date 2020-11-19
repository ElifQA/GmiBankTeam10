package gmibank.stepdefinitions;

import gmibank.pages.LoginPage;
import gmibank.pages.RegistrationPage;
import gmibank.pages.UsersPage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class UsersSteps {

    LoginPage loginPage=new LoginPage();
    UsersPage usersPage=new UsersPage();

    @Given("user signs in as an Admin")
    public void user_signs_in_as_an_Admin() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        Driver.waitAndClick(loginPage.submitButton,3);

    }
    @Then("verify First Name Last Name Middle Initial  Email  Mobile Phone Number  Phone Number  Address  Create Date are there")
    public void verify_First_Name_Last_Name_Middle_Initial_Email_Mobile_Phone_Number_Phone_Number_Address_Create_Date_are_there() {
        if (usersPage.firstNameText.isDisplayed()){
            System.out.println("First Name text box is here");
        }else{
            System.out.println("First Name text box is not here");
        }
    }

    @Then("verify a clickable View button is there")
    public void verify_a_clickable_View_button_is_there() {
        Driver.scrollToElement(usersPage.page23);
        Driver.waitAndClick(usersPage.page23,2);
        Driver.verifyElementDisplayed(usersPage.viewButton);
        Driver.scrollToElement(usersPage.viewButton);
    }

    @Then("verify a clickable Edit button")
    public void verify_a_clickable_Edit_button() {
        Driver.scrollToElement(usersPage.page23);
        Driver.waitAndClick(usersPage.page23,2);
        Driver.verifyElementDisplayed(usersPage.editButton);
        Driver.scrollToElement(usersPage.editButton);
    }
    @Given("users clicks on customer's Edit button")
    public void users_clicks_on_customer_s_Edit_button() {
        Driver.scrollToElement(usersPage.page23);
        Driver.waitAndClick(usersPage.page23,2);
        Driver.clickWithJS(usersPage.editButton);
    }

    @Then("edit the login name and clicks on Save button")
    public void edit_the_login_name_and_clicks_on_Save_button() {
        usersPage.loginTextbox.clear();
        usersPage.loginTextbox.sendKeys("userpixie");
        Driver.waitAndClick(usersPage.saveButton,2);
    }
    @Then("edit the first name and click on Save button")
    public void edit_the_first_name_and_click_on_Save_button() {

    }

    @Then("edit the last name and click on Save button")
    public void edit_the_last_name_and_click_on_Save_button() {

    }
    @Then("edit the email and click Save button")
    public void edit_the_email_and_click_Save_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}

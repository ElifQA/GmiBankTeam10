package gmibank.stepdefinitions;

import gmibank.pages.LoginPage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    LoginPage login = new LoginPage();

    @Given("user open Gmi Bank website")
    public void user_open_Gmi_Bank_website() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("user click on account menu")
    public void user_click_on_account_menu() {
        login.accountMenu.click();
    }

    @When("click on sign in tab")
    public void click_on_sign_in_tab() {
        Driver.waitForVisibility(login.signInLink, 10);
        login.signInLink.click();

    }

    @When("user enter username {string}")
    public void user_enter_username(String string) {
        Driver.waitForVisibility(login.userName, 10);
        login.userName.sendKeys(ConfigurationReader.getProperty("username"));

    }

    @When("user enter password {string}")
    public void user_enter_password(String string) {
        login.password.sendKeys(ConfigurationReader.getProperty("password"));

    }


    @Then("click on sign in button")
    public void click_on_sign_in_button() {
        Driver.waitAndClick(login.submitButton, 5);

    }
//Ziya

//    @And("user click on accountMenu")
//    public void userClickOnAccountMenu() {
//        Driver.waitAndClick(login.accountMenu,2);
//    }
//
//
//    @And("user click on the signinLink")
//    public void userClickOnTheSigninLink() {
//        Driver.waitAndClick(login.signInLink,2);
//    }
//
//    @Then("user click on the username box and enter invalid username")
//    public void userClickOnTheUsernameBoxAndEnterInvalidUsername() throws InterruptedException {
//        Driver.waitAndSendKeys(login.userName,"ziya",2);
//        Thread.sleep(5000);
//    }
}

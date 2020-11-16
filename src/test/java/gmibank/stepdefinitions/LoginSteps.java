package gmibank.stepdefinitions;

import gmibank.pages.LoginPage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    LoginPage login = new LoginPage();

    @Given("user open Gmi Bank website")
    public void user_open_Gmi_Bank_website() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.wait(3);

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
    @When("user enter username {string}, and password {string}")
    public void user_enter_username_and_password(String userName, String Password) {
        //login.userName.sendKeys(ConfigurationReader.getProperty("US_15Username"));
        login.userName.sendKeys(userName);
        login.password.sendKeys(Password);
    }

    @Then("click on sign in button")
    public void click_on_sign_in_button() {
        Driver.waitAndClick(login.submitButton, 5);

    }
//Ziya


    @And("user click on accountMenu")
    public void userClickOnAccountMenu() {
        Driver.waitAndClick(login.accountMenu,2);
    }


    @And("user click on the signinLink")
    public void userClickOnTheSigninLink() {
        Driver.waitAndClick(login.signInLink,2);
        Driver.wait(3);
    }

    @Then("user click on the username box and enter invalid username")
    public void userClickOnTheUsernameBoxAndEnterInvalidUsername() throws InterruptedException {
        Driver.waitAndSendKeys(login.userName,"ziya",2);
        Thread.sleep(5000);
    }

    @And("user send valid password")
    public void userSendValidPassword() {
        Driver.waitAndSendKeys(login.password,"Test@123",4);
    }


    @And("user enter invalid user name and valid password")
    public void userEnterValidUserNameAndValidPassword() {
        login.login("team","Team10*");
    }


    @Then("user see displaied error message")
    public void userSeeDisplaiedErrorMessage() {
       Driver.verifyElementDisplayed(login.signinFailText);
    }


    @And("user enter valid user name and invalid password")
    public void userEnterValidUserNameAndInvalidPassword() {
        login.login("team10","Team10");
    }

    @And("user enter in valid user name and invalid password")
    public void userEnterInValidUserNameAndInvalidPassword() {
        login.login("team","Team");
    }



    @Then("user can click on forget option and validate forget password option is available")
    public void userCanClickOnForgetOptionAndValidateForgetPasswordOptionIsAvailable() {
        login.forgetPasswordOption.click();
        Driver.wait(3);
        login.resetPassword.isDisplayed();
    }

    @Then("user can click on register new account option and see registration form")
    public void userCanClickOnRegisterNewAccountOptionAndSeeRegistrationForm() {
        login.registerNewAccount.click();
        Driver.wait(3);
        login.registrationForm.isDisplayed();
    }

    @Then("User sign in as an admin")
    public void userSignInAsAnAdmin() {
        login.login("team10","Team10*");
        Driver.wait(2);
    }

}


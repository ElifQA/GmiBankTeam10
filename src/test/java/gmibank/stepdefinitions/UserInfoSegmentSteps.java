package gmibank.stepdefinitions;


import gmibank.pages.UserInfoSegmentPage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserInfoSegmentSteps {
    UserInfoSegmentPage us_006Page= new UserInfoSegmentPage();

    @Given("user open Gmi Bank website")
    public void user_open_Gmi_Bank_website() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("user click on account menu")
    public void user_click_on_account_menu() {
    us_006Page.accountMenu.click();
    }
    @When("click on sign in tab")
    public void click_on_sign_in_tab() {
        us_006Page.signInLink.click();

    }
    @When("user enter username")
    public void user_enter_username() {
        us_006Page.userName.sendKeys("team10");

    }
    @When("user enter password")
    public void user_enter_password() {
        us_006Page.password.sendKeys("Team10*");

    }
    @Then("click on sign in button")
    public void click_on_sign_in_button() {
        us_006Page.submitButton.click();

    }
    @Then("verify user is on home page")
    public void verify_user_is_on_home_page() {
    boolean Logo=us_006Page.logo.isDisplayed();
        System.out.println( "user is on home page"+ Logo);

    }

    @When("user click on user icon")
    public void user_click_on_user_icon() {
        us_006Page.userIcon.click();

    }

    @When("click on user info tab")
    public void click_on_user_info_tab() {
        us_006Page.userInfo.click();

    }

    @Then("user info being populated")
    public void user_info_being_populated() {
        us_006Page.saveButton.click();

    }


}

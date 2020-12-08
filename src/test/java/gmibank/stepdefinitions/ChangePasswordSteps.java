package gmibank.stepdefinitions;

import gmibank.pages.GmiPage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangePasswordSteps {
    GmiPage gmiPage = new GmiPage();

  //  @Given("I as a user navigate to GMI bank webPage")
    public void i_as_a_user_navigate_to_GMI_bank_webPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));    }

    @Given("I as a user choose signin from dropdown menu")
    public void i_as_a_user_choose_signin_from_dropdown_menu()  {
        gmiPage.usericon.click();
    }

    @When("I as a user enter my UserName and Password in to opened frame")
    public void i_as_a_user_enter_my_UserName_and_Password_in_to_opened_frame()  {
        gmiPage.userName.sendKeys("team10");
        gmiPage.password.sendKeys("Team10*");
    }

    @Then("I click sign in button and sign in")
    public void i_click_sign_in_button_and_sign_in() {  gmiPage.signin.click();     }


    @Then("I click on My username")
    public void i_click_on_My_username() { gmiPage.accountMenu.click();    }

    @Then("I choose password from dropdown menu")
    public void i_choose_password_from_dropdown_menu() { gmiPage.passMenu.click();    }

    @Then("I enter my current password")
    public void i_enter_my_current_password() {gmiPage.curPass.sendKeys("Team10*");    }

    @Then("I enter valid password as new password")
    public void i_enter_valid_password_as_new_password() {gmiPage.newPass.sendKeys("password");

    }

    @Then("I enter same valid pasword for confirmation")
    public void i_enter_same_valid_pasword_for_confirmation() { gmiPage.conPass.sendKeys("password");    }

    @Then("I click save button")
    public void i_click_save_button() {gmiPage.bttnSave.click();    }

    @Then("I observe pop up as {string}")
    public void i_observe_pop_up_as(String string) { Driver.verifyElementDisplayed(gmiPage.confMessage);    }

    @When("I enter {string} in New Password and confirmation box")
    public void i_enter_in_New_Password_and_confirmation_box(String string) { gmiPage.conPass.sendKeys("password");    }

    @Then("I see {string}")
    public void i_see(String string) { Driver.verifyElementDisplayed(gmiPage.confMessage);    }

}

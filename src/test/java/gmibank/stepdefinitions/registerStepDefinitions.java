package gmibank.stepdefinitions;



import gmibank.pages.GmiPage;
import gmibank.pages.UserAccountPage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.BeforeClass;

public class registerStepDefinitions {
    GmiPage  gmiPage = new GmiPage();

    @Given("I as a user navigate to GMI bank webPage")
    public void i_as_a_user_navigate_to_GMI_bank_webPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
         }

    @Given("I as a user click to login sign")
    public void i_as_a_user_click_to_login_sign() {
        gmiPage.usericon.click();
    }

    @Given("I as a user choose register from dropdown menu")
    public void i_as_a_user_choose_register_from_dropdown_menu() {
        gmiPage.registerLink.click();
    }

    @Then("I as a user enter {string} to ssn box")
    public void i_as_a_user_enter_to_ssn_box(String string) {
        gmiPage.ssnBox.sendKeys(string);
    }
    /*
    @Then("i validate no eroor message observed")
    public void i_validate_no_eroor_message_observed() {
    Driver.wait(2);
    Driver.verifyElementDisplayed(gmiPage.ssnAlert);
    }
    */


    @When("I enter a valid name that contains chars and cannot be blank.")
    public void i_enter_a_valid_name_that_contains_chars_and_cannot_be_blank() {
        gmiPage.firstName.sendKeys("Kadir");
    }

    @Then("I enter a valid lastname that contains chars and it is a required field.")
    public void i_enter_a_valid_lastname_that_contains_chars_and_it_is_a_required_field() {
        gmiPage.lastName.sendKeys("Gok");
    }

    @Then("I can provide chars and digits to describe a valid address along with zip code.")
    public void i_can_provide_chars_and_digits_to_describe_a_valid_address_along_with_zip_code() {
        gmiPage.adress.sendKeys("12345 Double Lane Fairfax.Va");
    }

    @Then("I should provide {int} digit-long mobilephone number as a required field respecting the {string}")
    public void i_should_provide_digit_long_mobilephone_number_as_a_required_field_respecting_the(Integer int1, String string) {
        gmiPage.mobilePhone.sendKeys("571-236-2729");
    }

    @Then("I enter a valid username that contains chars and it is a required field.")
    public void i_enter_a_valid_username_that_contains_chars_and_it_is_a_required_field() {
        gmiPage.userName.sendKeys("Akasema");
    }
    @Then("I provide a valid email format that contains {string}, {string} extensions")
    public void i_provide_a_valid_email_format_that_contains_extensions(String string, String string2) {gmiPage.email.sendKeys("kadirgok300@gmail.com");

    }

    @Then("I enter a valid firstPassword that contains chars and it is a required field.")
    public void i_enter_a_valid_firstPassword_that_contains_chars_and_it_is_a_required_field() {
        gmiPage.firstPassword.sendKeys("Sema1234");
    }
    @Then("I enter a valid secondPassword that contains chars and it is a required field.")
    public void i_enter_a_valid_secondPassword_that_contains_chars_and_it_is_a_required_field() {
        gmiPage.firstPassword.sendKeys("Sema1234");
    }

    @Then("i click submit button")
    public void i_click_submit_button() {
        gmiPage.submit.click();
    }
}

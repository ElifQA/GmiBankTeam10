package gmibank.stepdefinitions;

import gmibank.pages.RegistrationPage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class RegistrationSteps {
    RegistrationPage us002Pages=new RegistrationPage();
    @Given("user is on the page")
    public void user_is_on_the_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Given("user goes to registration page")
    public void user_goes_to_registration_page() {
        us002Pages.registration.click();
        us002Pages.register.click();

    }

    @Given("user leaves the SSN checkbox blank")
    public void user_leaves_the_SSN_checkbox_blank() {
        us002Pages.ssnCheckbox.sendKeys("");
    }

    @Given("user enters a valid SSN {string}")
    public void user_enters_a_valid_SSN(String string) {
        us002Pages.ssnCheckbox.sendKeys(ConfigurationReader.getProperty("ssn"));
    }

    @Given("user enters a valid first name {string}")
    public void user_enters_a_valid_first_name(String string) {
        us002Pages.firstName.sendKeys(ConfigurationReader.getProperty("firstname"));
    }

    @Given("user enters a valid last name {string}")
    public void user_enters_a_valid_last_name(String string) {
        us002Pages.lastName.sendKeys(ConfigurationReader.getProperty("lastname"));
    }

    @Given("user enters a valid address {string}")
    public void user_enters_a_valid_address(String string) {
        us002Pages.address.sendKeys(ConfigurationReader.getProperty("address"));
    }

    @Given("user enters a mobile phone number {string}")
    public void user_enters_a_mobile_phone_number(String string) {
        us002Pages.mobilephone.sendKeys(ConfigurationReader.getProperty("mobilephone"));
    }

    @Given("user enters a valid username {string}")
    public void user_enters_a_valid_username(String string) {
        us002Pages.username.sendKeys(ConfigurationReader.getProperty("registrationUsername"));
    }

    @Given("user enters a valid email {string}")
    public void user_enters_a_valid_email(String string) {
        us002Pages.email.sendKeys(ConfigurationReader.getProperty("email"));
    }

    @Given("user enters a valid password {string}")
    public void user_enters_a_valid_password(String string) {
        us002Pages.firstPassword.sendKeys(ConfigurationReader.getProperty("registrationPassword"));
    }

    @Given("user enters the same password for confirmation {string}")
    public void user_enters_the_same_password_for_confirmation(String string) {
        us002Pages.secondPassword.sendKeys(ConfigurationReader.getProperty("registrationPassword"));
    }

    @Then("user clicks on {string} button")
    public void user_clicks_on_button(String string) {

        us002Pages.registerButton.click();
    }
    @Then("user should see a success message")
    public void user_should_see_a_success_message() {
        Driver.scrollToElement(us002Pages.redMessage);
        Driver.scrollToElement(us002Pages.redMessage);
        Driver.wait(3);

        Assert.assertTrue(us002Pages.successMessage.getText().contains("saved"));

    }

    @Then("user should see {string} message")
    public void user_should_see_message(String string) {
        Driver.scrollToElement(us002Pages.redMessage);
        Driver.scrollToElement(us002Pages.redMessage);
        Driver.wait(3);

        Assert.assertEquals(us002Pages.redMessage.getText(), "translation-not-found[Your SSN is required]");
    }
    @Given("user leaves first name text box blank")
    public void user_leaves_firstname_textbox_blank() {
        us002Pages.firstName.sendKeys(""+ Keys.ENTER);
    }

    @Then("user should see {string}")
    public void user_should_see(String string) {

        Assert.assertTrue(ConfigurationReader.getProperty("errorMessage").contains("required"));
    }
    @Given("user leaves last name as blank")
    public void user_leaves_last_name_as_blank() {
        us002Pages.lastName.sendKeys(""+Keys.ENTER);

    }
}

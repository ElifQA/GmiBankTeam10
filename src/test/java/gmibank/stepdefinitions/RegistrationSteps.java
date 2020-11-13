package gmibank.stepdefinitions;

import gmibank.pages.RegistrationPage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;

public class RegistrationSteps {
    RegistrationPage us002Pages = new RegistrationPage();

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
        Driver.waitAndSendKeys(us002Pages.ssnCheckbox, "ssnErrorMessage", 3);
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
        Driver.waitAndSendKeys(us002Pages.firstName, "firstNameErrorMessage", 3);
        Assert.assertTrue(us002Pages.firstNameErrorMessage.getText().contains("required"));
    }

    @Then("user should see {string}")
    public void user_should_see(String string) {
        Assert.assertTrue(us002Pages.firstNameErrorMessage.getText().contains("required"));
    }

    @Given("user leaves last name as blank")
    public void user_leaves_last_name_as_blank() {

        Driver.waitAndSendKeys(us002Pages.lastName, "lastNameErrorMessage", 3);
        Assert.assertTrue(us002Pages.lastNameErrorMessage.getText().contains("required"));
    }

    @Given("user leaves address as blank")
    public void user_leaves_address_as_blank() {

        Driver.waitAndSendKeys(us002Pages.address, "addressErrorMessage", 3);
        //Assert.assertTrue(ConfigurationReader.getProperty("addressErrorMessage"));
        try {
            ConfigurationReader.getProperty("addressErrorMessage");

        }
        catch (NoSuchElementException e){

        }
    }

    @Given("user leaves mobile phone number as blank")
    public void user_leaves_mobile_phone_number_as_blank() {
        Driver.waitAndSendKeys(us002Pages.mobilephone, "Your Mobile Phone Number is required", 3);
        //Assert.assertTrue(ConfigurationReader.getProperty("mobilephoneErrorMessage").contains("required"));
        try{
            ConfigurationReader.getProperty("mobilephoneErrorMessage");

        }
        catch (NoSuchElementException e){

        }
    }

    @Given("user leaves username as blank")
    public void user_leaves_username_as_blank() {
        Driver.waitAndSendKeys(us002Pages.username, "Your username is required.", 3);
        Assert.assertTrue(us002Pages.usernameErrorMessage.getText().contains("required"));
    }

    @Given("user leaves email as blank")
    public void user_leaves_email_as_blank() {
        Driver.waitAndSendKeys(us002Pages.email, "Your email is required.", 2);
        Assert.assertTrue(us002Pages.emailErrorMessage.getText().contains("required"));


    }
    @Given("user leaves new password as blank")
    public void user_leaves_new_password_as_blank() {
        Driver.waitAndSendKeys(us002Pages.firstPassword,"Your password is required.",3);
        Assert.assertTrue(us002Pages.newPasswordErrorMessage.getText().contains("required"));
    }
    @Given("user leaves new password confirmation as blank")
    public void user_leaves_new_password_confirmation_as_blank() {
        Driver.waitAndSendKeys(us002Pages.secondPassword,"Your confirmation password is required.",3);
        Assert.assertTrue(us002Pages.newPasswordConfirmationErrorMessage.getText().contains("required"));
    }

    @Given("user enters a SSN with char in the beginning")
    public void user_enters_a_SSN_with_char_in_the_beginning() {
        us002Pages.ssnCheckbox.sendKeys("a11-33-2222"+Keys.ENTER);
    }
    @Then("user should see \\{string} message")
    public void user_should_see_message() {
    Assert.assertTrue(us002Pages.ssnErrorMessage.getText().contains("invalid"));
    }
    @Given("user enters a SSN with char in the middle")
    public void user_enters_a_SSN_with_char_in_the_middle() {
        us002Pages.ssnCheckbox.sendKeys("211-3a-2222"+Keys.ENTER);
        Driver.waitForVisibility(us002Pages.ssnErrorMessage,5);
        Assert.assertTrue(us002Pages.ssnErrorMessage.isDisplayed());
    }
    @Given("user enters a SSN with char at the end")
    public void user_enters_a_SSN_with_char_at_the_end() {
        us002Pages.ssnCheckbox.sendKeys("211-38-222a"+Keys.ENTER);
    }
    @Given("user enters a phone number with a char in the begining")
    public void user_enters_a_phone_number_with_a_char_in_the_begining() {
        us002Pages.mobilephone.sendKeys("Phone number: a23-234-4455"+Keys.ENTER);

    }
    @Given("user enters an email without @ sign")
    public void user_enters_an_email_without_sign() {
        us002Pages.email.sendKeys("lindapinegmail.com"+Keys.ENTER);
        Assert.assertTrue(us002Pages.emailErrorMessage.isDisplayed());
    }
}

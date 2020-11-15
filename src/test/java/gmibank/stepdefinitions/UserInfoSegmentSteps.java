package gmibank.stepdefinitions;


import gmibank.pages.UserInfoSegmentPage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.util.List;

public class UserInfoSegmentSteps {
    UserInfoSegmentPage us_006Page = new UserInfoSegmentPage();

    @Then("verify user is on home page")
    public void verify_user_is_on_home_page() {
        Driver.verifyElementDisplayed(us_006Page.logo);


    }

    @When("user click on user icon")
    public void user_click_on_user_icon() {
        us_006Page.userIcon.click();

    }

    @When("click on user info tab")
    public void click_on_user_info_tab() {
        Driver.waitForVisibility(us_006Page.userInfo, 10);
        us_006Page.userInfo.click();

    }

    @Then("user info being populated")
    public void user_info_being_populated() {

        Driver.verifyElementDisplayed(us_006Page.firstname);
    }

    //TC-02
    @Then("verify there should be two languages available")
    public void verify_there_should_be_two_languages_available() {
        Select select = new Select(us_006Page.language);
        List<WebElement> list = select.getOptions();
        boolean flagEnglish= false;
        boolean flagTurkce= false;
        for (WebElement List : list) {
            String gettext = List.getText();
            if(gettext.contains("English")){
                flagEnglish= true;
            }
            if(gettext.contains("Türkçe")){
                flagTurkce=true;
            }
        }
        if(flagEnglish && flagTurkce){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }
    }


    @Then("enter firstname {string}")
    public void enter_firstname(String string) {
        us_006Page.firstname.clear();
        us_006Page.firstname.sendKeys(ConfigurationReader.getProperty("US_06Firstname"));
    }

    @Then("enter lastname {string}")
    public void enter_lastname(String string) {
        us_006Page.lastname.clear();
        us_006Page.lastname.sendKeys(ConfigurationReader.getProperty("US_06Lastname"));

    }

    @Then("user click on save button")
    public void user_click_on_save_button() {
        us_006Page.saveButton.click();

    }

    @Then("verify updated message is displayed")
    public void verify_updated_message_is_displayed() {
        Driver.waitForVisibility(us_006Page.savedMessage, 2000);
       // Assert.assertTrue(us_006Page.savedMessage.getText().contains("Settings saved!"));
        // String str = us_006Page.savedMessage.getText();
       //System.out.println(str);
       Driver.verifyElementDisplayed(us_006Page.savedMessage);

    }

    //TC04
    @When("user enter email {string}")
    public void user_enter_email(String string) throws InterruptedException {
        us_006Page.email.clear();
        us_006Page.email.sendKeys(string);
    }

    @Then("verify email address contains @ and .com")
    public void verify_email_address_contains_and_com() {
        Driver.waitForVisibility(us_006Page.email, 2000);
    Assert.assertTrue(us_006Page.email.getAttribute("value").contains(".com"));
    Assert.assertTrue(us_006Page.email.getAttribute("value").contains("@"));


   }
}
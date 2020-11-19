package gmibank.stepdefinitions;

import gmibank.pages.LoginPage;
import gmibank.pages.UserAccountPage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserAccountSteps {
    UserAccountPage userAccountPage= new UserAccountPage();
   LoginPage login=new LoginPage();

   @When("user enter username {string}, and password {string}")
    public void user_enter_username_and_password(String userName, String Password) {
        login.userName.sendKeys(ConfigurationReader.getProperty("US_15Username"));
        login.password.sendKeys(ConfigurationReader.getProperty("US_15Password"));

    }


        @And("user click on My Operations dropdown menu")
    public void user_click_on_My_Operations_dropdown_menu() {
        userAccountPage.myOperations.click();
    }

    @When("click on My accounts")
    public void click_on_My_accounts() {
        Driver.waitAndClick(userAccountPage.myAccount,3);

    }

    @Then("verify user account types and balance isdisplayed")
    public void verify_user_account_types_and_balance_isdisplayed() {
            Driver.waitForVisibility(userAccountPage.accountType,5);
        Driver.verifyElementDisplayed(userAccountPage.accountType);
    //Assert.assertTrue(userAccountPage.accountType.isDisplayed());
        System.out.println( userAccountPage.accountType.getText());

    }
    @And("user click on view transaction button")
    public void userClickOnViewTransactionButton() {
            Driver.waitAndClick(userAccountPage.viewTransactionButton,5);
            //userAccountPage.viewTransactionButton.click();
    }

    @Then("user can see transaction")
    public void userCanSeeTransaction() {
            Driver.waitForVisibility(userAccountPage.transfer,3);
            Driver.verifyElementDisplayed(userAccountPage.transfer);

    }


}

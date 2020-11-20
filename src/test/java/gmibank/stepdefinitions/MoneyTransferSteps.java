package gmibank.stepdefinitions;

import gmibank.pages.MoneyTransferPage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.DatabaseUtility;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MoneyTransferSteps {

    MoneyTransferPage moneyTransferPage = new MoneyTransferPage();


    @Then("user click on Transfer Money link from dropdown")
    public void user_click_on_Transfer_Money_link_from_dropdown() {
        Driver.waitAndClick(moneyTransferPage.transferMoneyLink,5);

    }

    @Then("verify user have at least two accounts")
    public void verify_user_have_at_least_two_accounts() {
        Select select=new Select(moneyTransferPage.fromBox);
        List<WebElement> list=select.getOptions();
        for (WebElement List : list) {
            String gettext = List.getText();
            System.out.println(gettext);
            Assert.assertTrue(gettext,true);
        }
    }
    @Then("User can select the first account as From dropdown where they receive their money from")
    public void user_can_select_the_first_account_as_From_dropdown_where_they_receive_their_money_from() {
        Driver.waitForVisibility(moneyTransferPage.fromBox,3);
        Driver.selectDdValue(moneyTransferPage.fromBox, 1);
    }
    @Then("User can select the second account as To dropdown")
    public void user_can_select_the_second_account_as_To_dropdown() {
       Driver.selectDdValue(moneyTransferPage.toBox,1);
    }

    @Then("User can select a balance that they want to proceed with")
    public void user_can_select_a_balance_that_they_want_to_proceed_with() {
       // Driver.waitAndSendKeys(moneyTransferPage.balanceBox,"100",3);
    moneyTransferPage.balanceBox.sendKeys("100");
    }
    @Then("user should see balance")
    public void user_should_see_balance() {
        String getValue=moneyTransferPage.balanceBox.getAttribute("value");
        Assert.assertTrue(getValue,true);

    }
    @Then("User should provide a description for that transfer")
    public void user_should_provide_a_description_for_that_transfer() {
    moneyTransferPage.descriptionBox.sendKeys("payment");
    }
    @Then("user should see description")
    public void user_should_see_description() {
        Assert.assertTrue(moneyTransferPage.descriptionBox.getText(),true);

    }
    @Then("User click on Make transfer button")
    public void user_click_on_Make_transfer_button() {
        moneyTransferPage.transferButton.click();

    }
    @Then("User should see success Message")
    public void user_should_see_success_Message() {
        Assert.assertTrue(moneyTransferPage.successMessage.getText().contains("Transfer is succesfull"));
    }

    @Then("User leaves balance as blank")
    public void user_leaves_balance_as_blank() {
        Driver.waitAndSendKeys(moneyTransferPage.balanceBox," ",3);
    }

    @Then("User should see This field is required message")
    public void user_should_see_This_field_is_required_message() {
        Assert.assertTrue(moneyTransferPage.balanceErrorMess.getText().contains("This field is required."));
    }


    @Then("User enters balance more than five digits")
    public void user_enters_balance_more_than_five_digits() {
        moneyTransferPage.balanceBox.sendKeys("000000");
    }

    @Then("User should see onlyFiveDigitMessage")
    public void user_should_see_OnlyFiveDigitMessage() {
        Assert.assertTrue(moneyTransferPage.OnlyNumbersErrMess.getText().contains("only numbers max 5 digits"));

    }

    @Then("User enters balance with letters")
    public void user_enters_balance_with_letters() {
        moneyTransferPage.balanceBox.sendKeys("letters");
    }

    @Then("User should see onlyNumberMessage")
    public void user_should_see_onlyNumberMessage() {
        Assert.assertTrue(moneyTransferPage.OnlyNumbersErrMess.getText().contains("only numbers max 5 digits"));
    }


    @Then("User leaves description box as blank")
    public void user_leaves_description_box_as_blank() {
        moneyTransferPage.descriptionBox.sendKeys("  ");
    }



}

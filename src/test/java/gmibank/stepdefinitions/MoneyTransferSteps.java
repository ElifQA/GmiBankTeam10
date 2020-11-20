package gmibank.stepdefinitions;

import gmibank.pages.MoneyTransferPage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.DatabaseUtility;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MoneyTransferSteps {

    MoneyTransferPage moneyTransferPage = new MoneyTransferPage();


    @Then("user click on Transfer Money link from dropdown")
    public void user_click_on_Transfer_Money_link_from_dropdown() {
        Driver.waitAndClick(moneyTransferPage.transferMoneyLink,3);

    }

    @Then("verify user have at least two accounts")
    public void verify_user_have_at_least_two_accounts() {
        Select select=new Select(moneyTransferPage.fromBox);
        List<WebElement> list=select.getOptions();
        for (WebElement List : list) {
            String gettext = List.getText();
            System.out.println(gettext);
        }
    }
    @Then("User can select the first account as From dropdown where they receive their money from")
    public void user_can_select_the_first_account_as_From_dropdown_where_they_receive_their_money_from() {
        Driver.selectDdValue(moneyTransferPage.fromBox, 1);
    }
    @Then("User can select the second account as To dropdown")
    public void user_can_select_the_second_account_as_To_dropdown() {
       Driver.selectDdValue(moneyTransferPage.toBox,1);
    }
    @Then("User can select a balance that they want to proceed with")
    public void user_can_select_a_balance_that_they_want_to_proceed_with() {

    }
    @Then("user should see balance")
    public void user_should_see_balance() {

    }
    @Then("User should provide a description for that transfer")
    public void user_should_provide_a_description_for_that_transfer() {

    }
    @Then("user should see description")
    public void user_should_see_description() {

    }
    @Then("User click on Make transfer button")
    public void user_click_on_Make_transfer_button() {

    }






}

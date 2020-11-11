package gmibank.stepdefinitions;

import gmibank.pages.MoneyTransferPage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.DatabaseUtility;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MoneyTransferDefinitions {

    MoneyTransferPage mTP = new MoneyTransferPage();

    @Given("user should be in the Money Transfer page")
    public void user_should_be_in_the_Money_Transfer_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url_moneyTransfer"));
    }

    @Given("User should have at least {int} accounts.")
    public void user_should_have_at_least_accounts(Integer int1) {

    }

    @Given("User can select the first account as From dropdown where they receive their money from.")
    public void user_can_select_the_first_account_as_From_dropdown_where_they_receive_their_money_from() {

    }

    @Given("User can select a balance that they want to proceed with.")
    public void user_can_select_a_balance_that_they_want_to_proceed_with() {

    }

    @Given("User should provide a description for that transfer.")
    public void user_should_provide_a_description_for_that_transfer() {

    }

    @Then("User can make sure transfer is done successfully validating the message  an amount of the transaction.")
    public void user_can_make_sure_transfer_is_done_successfully_validating_the_message_an_amount_of_the_transaction() {

    }

}

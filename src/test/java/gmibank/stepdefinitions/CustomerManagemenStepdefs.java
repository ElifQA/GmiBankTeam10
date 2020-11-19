package gmibank.stepdefinitions;

import gmibank.pages.CustomerManagementPage;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerManagemenStepdefs {

 CustomerManagementPage customerManagement = new CustomerManagementPage();



    @When("user click on Administration Module")
    public void userClickOnAdministrationModule() {
     Driver.waitAndClick(customerManagement.administrationModule,3);
    }

    @Then("user click on User Managment section")
    public void userClickOnUserManagmentSection() {

        Driver.waitAndClick(customerManagement.userManagement,3);
    }
}

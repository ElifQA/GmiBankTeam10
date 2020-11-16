package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerManagmentPage {

    public CustomerManagmentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[contains(text(),'My Operations')]")
    public WebElement myOperationsLink;

    @FindBy(xpath = "//span[contains(text(),'Manage Customers')]")
    public WebElement manageCustomersLink;

    @FindBy(partialLinkText = "Create a new Customer")
    public WebElement createANewCustomerButton;

    @FindBy(name = "address")
    public WebElement addressTextBox;

    @FindBy(name = "city")
    public WebElement cityTextBox;

    @FindBy(name = "country.id")
    public WebElement countryTextBox;

    @FindBy(name = "state")
    public WebElement stateTextBox;
}

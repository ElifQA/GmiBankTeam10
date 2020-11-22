package gmibank.pages;


import gmibank.utilities.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class UserAccountPage {


    public UserAccountPage(){
        PageFactory.initElements(Driver.getDriver(),  this);
    }

    @FindBy(xpath = "//*[contains(text(),'My Operations')]")
    public WebElement myOperations;

    @FindBy(xpath = "//*[contains(text(),'My Accounts')]")
    public WebElement myAccount;

    @FindBy(xpath = "//table/tbody/tr[1]/td[1]")
    public WebElement accountType;

    @FindBy(xpath = " //tbody/tr[1]/td[4]/button[1]")
    public WebElement viewTransactionButton;

    @FindBy (xpath = "//td[contains(text(),'Transfer')]")
    public WebElement transfer;

}

package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage ( ){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@id='account-menu']/a")
    public WebElement accountMenu;

    @FindBy (xpath = "//span[contains(text(),'Sign in')]")
    public WebElement signInLink;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;



}

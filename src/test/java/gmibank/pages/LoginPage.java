package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.Keys;
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

    @FindBy(css = "#username")//burdaki webelement dynamic ti degistirdim
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;


    //ziya
    public void login (String userNameValue,String passwordValue){
      userName.sendKeys(userNameValue);
      password.sendKeys(passwordValue, Keys.ENTER);

    }
    @FindBy(xpath = "//*[contains(text(),'Failed to sign in!')]")
    public WebElement signinFailText;

    @FindBy(xpath = "//*[contains(text(),'Did you forget your password?')]")
    public WebElement forgetPasswordOption;

    @FindBy(xpath = "//*[contains(text(),'Reset your password')]")
    public WebElement resetPassword;

    @FindBy(xpath = "//*[contains(text(),'Register a new account')]")
    public WebElement registerNewAccount;

    @FindBy(xpath = "//*[contains(text(),'Registration')]")
    public WebElement registrationForm;





}

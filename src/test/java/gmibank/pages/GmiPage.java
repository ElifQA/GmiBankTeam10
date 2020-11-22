package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmiPage {

    public GmiPage(){
    PageFactory.initElements(Driver.getDriver(), this);
}
    @FindBy(xpath ="//li[@id='account-menu']/a")
    public WebElement usericon;

    @FindBy(xpath ="//li[@id='account-menu']/div/a[2]")
    public WebElement registerLink;

    @FindBy(name="ssn")
    public WebElement ssnBox;

    @FindBy(xpath ="//*[.='Your SSN is invalid']")
    public WebElement ssnAlert;

    @FindBy(xpath ="//input[@name='firstname']")
    public WebElement firstName;

    @FindBy(xpath ="//input[@name='lastname']")
    public WebElement lastName;

    @FindBy(xpath ="//input[@name='address']")
    public WebElement adress;

    @FindBy(xpath ="//input[@name='mobilephone']")
    public WebElement mobilePhone;

    @FindBy(xpath ="//input[@name='username']")
    public WebElement userName;

    @FindBy(xpath ="//input[@name='password']")
    public WebElement password;

    @FindBy(xpath ="//input[@name='email']")
    public WebElement email;

    @FindBy(xpath ="//input[@name='firstPassword']")
    public WebElement firstPassword;

    @FindBy(xpath ="//input[@name='secondPassword']")
    public WebElement secondPassword;

    @FindBy(xpath ="//*[@id='account-menu']/a/span")
    public WebElement accountMenu;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "//button[@type='signin']")
    public WebElement signin;

    @FindBy(xpath = "//*[@id='account-menu']/div/a[2]/span")
    public WebElement passMenu;

    @FindBy(xpath ="//*[@id='currentPassword']")
    public WebElement curPass;

    @FindBy(xpath = "//*[@id='newPassword']")
    public WebElement newPass;

    @FindBy(xpath ="//*[@id='confirmPassword']")
    public WebElement conPass;

    @FindBy(xpath ="//*[@id='password-form']/button/span")
    public WebElement bttnSave;

    @FindBy(xpath="/div/div[1]/span/strong")
    public WebElement confMessage;




}

package gmibank.pages;

import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
    public UsersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[contains(text(),'First Name')]")
    public WebElement firstNameText;

    @FindBy(xpath = "//a[contains(text(),'»»')]")
    public WebElement forwardButton;

    @FindBy(xpath = "//a[contains(text(),'23')]")
    public WebElement page23;

    @FindBy(xpath = "//a[contains(text(),'22')]")
    public WebElement page22;

    @FindBy(xpath = "//tbody/tr[@id='userpixie']/td[10]/div[1]/a[1]")
    public WebElement viewButton;

    @FindBy(xpath = "//tbody/tr[@id='userpixie']/td[10]/div[1]/a[2]")
    public WebElement editButton;

    @FindBy(xpath = "//tbody/tr[@id='userpixie']/td[10]/div[1]/a[3]")
    public WebElement deleteButton;

    @FindBy(name = "login")
    public WebElement loginTextbox;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstNameTextbox;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastNameTextbox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTextbox;

    @FindBy(xpath = "//select[@id='langKey']")
    public WebElement languageDropdown;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//option[@value='ROLE_USER']")
    public WebElement role;


}

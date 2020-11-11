package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserInfoSegmentPage {



    @FindBy( xpath = "//img[@alt='Logo']")
    public WebElement logo;

    @FindBy(xpath = "//li[@id='account-menu']/a")
    public WebElement userIcon;

    @FindBy (xpath = "//li[@id='account-menu']/div/a[1]")
    public WebElement userInfo;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy (xpath = "//input[@id='firstName']")
    public WebElement firstname;

    @FindBy (id = "lastName")
    public WebElement lastname;

    @FindBy ( id = "langKey")
    public WebElement language;

    @FindBy ( id = "email")
    public WebElement email;

    @FindBy (xpath = "//*[text()='Settings saved!']")
    public WebElement savedMessage;














    public UserInfoSegmentPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

}

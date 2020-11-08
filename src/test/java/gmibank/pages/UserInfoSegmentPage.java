package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserInfoSegmentPage {

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

    @FindBy( xpath = "//img[@alt='Logo']")
    public WebElement logo;

    @FindBy(xpath = "//li[@id='account-menu']/a")
    public WebElement userIcon;

    @FindBy (xpath = "//li[@id='account-menu']/div/a[1]")
    public WebElement userInfo;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement saveButton;

    public UserInfoSegmentPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

}

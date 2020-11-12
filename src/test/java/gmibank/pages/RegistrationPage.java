package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    public RegistrationPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/nav[1]/div[1]/ul[1]/li[8]/a[1]")
    public WebElement registration;

    @FindBy(xpath = "(//span)[12]")
    public WebElement register;

    @FindBy(name = "ssn")
    public WebElement ssnCheckbox;

    @FindBy(name = "firstname")
    public WebElement firstName;

    @FindBy(name = "lastname")
    public WebElement lastName;

    @FindBy(id = "address")
    public WebElement address;

    @FindBy(name = "mobilephone")
    public WebElement mobilephone;

    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(name = "firstPassword")
    public WebElement firstPassword;

    @FindBy(name = "secondPassword")
    public WebElement secondPassword;

    @FindBy(id = "register-submit")
    public WebElement registerButton;

    @FindBy(xpath = "(//div)[24]")
    public WebElement redMessage;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    public WebElement successMessage;

    @FindBy(xpath = "//div[contains(text(),'Your First Name is required')]")
    public WebElement firstNameErrorMessage;

    @FindBy(xpath = "//div[contains(text(),'Your Last Name is required')]")
    public WebElement lastNameErrorMessage;

    @FindBy(xpath = "//div[contains(text(),'Your username is required.')]")
    public WebElement usernameErrorMessage;

    @FindBy(xpath = "//div[contains(text(),'Your email is required.')]")
    public WebElement emailErrorMessage;

    @FindBy(xpath = "//div[contains(text(),'Your password is required.')]")
    public WebElement newPasswordErrorMessage;
    @FindBy(xpath = "//div[contains(text(),'Your confirmation password is required.')]")
    public WebElement newPasswordConfirmationErrorMessage;


}

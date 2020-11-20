package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoneyTransferPage {
    public MoneyTransferPage(){
        PageFactory.initElements(Driver.getDriver(),  this);
    }


    @FindBy( xpath = "//a[contains(text(),'Transfer Money')]")
    public WebElement transferMoneyLink;

    @FindBy(xpath = "//*[@id='fromAccountId']")
    public WebElement fromBox;

    @FindBy(xpath = "//*[@id='toAccountId']")
    public WebElement toBox;

    @FindBy(id = "balance")
    public WebElement balanceBox;

    @FindBy(xpath = "//*[@id=\"balancecent\"]")
    public WebElement centBox;

    @FindBy(id = "description")
    public WebElement descriptionBox;

    @FindBy(id = "make-transfer")
    public WebElement transferButton;
    @FindBy( xpath = "//*[contains(text(),'Transfer is succesfull')]")
    public WebElement successMessage;

    @FindBy (xpath = "//div[contains(text(),'This field is required.')]")
    public WebElement balanceErrorMess;

    @FindBy (xpath = "//div[contains(text(),'only numbers max 5 digits')]")
    public WebElement OnlyNumbersErrMess;

    @FindBy(xpath = "//div[contains(text(),'This field is required.')]")
    public WebElement descriptionErrMess;


}

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

    @FindBy(xpath = "//*[@id=\"fromAccountId\"]")
    public WebElement fromBox;

    @FindBy(xpath = "//*[@id=\"toAccountId\"]")
    public WebElement toBox;

    @FindBy(xpath = "//*[@id=\"balance\"]")
    public WebElement balanceBox;

    @FindBy(xpath = "//*[@id=\"balancecent\"]")
    public WebElement centBox;

    @FindBy(xpath = "//*[@id=\"description\"]")
    public WebElement descriptionBox;

    @FindBy(id = "make-transfer")
    public WebElement transferButton;
}

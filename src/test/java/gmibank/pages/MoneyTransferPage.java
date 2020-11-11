package gmibank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MoneyTransferPage {

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

package org.example;

import org.openqa.selenium.By;

public class PaymentInformationPage extends Utils{
    private By _typeCardHolderName=By.xpath("//input[contains(@id,'CardholderName')]");
    //private By _typeCardHolderName=By.cssSelector("input#CardholderName");
    private By _typeCardNumber=By.cssSelector("input#CardNumber");
    private By _selectExpireMonth=By.cssSelector("select#ExpireMonth");
    private By _selectExpireYear=By.cssSelector("select#ExpireYear");
    private By _typeCardCode=By.cssSelector("input#CardCode");
    private By _clickContinue=By.xpath("//button[contains(@class,'button-1 payment-info-next-step-button')]");
    LoadProperty loadProperty=new LoadProperty();

    public void enterCardPaymentDetails(){
        waitForClickable(_typeCardHolderName,1000);
        //type card holder name
        enterText(_typeCardHolderName,loadProperty.getProperty("CardholderName"));
        //type card number
        enterText(_typeCardNumber,loadProperty.getProperty("CardNumber"));
        //select expire month
        selectFromDropdownByVisibleText(_selectExpireMonth,loadProperty.getProperty("ExpireMonth"));
        //select expire year
        selectFromDropdownByVisibleText(_selectExpireYear,loadProperty.getProperty("ExpireYear"));
        //enter card code
        enterText(_typeCardCode,loadProperty.getProperty("CardCode"));
        //click on continue
        clickOnElement(_clickContinue);
    }
}

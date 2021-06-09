package org.example;

import org.openqa.selenium.By;

public class BillingAddressPage extends Utils{
    private By _selectCountry=By.xpath("//select[contains(@id,'BillingNewAddress_CountryId')]");
   // private By _selectCountry=By.cssSelector("select#BillingNewAddress_CountryId.valid");
   // private By _typeCityName=By.cssSelector("input#BillingNewAdress_city");
    private By _typeCityName=By.xpath("//input[contains(@id,'BillingNewAddress_City')]");
    private By _typeAddress1=By.cssSelector("input#BillingNewAddress_Address1");
    private By _typeZipPostalCode=By.cssSelector("input#BillingNewAddress_ZipPostalCode");
    private By _typePhoneNumber=By.cssSelector("input#BillingNewAddress_PhoneNumber");
    private By _clickOnContinue=By.xpath("//button[contains(@onclick,'Billing.save()')]");

    LoadProperty loadProperty=new LoadProperty();
    public void enterBillingDetails(){
         //select country
        selectFromDropdownByVisibleText(_selectCountry,loadProperty.getProperty("Country"));
        //Type city name
        enterText(_typeCityName,loadProperty.getProperty("City"));
        //Type Address
        enterText(_typeAddress1,loadProperty.getProperty("Address1"));
        //Type postal code
        enterText(_typeZipPostalCode,loadProperty.getProperty("Zip/PostalCode"));
        //type phone number
        enterText(_typePhoneNumber,loadProperty.getProperty("PhoneNumber"));
        //click on continue
        clickOnElement(_clickOnContinue);

    }
}

package org.example;

import org.openqa.selenium.By;

public class ShippingMethodPage extends Utils{
    private By _clickOnShippingOption= By.cssSelector("input#shippingoption_1");
    private By _clickContinue=By.cssSelector("button.button-1.shipping-method-next-step-button");

    public void selectShippingOption(){
        //click on shipping option Next Day Air
        clickOnElement(_clickOnShippingOption);
        //click on continue
        clickOnElement(_clickContinue);
    }
}

package org.example;

import org.openqa.selenium.By;

public class BookProductShoppingCartPage extends Utils{
    private By _clickOnBox=By.cssSelector("input#termsofservice");
    private By _clickOnCheckOut=By.cssSelector("button#checkout.button-1.checkout-button");
    public void clickOnCheckOutOnShoppingCart() {
        //click on term and condition
        clickOnElement(_clickOnBox);
        //click on check out
        clickOnElement(_clickOnCheckOut);

    }
}

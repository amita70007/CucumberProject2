package org.example;

import org.openqa.selenium.By;

public class BookProductDetailsPage extends Utils{
    private By _clickAddToCartButton=By.cssSelector("button#add-to-cart-button-38.button-1.add-to-cart-button");
    private By _clickOnBarNotification=By.xpath("//p[@class='content']//a[@href='/cart']");
   // private By _clickOnBarNotification=By.cssSelector("div.bar-notification.success");
    private By _clickOnShoppingCart=By.cssSelector("span.cart-label");
    public void addBookProductInShoppingCart(){
        //Click on add to cart button
        clickOnElement(_clickAddToCartButton);
        //Using wait for clickable
        waitForClickable(_clickAddToCartButton,1000);
        //clicking on notification bar
        clickOnElement(_clickOnBarNotification);


    }
}

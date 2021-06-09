package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckoutCompletedPage extends Utils{
    //private  By _userBuyProductSuccessfully=By.xpath("//strong[contains(text(),'Your order has been successfully processed!");
    private By _userBuyProductSuccessfully=By.cssSelector(".section.order-completed .title>strong");
    public void verifyUserBuyProductSuccessfully(){
        //Checking verification by using assert
        Assert.assertEquals(getTextFromElement(_userBuyProductSuccessfully),"Your order has been successfully processed!", "Your order is not successfully processed!");
       //Printing the comments
        System.out.println("Your order has been successfully processed!");}

}

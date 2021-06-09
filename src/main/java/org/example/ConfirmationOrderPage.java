package org.example;

import org.openqa.selenium.By;

public class ConfirmationOrderPage extends Utils{
    private By _clickOnConfirmation=By.xpath("//button[contains(@class,'button-1 confirm-order-next-step-button')]");
  //  private By _clickOnConfirmation=By.cssSelector("button.button-1.confirm-order-next-step-button");
    public void clickOnConfirmation(){
        //using wait
        waitForClickable(_clickOnConfirmation,1000);
        //click on confirmation
        clickOnElement(_clickOnConfirmation);


    }
}

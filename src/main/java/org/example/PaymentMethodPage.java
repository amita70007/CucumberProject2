package org.example;

import org.openqa.selenium.By;

public class PaymentMethodPage extends Utils {
    private By _selectPaymentMethod=By.cssSelector("input#paymentmethod_1");
    private By _clickContinue=By.cssSelector("button.button-1.payment-method-next-step-button");
    public void clickOnCreditCard(){
        //select payment method by selecting credit card option
        clickOnElement(_selectPaymentMethod);
        //click on continue
        clickOnElement(_clickContinue);
    }
}

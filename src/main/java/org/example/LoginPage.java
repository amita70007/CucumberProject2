package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends Utils{
    private By _longinButton=By.cssSelector(".ico-login");
    private By _userName=By.cssSelector("#Email");
    private By _passWord=By.cssSelector("#Password");
    private By _clickLoginButton=By.cssSelector("button[class='button-1 login-button']");



    //click on login button
    public void clickOnLoginButton(){

        //putting wait for Login button
        waitForClickable(_longinButton,10);

        //click on longin button
        clickOnElement(_longinButton);
    }

    public void enterUserCredential(String arg1, String arg2) throws InterruptedException {
        waitForClickable(_userName,5);
        waitForClickable(_passWord,5);
        enterText(_userName,arg1);
        enterText(_passWord,arg2);
        //Thread.sleep(3000);
        clickOnElement(_clickLoginButton);
        //Thread.sleep(3000);


    }
    public void assertError(){
        String actualText = getTextFromElement(By.cssSelector(".message-error.validation-summary-errors"));
        String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals(actualText,expectedText);
    }


}
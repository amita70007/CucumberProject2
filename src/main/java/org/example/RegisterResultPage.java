package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.Set;

public class RegisterResultPage extends Utils {
    private By _registerResult = By.xpath("//div[@class='result']");
    private By _nikeProductResult = By.xpath("//div[@class='item-box']//h2[@class='product-title']");
    private By _newTitle = By.cssSelector("input#AddNewComment_CommentTitle");
    private By _newComment = By.cssSelector("#AddNewComment_CommentText");
    private By _commentButton = By.cssSelector("button.button-1.news-item-add-comment-button");
    private By _commentAddedSuccessfully = By.cssSelector("div.result");
    private By _commentPresent = By.cssSelector("div.comments");
    private By _totalComments = By.cssSelector("div.comment.news-comment");
    private By _loginButtonOnFacebook = By.xpath("//input[contains(@value,'Log In')]");
    private By _cookieMessage = By.xpath("//button[starts-with(@title,'Accept')]");
    private By _clickContinue=By.cssSelector("a.button-1.register-continue-button");

    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    String commentText = loadProperty.getProperty("Comment") + dateStamp();

    SoftAssert softAssert = new SoftAssert();

    public void verifyRegisterMessage() {
        //Verifying expected result with actual result by using assert
        Assert.assertEquals(getTextFromElement(_registerResult), "Your registration completed", "Your registration is not completed");
        //Printing the comments
        System.out.println("Your registration completed");

        waitForClickable(_registerResult,1000);
        //click on continue
        clickOnElement(_clickContinue);
    }
}



package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class NewStoreOpenPage extends Utils{
    private By _typeTitle=By.xpath("//input[contains(@class,'enter-comment-title')]");
    private By _typeComment=By.cssSelector("textarea#AddNewComment_CommentText.enter-comment-text");
    private By _clickAddNewComment =By.xpath("//button[contains(@name,'add-comment')]");
    private By _newComment = By.cssSelector("#AddNewComment_CommentText");
    private By _commentButton = By.cssSelector("button.button-1.news-item-add-comment-button");
    private By _commentAddedSuccessfully = By.cssSelector("div.result");
    private By _commentPresent = By.cssSelector("div.comments");
    private By _totalComments = By.cssSelector("div.comment.news-comment");
    //creating method
    String commentText = loadProperty.getProperty("Comment") + dateStamp();
  public void typeNewComments() {
      sleep(5000);
      //Type the title in box
      enterText(_typeTitle, loadProperty.getProperty("Title") + dateStamp());
      //Type the comment in box
      //System.out.println(commentText);
      enterText(_typeComment, commentText);
      //add comment by clicking on add new comment
      clickOnElement(_clickAddNewComment);
  }
  public void verifyCommentAddedSuccessfully(){
      //Verifying Actual result with Expected by using assert
      Assert.assertEquals(getTextFromElement(_commentAddedSuccessfully), "News comment is successfully added.", "Comment not successfully added");
      System.out.println(loadProperty.getProperty("CommentIsAdded"));
  }
  public void verifyCommentIsPresentInCommentBox(){

        //verifying comment is present
        Assert.assertTrue(getTextFromElement(_commentPresent).contains(commentText), "Comment is not present in comment box");
        System.out.println(loadProperty.getProperty("CommentIsPresent"));


  }public void verifyCommentsDisplayedLast(){
        //verifying comment display last
        List<WebElement> commentList = driver.findElements(_totalComments);
        //find last comment index from total comments
        //System.out.println("commentList :"+commentList.size());
        int totalComments = commentList.size()-1;
        String actualCommentInLast = commentList.get(totalComments).getText();
        //System.out.println(actualCommentInLast);
        //using assert equal
        Assert.assertTrue(actualCommentInLast.contains(commentText), "newly added comment is not present at last in comment list");
        System.out.println(loadProperty.getProperty("NewCommentAddedLast"));
    }


}

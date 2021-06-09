package org.example;

import org.openqa.selenium.By;

public class BooksProductsPage extends Utils {
    private By _clickOnBooksProduct=By.xpath("//a[contains(@title,'Show details for First Prize Pies')]");
    public void clickOnBooksProduct(){
        //click on book product First prize pies
        clickOnElement(_clickOnBooksProduct);
    }
}

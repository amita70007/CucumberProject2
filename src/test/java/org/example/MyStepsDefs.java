package org.example;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepsDefs {
    //creating object for all class
    HomePage homePage=new HomePage();
    RegisterPage registerPage=new RegisterPage();
    RegisterResultPage registerResultPage=new RegisterResultPage();
    NewStoreOpenPage newStoreOpenPage=new NewStoreOpenPage();
    BooksProductsPage booksProductsPage=new BooksProductsPage();
    BookProductDetailsPage bookProductDetailsPage=new BookProductDetailsPage();
    BookProductShoppingCartPage bookProductShoppingCartPage=new BookProductShoppingCartPage();
    BillingAddressPage billingAddressPage=new BillingAddressPage();
    ShippingMethodPage shippingMethodPage=new ShippingMethodPage();
    PaymentMethodPage paymentMethodPage=new PaymentMethodPage();
    PaymentInformationPage paymentInformationPage=new PaymentInformationPage();
    ConfirmationOrderPage confirmationOrderPage=new ConfirmationOrderPage();
    CheckoutCompletedPage checkoutCompletedPage=new CheckoutCompletedPage();
    LoginPage login = new LoginPage();



    @Given("^user is on register page$")
    public void user_is_on_register_page()  {
        //calling method from homepage
        homePage.clickOnRegisterButton();
    }
    @When("^user enters all required registration details$")
    public void user_enters_all_required_registration_details()  {
        //calling method from register page
        registerPage.enterRegistrationDetails();
    }

    @Then("^user should able to register successfully$")
    public void user_should_able_to_register_successfully()  {
        //calling method register result page
        registerResultPage.verifyRegisterMessage();
    }

    @Given("^user is on homepage$")
    public void user_is_on_homepage() {

    }

    @When("^user click on New online store is open$")
    public void user_click_on_New_online_store_is_open()  {
        //calling method from home page
        homePage.clickOnOpenNewStore();
    }

    @When("^add title and comment$")
    public void add_title_and_comment() {
        //calling method
        newStoreOpenPage.typeNewComments();

    }
    @When("^click on new comment$")
    public void click_on_new_comment()  {

    }

    @Then("^user should able to add new comment successfully$")
    public void user_should_able_to_add_new_comment_successfully()  {
        //calling method from new store open page
        newStoreOpenPage.verifyCommentAddedSuccessfully();

    }
    @When("^user select currency$")
    public void user_select_currency()  {
        //calling  method from home page
        homePage.selectEuroCurrency();

    }

    @Then("^user should able to change currency for all products successfully$")
    public void user_should_able_to_change_currency_for_all_products_successfully()  {
       homePage.verifyChangeOfCurrencySymbolInEachProductPrice();
    }
    @When("^user click on register$")
    public void user_click_on_register()  {

    }

    @When("^user click on continue$")
    public void user_click_on_continue()  {

    }

    @When("^user click on books$")
    public void user_click_on_books()  {
        homePage.clickOnBook();
    }

    @When("^user select First Prize Pies book product$")
    public void user_select_First_Prize_Pies_book_product()  {
        booksProductsPage.clickOnBooksProduct();
    }

    @When("^user click on add to cart button$")
    public void user_click_on_add_to_cart_button()  {
        bookProductDetailsPage.addBookProductInShoppingCart();
    }

    @When("^user click on shopping cart$")
    public void user_click_on_shopping_cart() {
    }

    @When("^user click on checkout$")
    public void user_click_on_checkout()  {
        bookProductShoppingCartPage.clickOnCheckOutOnShoppingCart();
    }

    @When("^User enter billing details and click continue$")
    public void user_enter_billing_details_and_click_continue()  {
        billingAddressPage.enterBillingDetails();
    }

    @When("^User select shipping option and click continue$")
    public void user_select_shipping_option_and_click_continue()  {
        shippingMethodPage.selectShippingOption();
    }

    @When("^User select credit card and click continue$")
    public void user_select_credit_card_and_click_continue()  {
        paymentMethodPage.clickOnCreditCard();

    }

    @When("^user enter all visa card details and click continue$")
    public void user_enter_all_visa_card_details_and_click_continue()  {
        paymentInformationPage.enterCardPaymentDetails();
    }
    @When("^User click on confirmation$")
    public void user_click_on_confirmation()  {
        confirmationOrderPage.clickOnConfirmation();
    }

    @Then("^user should able to buy book product successfully$")
    public void user_should_able_to_buy_book_product_successfully() {
        checkoutCompletedPage.verifyUserBuyProductSuccessfully();
    }


    @And("^User click on login button$")
    public void user_click_on_login_button() throws Throwable {
        login.clickOnLoginButton();
    }

    @When("^User enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enter_test_and_password(String arg1, String arg2) throws Throwable {
        System.out.println(arg1);
        System.out.println(arg2);
        login.enterUserCredential(arg1, arg2);

    }

    @Then("^User should not be able to login$")
    public void user_should_not_be_able_to_login() throws Throwable {
    login.assertError();
    }




}

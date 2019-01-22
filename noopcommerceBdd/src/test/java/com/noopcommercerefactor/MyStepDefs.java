package com.noopcommercerefactor;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class MyStepDefs extends Util {
    ShoppingCartPage shoppingCartPage=new ShoppingCartPage();
    ShoesPage shoesPage=new ShoesPage();
    HomePage homePage=new HomePage();
    BooksPage booksPage=new BooksPage();
    LoginPage loginPage=new LoginPage();
    EmailAFriendPage emailAFriendPage=new EmailAFriendPage();
RegistrationPage registrationPage=new RegistrationPage();
    SoftAssert softAssert = new SoftAssert();

    @Given("^Url \"([^\"]*)\"$")
    public void url(String arg1)  {

    }

    @When("^User click on register button on home page and fill all required fields with valid credentials\\.$")
    public void user_click_on_register_button_on_home_page_and_fill_all_required_fields_with_valid_credentials()  {
        registrationPage.user_input_valid_Register_data_Sprad_shhet();
    }

    @Then("^User register sucessfully$")
    public void user_register_sucessfully()  {
// expected registration sucessfull message confirmation displayed
        String expectedRegistrationSucessMessage = "Your registration completed";
        //actual sucessfull message confirmation displayed to be verified
        String actualRegistrationSucessMessage = get_text(By.xpath("//div[@class=\"result\"]")) ;
        //comparing actual and expected results
        softAssert.assertEquals(expectedRegistrationSucessMessage, actualRegistrationSucessMessage, "test case fail");
        softAssert.assertAll();

    }

    @Given("^User on home page$")
    public void user_on_home_page()  {

    }

    @When("^User click on apparel$")
    public void user_click_on_apparel()  {
        homePage.verify_apparel_category();
    }

    @When("^user click  shoes category$")
    public void user_select_shoes_category()  {
        shoesPage.user_select_shoe();
    }

    @When("^User click Nike Floral Roshe Customized Running Shoes$")
    public void user_select_Nike_Floral_Roshe_Customized_Running_Shoes()  {
        shoesPage.user_should_choose_shoe();
    }

    @When("^User click on email a friend button$")
    public void user_click_on_email_a_friend_button()  {
        shoesPage.email_a_friend_button_on_shoe_page();
    }

    @When("^User input all email fields$")
    public void user_input_all_email_fields()  {
        emailAFriendPage.unregistered_user_cannot_email_a_friend();
    }

    @When("^User click on send email button$")
    public void user_click_on_send_email_button()  {
        emailAFriendPage.user_click_on_Send_email_button();
    }

    @Then("^User not able to send the email$")
    public void user_not_able_to_send_the_email() {
        // store expected result in string
        String expectedverify = "Only registered customers can use email a friend feature";
        //store actual result in string
        String actualverify = get_text(By.xpath("//div[@class=\"message-error validation-summary-errors\"]//li"));
        //compare expected and actual result
        Assert.assertEquals(actualverify, expectedverify, "test case fail");
    }

    @Given("^User already on home page$")
    public void user_already_on_home_page()  {

    }

    @When("^User click on books$")
    public void user_click_on_books()  {
        homePage.verify_book_category_working();
    }

    @When("^Click on add to cart of selected book$")
    public void click_on_add_to_cart_of_selected_book()  {
        booksPage.select_book();
        booksPage.user_able_to_buy_books();

    }


    @When("^User click on shopping cart$")
    public void user_click_on_shopping_cart()  {
        booksPage.click_on_shopping_cart_button();
    }

    @When("^User click on checkout button without accepting terms and condition$")
    public void user_click_on_checkout_button_without_accepting_terms_and_condition()  {
    shoppingCartPage.not_accpect_terms_and_conditions();

    }

    @Then("^User not able to do checkout$")
    public void user_not_able_to_do_checkout()  {
        String expecteddisplaymessage="Please accept the terms of service before the next step.";
        //store actual result in string
        String actualdisplaymessage =driver.findElement(By.xpath("//div[@id=\"terms-of-service-warning-box\"]/p")).getText();
        //compare expected and actual result
        Assert.assertEquals(expecteddisplaymessage,actualdisplaymessage,"test case failed");
    }

    @Then("^Warning message displayed to accept terms and conditions$")
    public void warning_message_displayed_to_accept_terms_and_conditions()  {

    }








}














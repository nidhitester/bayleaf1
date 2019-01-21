package com.demo.nopcommerce;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class MyStepDefs extends Util {
    HomePage homePage=new HomePage();
    SoftAssert softAssert = new SoftAssert();

    @Given("^user already on homepage$")
    public void user_already_on_homepage()  {

    }

    @When("^user click on computer$")
    public void user_click_on_computer()  {
        homePage.computer_page_working_fine();
    }

    @Then("^user navigate to computer page$")
    public void user_navigate_to_computer_page(){
        //driver to get actual url
        String actualUrl=driver.getCurrentUrl();
        //expected url
        String expectedUrl="https://demo.nopcommerce.com/computers";
        softAssert.assertEquals(expectedUrl,actualUrl);
        //result expected on jewelry page
        String expected_verifying="Computers";
        //actual result
        String actual_verifying=get_text(By.xpath("//div[@class=\"page category-page\"]//div[@class=\"page-title\"]/h1"));
        //comparing result to verify category working fine
        softAssert.assertEquals(expected_verifying,actual_verifying);
        softAssert.assertAll();


    }

    @When("^user click on jewelry$")
    public void user_click_on_jewelry() {
    homePage.to_verify_jewelry_category();
    }

    @Then("^user navigate to jewelry page$")
    public void user_navigate_to_jewelry_page()  {
    //result expected on jewelry page
     String expected_verifying="Jewelry" ;
     //actual result
        String actual_verifying=get_text(By.xpath("//div[@class=\"page-title\"]/h1"));
      //comparing result to verify category working fine
        softAssert.assertEquals(expected_verifying,actual_verifying);
      //driver to get actual url
      String actualUrl=driver.getCurrentUrl();
      //expected url
      String expectedUrl="https://demo.nopcommerce.com/jewelry";
      //comparing result to verify link
      softAssert.assertEquals(expectedUrl,actualUrl);
      softAssert.assertAll();

    }

    @When("^user click on books$")
    public void user_click_on_books()  {
    homePage.verify_book_category_working();
    }

    @Then("^user navigate to books page$")
    public void user_navigate_to_books_page()  {
        //result expected on Books page
        String expected_verifying="Books";
        //actual result
        String actual_verifying=get_text(By.xpath("//div[@class=\"page-title\"]/h1"));
        //comparing result to verify category working fine
        softAssert.assertEquals(expected_verifying,actual_verifying);
        //driver to get actual url
        String actualUrl=driver.getCurrentUrl();
        //expected url
        String expectedUrl="https://demo.nopcommerce.com/books";
        softAssert.assertEquals(expectedUrl,actualUrl);
        softAssert.assertAll();
    }

    @When("^user click on giftcard$")
    public void user_click_on_giftcard() {
    homePage.verify_giftcard_category();
    }

    @Then("^user navigate to giftcard page$")
    public void user_navigate_to_giftcard_page()  {
        //result expected on Gift Cards page
        String expected_verifying="Gift Cards";
        //actual result
        String actual_verifying=get_text(By.xpath("//div[@class=\"page-title\"]/h1"));
        //comparing result to verify category working fine
        softAssert.assertEquals(expected_verifying,actual_verifying);
        //driver to get actual url
        String actualUrl=driver.getCurrentUrl();
        //expected url
        String expectedUrl="https://demo.nopcommerce.com/gift-cards";
        softAssert.assertEquals(expectedUrl,actualUrl);
        softAssert.assertAll();
    }

    @When("^user click on electronics$")
    public void user_click_on_electronics()  {
    homePage.verify_electronics_category();
    }

    @Then("^user navigate to electronics page$")
    public void user_navigate_to_electronics_page()  {
        //result expected on Electronics page
        String expected_verifying="Electronics";
        //actual result
        String actual_verifying=get_text(By.xpath("//div[@class=\"page-title\"]/h1"));
        //comparing result to verify category working fine
        softAssert.assertEquals(expected_verifying,actual_verifying);
        //driver to get actual url
        String actualUrl=driver.getCurrentUrl();
        //expected url
        String expectedUrl="https://demo.nopcommerce.com/electronics";
        softAssert.assertEquals(expectedUrl,actualUrl);
        softAssert.assertAll();
    }

    @When("^user click on apparel$")
    public void user_click_on_apparel(){
    homePage.verify_apparel_category();
    }

    @Then("^user navigate to apparel page$")
    public void user_navigate_to_apparel_page() {
        //result expected on  page Apparel
        String expected_verifying="Apparel";
        //actual result
        String actual_verifying=get_text(By.xpath("//div[@class=\"page-title\"]/h1"));
        //comparing result to verify category working fine
        softAssert.assertEquals(expected_verifying,actual_verifying);
        //driver to get actual url
        String actualUrl=driver.getCurrentUrl();
        //expected url
        String expectedUrl="https://demo.nopcommerce.com/apparel";
        softAssert.assertEquals(expectedUrl,actualUrl);
        softAssert.assertAll();
    }

    @When("^user click on digitaldownload$")
    public void user_click_on_digitaldownload()  {
     homePage.verify_digitalDownload_category();
    }

    @Then("^user navigate to digitaldownload page$")
    public void user_navigate_to_digitaldownload_page()  {
        //result expected on  page Digital downloads
        String expected_verifying="Digital downloads";
        //actual result
        String actual_verifying=get_text(By.xpath("//div[@class=\"page-title\"]/h1"));
        //comparing result to verify category working fine
        softAssert.assertEquals(expected_verifying,actual_verifying);
        //driver to get actual url
        String actualUrl=driver.getCurrentUrl();
        //expected url
        String expectedUrl="https://demo.nopcommerce.com/digital-downloads";
        softAssert.assertEquals(expectedUrl,actualUrl);
        softAssert.assertAll();
    }




}














package com.noopcommercerefactor;

import org.openqa.selenium.By;

public class BooksPage extends Util {
    LoadProp loadProp=new LoadProp();
    By email_a_friend_button=By.xpath("//input[@class=\"button-2 email-a-friend-button valid\"]");
    By add_to_cart_button= By.xpath("//div[@data-productid=\"39\"]//input[@value=\"Add to cart\"]");
    By shopping_cart_button= By.id("add-to-cart-button-39");


    public void user_able_to_buy_books(){
        //click on add to cart button
        click_element(add_to_cart_button);


    }
    By chooose_book= By.xpath("//div[@class=\"item-grid\"]/div[3]//div[@data-productid=\"39\"]/div[@class=\"details\"]/h2//a[@href=\"/pride-and-prejudice\"]");
    public  void select_book(){
        click_element(chooose_book);
    }
    public void click_email_a_friend_button(){
     click_element(email_a_friend_button);
    }
    public void click_on_shopping_cart_button(){
        //click on shopping cart
        explict_eait(shopping_cart_button);
        click_element(shopping_cart_button);

    }
}

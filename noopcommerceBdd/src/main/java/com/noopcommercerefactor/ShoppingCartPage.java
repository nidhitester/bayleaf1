package com.noopcommercerefactor;

import org.openqa.selenium.By;

public class ShoppingCartPage extends Util {
    LoadProp loadProp=new LoadProp();

    By terms_and_conditions= By.xpath("//label[@for=\"termsofservice\"]");
    By checkout_button= By.xpath("//div[@class=\"checkout-buttons\"]//button[@type=\"submit\"]");
    By accept_terms_and_condition= By.xpath("//div[@class=\"terms-of-service\"]//input[@type=\"checkbox\"]");

    public void accepttermsandcondition(){
        click_element(accept_terms_and_condition);

    }
    public void not_accpect_terms_and_conditions(){

        //click on terms and condition
        // click_element(terms_and_conditions);
        //click on checkout button
        click_element(checkout_button);



    }
    public void user_click_on_checkoutbutton_on_shoppingcart_page(){
        //click on checkout button
        click_element(checkout_button);
    }

}

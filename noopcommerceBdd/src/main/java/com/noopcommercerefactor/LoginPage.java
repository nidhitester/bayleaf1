package com.noopcommercerefactor;

import org.openqa.selenium.By;


public class LoginPage extends Util {
    LoadProp loadProp = new LoadProp();

    By inputemail= By.id("Email");
    By passwordfield= By.id("Password");
    By loginbutton= By.xpath("//input[@value=\"Log in\"]");
    By logoutbutton= By.xpath("//a[@href=\"/logout\"]");

    public void user_click_on_Logout(){

        click_element(logoutbutton);
    }


    public  void user_login_with_valid_credentials(){

         enter_text(inputemail,loadProp.getProperty("email2"));
       // enter_text(inputemail,loadProp.getProperty("email")+date1+loadProp.getProperty("email1"));
        enter_text(passwordfield,loadProp.getProperty("Password1"));
        click_element(loginbutton);
    }
}

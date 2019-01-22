package com.noopcommercerefactor;

import org.openqa.selenium.By;

public class EmailAFriendPage extends Util {
    LoadProp loadProp=new LoadProp();

    By input_email_friend= By.id("FriendEmail");
    By input_your_email= By.name("YourEmailAddress");
    By personal_message_input= By.id("PersonalMessage");
    By send_email_button = By.xpath("//div[@class=\"buttons\"]//input[@name=\"send-email\"]");
    By email_a_friend= By.xpath("//input[@value=\"Email a friend\"]");
    By input_unregistered_your_email= By.name("YourEmailAddress");
    public void unregistered_user_cannot_email_a_friend(){
        //type friends email id
        enter_text(input_email_friend,loadProp.getProperty("FriendEmail"));
        clear_element(input_your_email);
        //type your email id
        enter_text(input_unregistered_your_email,loadProp.getProperty("unregistered_your_Email"));
        //type any message optional
        enter_text(personal_message_input,loadProp.getProperty("PersonalMessage"));

    }

    public void user_fill_email_a_friend_field(){
        //type friends email id
        enter_text(input_email_friend,loadProp.getProperty("FriendEmail"));
        clear_element(input_your_email);
        //type your email id
        enter_text(input_your_email,loadProp.getProperty("email")+date1+loadProp.getProperty("email1"));
        //type any message optional
        enter_text(personal_message_input,loadProp.getProperty("PersonalMessage"));

    }
    public void user_click_on_Send_email_button(){
        //click on send email
        click_element(send_email_button);
    }

}

package com.demo.nopcommerce;

import org.openqa.selenium.By;

public class HomePage extends Util {
    By computerButton=(By.xpath("//div[@class=\"header-menu\"]//ul[@class=\"top-menu\"]/li//a[@href=\"/computers\"]"));
  LoadProp loadProp=new LoadProp();
    public void computer_page_working_fine(){
        click_element(computerButton);

    }

    By jewelryButton=By.xpath("//div[@class=\"header-menu\"]//ul[@class=\"top-menu\"]/li[6]//a[@href=\"/jewelry\"]");

    public void to_verify_jewelry_category(){
        //click on jewelry
        click_element(jewelryButton);
    }
    By electronicButton=By.xpath("//div[@class=\"header-menu\"]//ul[@class=\"top-menu\"]/li[2]//a[@href=\"/electronics\"]");
    public void verify_electronic_category_working(){
        //click on electronicButton
        click_element(electronicButton);
    }
    By bookButton=By.xpath("//div[@class=\"header-menu\"]/ul[@class=\"top-menu\"]/li[5]//a[@href=\"/books\"]");
    public void verify_book_category_working(){
        //click on bookButton
        click_element(bookButton);
    }
    By giftcardButton=By.xpath("//div[@class=\"header-menu\"]/ul[@class=\"top-menu\"]/li[7]//a[@href=\"/gift-cards\"]");
    public  void verify_giftcard_category(){
        //click on giftcardButton
        click_element(giftcardButton);
    }
    By elctronicButton=By.xpath("//div[@class=\"header-menu\"]/ul[@class=\"top-menu\"]/li[2]//a[@href=\"/electronics\"]");
    public void verify_electronics_category(){
        //click on electronicButton
        click_element(electronicButton);

    }
    By apparelButton=By.xpath("//div[@class=\"header-menu\"]/ul[@class=\"top-menu\"]/li[3]//a[@href=\"/apparel\"]");
    public void verify_apparel_category(){
        //click on apparelButton
    click_element(apparelButton);
    }
    By digitalDownload=By.xpath("//div[@class=\"header-menu\"]/ul[@class=\"top-menu\"]/li[4]//a[@href=\"/digital-downloads\"]");
    public void  verify_digitalDownload_category(){
        //click on digitalDownload
        click_element(digitalDownload);

    }
}

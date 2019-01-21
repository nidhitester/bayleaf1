package com.demo.nopcommerce;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

public class Hook extends Util {

    @Before
    public void browserLaunch() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");

    }
    @After
    public void teardown(){
    driver.quit();



}}

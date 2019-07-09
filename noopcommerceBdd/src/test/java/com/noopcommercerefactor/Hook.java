package com.noopcommercerefactor;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hook extends Util {
    CrossBrowser crossBrowser = new CrossBrowser();

    @Before
    public void browserLaunch() {
        crossBrowser.browser1();
    }
    @After
    public void teardown(){
    driver.quit();



}}

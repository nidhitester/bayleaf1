package com.noopcommercerefactor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CrossBrowser extends Util {
    LoadProp loadProp = new LoadProp();
        public static final String USERNAME = "nidhitester";
        public static final String ACCESS_KEY = "aa5e5a18-44c5-49a2-ae65-685f3b37a0a9";
        public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
        public String runner=System.getProperty("runner");
    public void browser1() {
        if (runner.equalsIgnoreCase("saucelab")) {
            DesiredCapabilities caps = DesiredCapabilities.chrome();
            caps.setCapability("platform", "Windows 10");
            caps.setCapability("version", "69");
            try {
                driver = new RemoteWebDriver(new URL(URL), caps);

            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
             }
            else {
                String browser = loadProp.getProperty("browser");
            if (browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "src\\main\\java\\com\\methods\\Driver\\geckodriver.exe");
                System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
                System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
            } else if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\Driver\\chromedriver.exe");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("disable-infobars");
                options.addArguments("--disable-extensions");
                options.addArguments("--disable-browser-side-navigation");
                options.addArguments("--incognito");
                options.addArguments("--disable-blink-features=BlockCredentialedSubresources");
                driver = new ChromeDriver(options);
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                driver.get(loadProp.getProperty("url"));
            } else if (browser.equalsIgnoreCase("ie")) {
                System.setProperty("webdriver.ie.driver", "src\\main\\java\\com\\methods\\Driver\\IEDriverServer.exe");
                InternetExplorerOptions options = new InternetExplorerOptions();
                options.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
                options.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
                driver = new InternetExplorerDriver(options);
                driver.manage().window().maximize();
            } else {
                System.out.println("Browser name is empty or typed wrong :" + browser);
            }

            }

        }
    }
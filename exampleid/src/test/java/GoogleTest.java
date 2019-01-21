import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleTest {

    private static WebDriver driver;
    @Test
    public void google(){

        System.setProperty("webdriver.chrome.driver","src\\test\\java\\google_id\\chromedriver.exe");
         driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("food");
        driver.findElement(By.name("btnK")).click();

    }
}
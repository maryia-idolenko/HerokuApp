import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Dropdown {

    @Test
    public void dropdowns() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        browser.get("http://the-internet.herokuapp.com/dropdown");
        browser.findElement(By.id("dropdown")).click();
        WebElement optional1 = browser.findElement(By.xpath("//*[@id=\"dropdown\"]/option[2]"));
        optional1.click();
        Assert.assertEquals(optional1.isSelected(), true, "Optional 1 is selected");
        WebElement optional2 = browser.findElement(By.xpath("//*[@id=\"dropdown\"]/option[3]"));
        optional2.click();
        Assert.assertEquals(optional2.isSelected(), true, "Optional 2 is selected");
        browser.quit();
    }
}
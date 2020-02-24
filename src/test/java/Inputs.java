import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class Inputs {

    @Test
    public void inputs() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        browser.get("http://the-internet.herokuapp.com/inputs");
        browser.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/input")).sendKeys(Keys.ARROW_UP);
        String webElement = browser.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/input")).getAttribute("value");
        assertEquals(webElement, "1", "1");
        browser.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/input")).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN);
        String element = browser.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/input")).getAttribute("value");
        assertEquals(element, "-1", "-1");
        browser.quit();
    }
}
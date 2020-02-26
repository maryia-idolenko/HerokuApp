import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;


public class Typos {

    @Test
    public void typosText() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        browser.get("http://the-internet.herokuapp.com/typos");
        browser.navigate().refresh();
        String typosText = browser.findElement(By.xpath("//*[@id=\"content\"]/div/p[2] ")).getText();
        assertEquals(typosText, "Sometimes you'll see a typo, other times you won't.", "Sometimes you'll see a typo, other times you won,t.");
        browser.quit();
    }
}
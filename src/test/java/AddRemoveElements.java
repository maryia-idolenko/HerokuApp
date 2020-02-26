import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddRemoveElements {

    @Test
    public void addRemoveElements() {
        int numberOfButtons = 0;
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("http://the-internet.herokuapp.com/add_remove_elements/");
        browser.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
        browser.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
        browser.findElement(By.className("added-manually")).click();
        numberOfButtons = browser.findElements(By.className("added-manually")).size();
        assertEquals(numberOfButtons, 1, "1 button is displayed");
        browser.quit();
    }
}
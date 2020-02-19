import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class Checkboxes {

    @Test
    public void checkboxes() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("http://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkboxes = browser.findElements(By.tagName("input"));
        assertEquals(checkboxes.get(0).isSelected(), false, "checkbox 1 is unchecked");
        checkboxes.get(0).click();
        assertEquals(checkboxes.get(0).isSelected(), true, "checkbox 1 is checked");
        assertEquals(checkboxes.get(1).isSelected(), true, "checkbox 2 is checked");
        checkboxes.get(1).click();
        assertEquals(checkboxes.get(1).isSelected(), false, "checkbox 2 is unchecked");
        browser.quit();
    }
}
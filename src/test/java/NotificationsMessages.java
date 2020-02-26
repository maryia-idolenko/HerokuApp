import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class NotificationsMessages {

    @Test
    public void addNotificationMessage() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        browser.get("http://the-internet.herokuapp.com/notification_message_rendered");
        browser.findElement(By.xpath("//*[@id=\"content\"]/div/p/a")).click();
        String notificationMessage = browser.findElement(By.xpath("//*[@id=\"flash\"]")).getText();
        assertEquals(notificationMessage, "Action successful\n" + "×");
        browser.quit();
    }
}
package heroku;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderTest {
    @Test
    public void verifyAbleSlider() {
        WebDriver driver = new ChromeDriver();
        // add link

        Actions actions = new Actions(driver);

        WebElement slider = driver.findElement(
                By.xpath("//input[@type='range']") // Tìm thanh slider theo XPath
        );

        actions
                .clickAndHold(slider)       // Click giữ vào slider
                .moveByOffset(10, 0)        // Di chuyển chuột sang phải 10 pixel
                .perform();                 // Thực thi hành động
    }
}

package heroku;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class NestedFramesTest {//verifyNestedFrames
    @Test
    public void verifyNestedFrames(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        String content = driver.findElement(By.tagName("body")).getText();
        Assert.assertTrue(content.contains("LEFT"));

        driver.switchTo().parentFrame(); //frame-top
        driver.switchTo().frame("frame-middle");
        content = driver.findElement(By.id("content")).getText();
        Assert.assertTrue(content.contains("MIDDLE"));

        driver.switchTo().parentFrame(); //frame-top
        driver.switchTo().frame("frame-right");
        content = driver.findElement(By.tagName("body")).getText();
        Assert.assertTrue(content.contains("RIGHT"));

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        content = driver.findElement(By.tagName("body")).getText();
        Assert.assertTrue(content.contains("BOTTOM"));

        driver.quit();

    }
}

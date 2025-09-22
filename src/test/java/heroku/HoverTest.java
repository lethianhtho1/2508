package heroku;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverTest {
    @Test

    public void hoverTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");

        Actions actions = new Actions(driver);
        WebElement user1 = driver.findElement(By.xpath("//div[@class='figure'][1]"));

        actions.moveToElement(user1).perform(); // hover to user avatar 1

        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='figure'][1]/div[@class='figcaption']")).isDisplayed());
    }


    @Test
    public void verifyContentDisplayedWhenHoverAvatar(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");

        Actions actions = new Actions(driver);
        WebElement avatar1 = driver.findElement(By.xpath("//div[@class='example']/div[@class='figure'][1]"));

        actions.moveToElement(avatar1).perform();
        String caption = driver.findElement(By.xpath("//div[@class='example']/div[@class='figure'][1]/div[@class='figcaption']/h5")).getText();
        Assert.assertEquals("name: user1", caption);
        driver.quit();
    }



}

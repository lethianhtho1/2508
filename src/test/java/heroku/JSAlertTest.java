package heroku;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlertTest {
    @Test
    public void acceptJSConfirmPopup(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();

        driver.switchTo().alert().accept();
        Assert.assertTrue(driver.findElement(By.id("result")).getText().contains("You clicked: Ok"));

        driver.quit();
    }

    @Test
    public void cancelJSConfirmPopup(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();

        driver.switchTo().alert().dismiss();
        Assert.assertTrue(driver.findElement(By.id("result")).getText().contains("You clicked: Cancel"));

        driver.quit();
    }

}

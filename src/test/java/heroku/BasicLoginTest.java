package heroku;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLoginTest {
 @Test

 public void loginSuccessfully(){
     WebDriver driver = new ChromeDriver();
     driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
     String content = driver.findElement(By.id("content")).getText();
     Assert.assertTrue(content.contains("Congratulations! You must have the proper credentials."));
     driver.quit();
 }
}

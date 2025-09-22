package heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static common.Browser.getDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage() {
        this.driver = getDriver();
    }

    public void login(String userName, String password){
        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.cssSelector("button[type=submit]")).click();
    }

    public String getFlashMessage(){
        return  driver.findElement(By.className("success")).getText();
    }
}
package heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static common.Browser.*;

public class LoginTest {
    @Test
    public void successfullyWithValidCredential() throws InterruptedException {
        launch("chrome");

        visit("https://the-internet.herokuapp.com/login");
        LoginPage loginPage = new LoginPage();
        loginPage.login("tomsmith","SuperSecretPassword");

        Thread.sleep(2000);
        Assert.assertEquals(getCurrentUrl(),"https://the-internet.herokuapp.com/secure");

        String successMessage = loginPage.getFlashMessage();
        Assert.assertTrue(successMessage.contains("You logged into a secure area!"));

        quit();
    }
    /*
         * TC01: Form Authentication: Login successful with valid credentials
         * Open browser
         * Navigate to https://the internet.herokuapp.com/leasa
         * Fill in username with teuswith
         * Fill in the password with SuperSecretPassword!
         Click on Login button
         * And the home page is appear *//* */
   /* @Test
    void successfullyWithValidCredential() {

       *//* ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption(name: "prefs", prefs);*//*


        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        //fill username tomsmith
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        // fill password SuperSecretPassword
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");*//*
        driver.findElement(By.cssSelector("#password")).sendKeys( "SuperSecretPassword");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("SuperSecretPassword");
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("SuperSecretPassword");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("SuperSecretPassword");*//*
        //  cho nut Login
        *//*
         *//**//*tagName: button
                attri:
                class =radius
                type= submit
                text = n/a
                *//*  //id >  name >  tagName >  className >  cssSelector >  xpath
        //runnable
        //user frist  locator -> keep fields having specified meaning
        // choose shorter

        //<button class="radius" type="submit"><i class="fa fa-2x fa-sign-in"> Login</i></button>
       *//* driver.findElement(By.tagName("button")).click();
        driver.findElement(By.className("radius")).click();
        driver.findElement(By.cssSelector(".radius")).click();

        driver.findElement(By.xpath("//*[@class='radius']")).click();
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        driver.findElement(By.cssSelector("[type='submit']")).click();*//*
        driver.findElement(By.cssSelector("button[type='submit']")).click(); //=>  okie nhat
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/secure");
        *//*TagName = *//*
        String successMessage = driver.findElement(By.className("success")).getText();
        Assert.assertTrue(successMessage.contains(" You logged into a secure area!"));
        driver.quit();


        // driver.findElement(By.xpath("//*[.='Login']")).click(); ->  khong phai thuoc tinh cua doi tuong



*//*
      * Fill in username with tomsmith
      * TagName: input (E)
      * Attributes:
     + type=text (A =t)
     + name=username
     + id=username
      * Text: n/a
      *
      * id ==> name =>  tagName > cssSelector => xpath
      * cssSelect formular : [A=t] if A=id ==>  #t
                       if A = Class =>  .t

                        E[A=t] if A=id =? E#t
      xpath formular : //*[@A='t'] or  //E[@A ='t']
                        // *[contains ( @A,'t')   ......

 *//*

*//*

//    driver.findElement(By.tagName("input")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("input")).sendKeys( "tomsmith");
        driver.findElement(By.xpath("//input")).sendKeys("tomsmith");

// driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("tomsmith");

// driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("[name=username]")).sendKeys("tomsmith");
            driver.findElement(By.xpath("//*[@name='username']")).sendKeys("tomsmith");

*//*

*//*  driver.findElement(By.cssSelector("[type=text]")).sendKeys("tomsmith") ;
    driver.findElement(By.xpath("//*[@type='text']")).sendKeys("tomsmith");
        driver.findElement(By.tagName("input")).sendKeys("tomsmith");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("[type=text]")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("tomsmith");*//*


    }

    @Test
    void InputPasswordWrong() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SecretPassword!123");
        // check click
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        String successMessage = driver.findElement(By.className("error")).getText();
        Assert.assertTrue(successMessage.contains("Your password is invalid!"));
        driver.quit();


    }
    void TC01LoginSuccessfully() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
    }
*/


}
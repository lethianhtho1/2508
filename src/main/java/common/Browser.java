package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

// all static methods
public class Browser {
    private static WebDriver driver;
    public static WebDriverWait wait;
    public static void launch(String browser){
        switch (browser.toLowerCase()) {
            case "chrome" -> {
                driver = new ChromeDriver();
                break;
            }
            case "firefox" -> {
                driver = new FirefoxDriver();
                break;
            }
            case "safari" -> {
                driver = new SafariDriver();
                break;
            }
            case "edge" -> {
                driver = new EdgeDriver();
                break;
            }
            default -> throw new IllegalStateException("Unexpected value: " + browser);
        };
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public static void visit(String url){
        driver.get(url);
    }
    public static String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
    public static void quit(){
        if(driver!=null){
            driver.quit();
        }
    }
    public static WebDriver getDriver(){

        return driver;
    }
    public static void fill(By locator, String value){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(value);
    }
    public static void click(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public static String getText(By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();

    }
}
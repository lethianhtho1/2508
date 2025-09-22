import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.HashMap;

public class ChromeTest {

    @Test
    public void getNormalModelTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        Assert.assertEquals("Selenium", driver.getTitle());
        driver.quit();
    }

  /*  @Test
    public void openBrowserWithHeadlessMode(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless=new");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.selenium.dev/");
        Assert.assertEquals("Selenium", driver.getTitle());
        driver.quit();*/
    //}
   /* @Test
    public void openBrowserWithMobileViewMode(){
        Map<String, Object> deviceMetrics = new HashMap<>();
        deviceMetrics.put("width", 344);
        deviceMetrics.put("height", 882);
        Map<String, Object> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceMetrics", deviceMetrics);

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.selenium.dev/");
        Assert.assertEquals(driver.getTitle(),"Selenium");
        driver.quit();*/
    //}

}





package heroku;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DateBookTicketVNAirline {
    @Test
    public void verifySelectDepartDateSuccessfully_1() {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.vietnamairlines.com/vn/vi/home");

        driver.findElement(By.id("cookie-agree")).click();

        driver.findElement(By.id("roundtrip-date-depart")).click();
        try {
            driver
                    .findElements(By.className("ui-datepicker-calendar"))
                    .getFirst()
                    .findElements(By.xpath("./tbody/tr/td/a"))
                    .forEach(dateCell -> {
                        if (dateCell.getText().contains("27")) dateCell.click();
                    });
//        System.out.println("");
        } catch (StaleElementReferenceException _) {
        }

        String departDate = driver.findElement(By.id("roundtrip-date-depart")).getAttribute("value");
        Assert.assertEquals("27/09/2025", departDate);

    }


}

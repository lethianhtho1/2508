package heroku;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxesTest{

    @Test
    public void verifySelectCheckboxesSuccessfully() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
/*
        WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
        checkbox1.click();*/
        WebElement checkbox1_1 = driver.findElement(By.cssSelector("form#checkboxes input:nth-child(1)"));

        WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
        //WebElement checkbox2_1= driver.findElement(By.cssSelector("form#checkboxes input:nth-child(3)"));
        //checkbox1_1.click();
        //checkbox2.click();
        if (!checkbox1_1.isSelected()) checkbox1_1.click();
        if (!checkbox2.isSelected()) checkbox2.click();
        Assert.assertTrue(checkbox1_1.isSelected());
        Assert.assertTrue(checkbox2.isSelected());
        driver.quit();
    }
    @Test
    public void verifySelectCheckboxes(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox1_1 = driver.findElement(By.cssSelector("form#checkboxes input:nth-child(1)"));
        WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
        if (checkbox1_1.isSelected()) checkbox1_1.click();
        if (checkbox2.isSelected()) checkbox2.click();
        driver.quit();
    }

}

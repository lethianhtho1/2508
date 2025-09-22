package heroku;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownTest {
    @Test
    public void verifySelectOptionSuccessfully() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        Select dropdown = new Select(driver.findElement(By.id("dropdown")));
        // dropdown.selectByValue("1"); -> it dùng
        // dropdown.selectByVisibleText("Option 1");
        dropdown.selectByIndex(1);
        Assert.assertTrue(driver.findElement(By.xpath("//option[@value='1']")).isSelected());
        //Assert.assertTrue(driver.findElement(By.xpath("//option[.='Option 1']")).isSelected());

        driver.quit();
    }



    @Test
    public void verifySelectMultipleOptionsSuccessfully(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://output.jsbin.com/osebed/2");

        Select dropdown = new Select(driver.findElement(By.id("fruits")));
        // Select Banana & Apple
        dropdown.selectByVisibleText("Banana");
        dropdown.selectByVisibleText("Apple");

        Assert.assertTrue(driver.findElement(By.xpath("//option[.='Banana']")).isSelected());
        Assert.assertTrue(driver.findElement(By.xpath("//option[.='Apple']")).isSelected());
        Assert.assertFalse(driver.findElement(By.xpath("//option[.='Orange']")).isSelected());
        Assert.assertFalse(driver.findElement(By.xpath("//option[.='Grape']")).isSelected());

        //Deselect banana
        dropdown.deselectByVisibleText("Banana");
        Assert.assertTrue(driver.findElement(By.xpath("//option[.='Apple']")).isSelected());
        Assert.assertFalse(driver.findElement(By.xpath("//option[.='Banana']")).isSelected());
        Assert.assertFalse(driver.findElement(By.xpath("//option[.='Orange']")).isSelected());
        Assert.assertFalse(driver.findElement(By.xpath("//option[.='Grape']")).isSelected());

        //Deselect all
        dropdown.deselectAll();
        Assert.assertFalse(driver.findElement(By.xpath("//option[.='Banana']")).isSelected());
        Assert.assertFalse(driver.findElement(By.xpath("//option[.='Apple']")).isSelected());
        Assert.assertFalse(driver.findElement(By.xpath("//option[.='Orange']")).isSelected());
        Assert.assertFalse(driver.findElement(By.xpath("//option[.='Grape']")).isSelected());

        driver.quit();

    }


}

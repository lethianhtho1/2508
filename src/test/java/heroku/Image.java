package heroku;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Image {

    @Test
    public void verifyBrokenImage() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/broken_images");

        driver.findElements(By.xpath("//div[@class='example']/img"))
                .forEach((WebElement image) -> {
                    System.out.println(image.getAttribute("src"));                         // In đường dẫn hình ảnh
                  /*  System.out.println(image.getDomProperty("naturalHeight"));            // Chiều cao thực tế
                    System.out.println(image.getDomProperty("naturalWidth"));     */        // Chiều rộng thực tế
                    if (Objects.equals(image.getDomProperty("naturalHeight"), "0")
                            && Objects.equals(image.getDomProperty("naturalWidth"), "0")) {

                        System.out.println("image not found");
                    } else {
                        System.out.println("found image");
                    }

                });
    }

}

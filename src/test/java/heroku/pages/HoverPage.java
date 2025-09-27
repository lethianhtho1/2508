package heroku.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static common.Browser.*;
public class HoverPage {


    public void open() {
        visit("https://the-internet.herokuapp.com/hovers");
    }

    public void hoverAvatar(int index) {
        WebElement target = findAll(By.cssSelector(".example .figure")).get(index - 1);
        actions.moveToElement(target).perform();
    }

   public String getCaption(int index){
       return findAll(By.cssSelector(".example .figure")).get(index - 1).findElement(By.xpath("./div/h5")).getText();

   }
}

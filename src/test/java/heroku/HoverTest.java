package heroku;

import base.BaseTest;
import heroku.pages.HoverPage;
import org.testng.Assert;
import org.testng.annotations.Test;



public class HoverTest extends BaseTest {


    @Test
    public void hoverTest() {
        // Mở trang hover
        HoverPage hoverPage = new HoverPage();
        hoverPage.open();

        hoverPage.hoverAvatar(1);
        Assert.assertEquals(hoverPage.getCaption(1), "name: user1");
    }
}

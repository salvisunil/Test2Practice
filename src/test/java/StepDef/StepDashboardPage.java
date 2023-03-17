package StepDef;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

public class StepDashboardPage extends PageObject {

    public void clickVerify()
    {
      String dashboardTitle = $(By.xpath("//span[@class='title']")).getText();
        Assert.assertEquals("PRODUCTS",dashboardTitle);
    }

}

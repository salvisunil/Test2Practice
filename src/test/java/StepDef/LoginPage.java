package StepDef;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    @Step("Enter UserName")
    public void inputUserName(String username){
        $(By.xpath("//input[@placeholder='Username']")).sendKeys(username);

    }
    @Step("Enter Password")
    public void inputPassword(String password){
        $(By.xpath("//input[@placeholder='Password']")).sendKeys(password);

    }
    @Step("Click Login")
    public void clickLogin(){
        $(By.xpath("//input[@id='login-button']")).click();
    }




}

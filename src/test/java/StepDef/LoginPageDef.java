package StepDef;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageDef {

    @Steps
    LoginPage loginPage;
    @Steps
    StepDashboardPage dashboardPage;

    @Given("User open home page")
    public void openApplication() {
        loginPage.open();
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("page is open");
    }

    @When("User enters username as {string}")
    public void enterUsername(String username) {
        System.out.println("Enter username");
        loginPage.inputUserName(username);
    }

    @When("User enters password as {string}")
    public void enterPassword(String password) {
        System.out.println("Enter password");
        loginPage.inputPassword(password);
        loginPage.clickLogin();
    }

    @Then("User Should be able login successfully")
    public void clickOnButton() {
        dashboardPage.clickVerify();
    }
}

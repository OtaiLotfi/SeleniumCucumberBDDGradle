package test.e2e.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import test.e2e.pages.LoginPage;

public class loginStepDefinitions {

    private final LoginPage loginPage;
    public static WebDriver driver;
    public  static ChromeOptions options;
    public loginStepDefinitions(LoginPage loginPage){
        this.loginPage =  loginPage;
    }

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver chromeDriver = new ChromeDriver(options);
        chromeDriver.get("https://automationteststore.com/");
        //chromeDriver.get("https://www.ebay.com/");
        Thread.sleep(4000);
        WebElement xx = chromeDriver.findElement(By.xpath("//*[@id='categorymenu']/nav/ul/li[3]/a"));
        Thread.sleep(4000);
        xx.click();
    }

    @Then("then")
    public void then() throws InterruptedException {
        WebElement xx = driver.findElement(By.xpath("//*[@id='categorymenu']/nav/ul/li[3]/a"));
        Thread.sleep(4000);
        xx.click();
    }
}

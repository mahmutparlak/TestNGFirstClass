package TestNGAgain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    WebDriver driver;
    @BeforeMethod
    public void openAndNavigate() {
        System.setProperty("webdriver.chrome.driver", "/Users/hilal/IdeaProjects/jarz/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void validAdminLogin() {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        WebElement welcomeMessage = driver.findElement(By.linkText("Welcome Admin"));

        if (welcomeMessage.isDisplayed()) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
    @Test
    public void validateBrowser() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Human Management System";

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title is confirmed");
        } else {
            System.out.println("Title is not confirmed");
        }
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}

package lesson3;

import HW3.HomePage;
import HW3.enums.Users;
import base.SeleniumTestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class SimpleTestPageObject extends SeleniumTestBase {
    private WebDriver driver;
    private HomePage homePage;

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        homePage = PageFactory.initElements(driver, HomePage.class);
    }


    @BeforeMethod
    public void beforeMethod() {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
    }

    @AfterMethod()
    public void afterMethod() {
        driver.close();
    }

    @Test
    public void simpleTest(){

        //2 Navigate
        driver.navigate().to("https://epam.github.io/JDI/index.html");
        //3
        assertEquals(driver.getTitle(), "Home Page");
        //4
        homePage.login(Users.PITER);

    }
}

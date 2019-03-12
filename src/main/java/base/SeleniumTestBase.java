package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;

public abstract class SeleniumTestBase {
    protected WebDriver driver;
    public final String PATH_TO_CHROME_DRIVER = "src/main/resources/chromedriver";


    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() {
        setProperty("webdriver.chrome.driver", PATH_TO_CHROME_DRIVER);
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite(){

    }

}

package lesson4;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.testng.AssertJUnit.assertEquals;

public class SelenideSimpleTest {
    @BeforeSuite
    public void beforeSuite(){
        Configuration.browser = Browsers.CHROME;
        Configuration.pageLoadStrategy = "normal";
        Configuration.timeout = 5000;
        Configuration.pollingInterval = 5000;
        Configuration.startMaximized = true;
    }


    @Test
    public void simpleTest() {

        //2
        Selenide.open("https://epam.github.io/JDI/index.html");

        //3
        assertEquals(getWebDriver().getTitle(), "Home Page");

        //4
        $("[id='user-icon']").click();
        $("[id='name']").sendKeys("epam");
        $("[id='password']").sendKeys("1234");
        $("[id='login-button']").click();

        $("#user name").shouldHave(text("PITER CHAILOVSKII"));

        //5
        close();
    }


}

package base;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;

public class SelenideBase {
        @BeforeSuite
        public void beforeSuite() {
            Configuration.browser = Browsers.CHROME;
            Configuration.startMaximized = true;
            Configuration.timeout = 4000;
            Configuration.pollingInterval = 200;
        }
}

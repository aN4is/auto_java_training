package lesson2;

import base.SeleniumTestBase;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class SimpleTestWithDataProvider extends SeleniumTestBase {

    @DataProvider
    private Object[][] simpleDataProvider() {
        return new Object[][] {
                {0, "Ivan"},
                {1, "Roman"},
                {2, "Dima"}
        };
    }

    @Test(dataProvider = "simpleDataProvider") //sent data from annotation DataProvider (test one - data different)
    public void simpleTest(int i, String s) {
        System.out.println("int = " + i + "\n" + "String = " + s);
    }
}

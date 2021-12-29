package org.ex;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SomeSuite1 {
    WebDriver driver;
    @BeforeClass
    public void driverInit() {
        driver = BaseTest.getDriver();
    }

    @Test
    public void firstVerify() {
        driver.get("https://parabank.parasoft.com/");
        Assert.assertEquals("ParaBank | Welcome | Online Banking", driver.getTitle());
    }

    @Test
    public void firstVerify1() {
        driver.get("https://www.selenium.dev/");
        driver.navigate().refresh();
        Assert.assertTrue(driver.getTitle().contains("Selenium"), "this page does not contains any 'Selenium'");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

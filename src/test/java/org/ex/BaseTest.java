package org.ex;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public static WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver defaultDriver = new ChromeDriver();
        return defaultDriver;
    }
}

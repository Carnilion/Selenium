package com.company;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

    @Test
    public void startWebdriver() {
//        System.setProperty("webdriver.chrome.driver", "/Users/mzyrkowski/selenium_chrome/chromedriver");
//        WebDriver driver = new ChromeDriver();

//        System.setProperty("webdriver.gecko.driver", "/Users/mzyrkowski/selenium/geckodriver");
//        WebDriver driver = new FirefoxDriver();
//
//        driver.get("http://www.learn-automation.com");
//        System.out.println(driver.getTitle());

        System.setProperty("webdriver.gecko.driver", "/Users/mzyrkowski/selenium/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://www.learn-automation.com");
        System.out.println(driver.getTitle());
        driver.close();
    }
}

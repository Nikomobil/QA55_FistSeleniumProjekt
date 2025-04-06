package com.ait.qa55;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstSeleniumTest {


    WebDriver driver;
    //before -setUp
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
//        driver.get("https://www.google.com");// without history
        // maximize browser to window
        driver.manage().window().maximize();
        driver.navigate().to("https://ilcarro.web.app/search");// with history
        // wait for all elements on the site to load before starting test
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        driver.navigate().refresh();
    }
    //test-
    @Test
    public void openGoogle() {
        System.out.println("Hello!");
    }

    @AfterMethod(enabled = false)// not close page
    public void tearDown() {
//        driver.quit(); //all tabs and browser
        driver.close();// only one tab(if tan only -> close browser)
    }

    //after - tearDown


}


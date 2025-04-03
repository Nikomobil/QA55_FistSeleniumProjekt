package com.ait.qa55;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {


    WebDriver driver;
    //before -setUp
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
//        driver.get("https://www.google.com");// without history
        driver.navigate().to("https://ilcarro.web.app/search");// with history
        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
    }
    //test-
    @Test
    public void openGoogle() {
        System.out.println("Hello!");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    //after - tearDown


}


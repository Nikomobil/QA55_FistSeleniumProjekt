package com.ait.qa55;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;
import java.util.List;

public class TableTestsHw {
    WebDriver driver;

    @BeforeMethod
    public void SetUp(){
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/css/css_table_responsive.asp");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void findElementsTableWithCSSTest(){
        List<WebElement> lines = driver.findElements(By.cssSelector("tr"));
        System.out.println(lines.size());
        for (WebElement line : lines){
            System.out.println(line.getText());
            WebElement line1 = driver.findElement(By.cssSelector("tr:nth-child(2)"));
            System.out.println(line1.getText());
            WebElement line3 = driver.findElement(By.cssSelector("tr:nth-child(3) td:nth-child(1)"));
            System.out.println(line3.getText());
            WebElement line4 = driver.findElement(By.cssSelector("tr:nth-child(4) td:last-child"));
            System.out.println(line4);
            WebElement line5 = driver.findElement(By.cssSelector("tr:nth-child(4) td:first-child"));
            System.out.println(line5);


        }


    }
}

package com.ait.qa55;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindElementWebShopTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void findElement(){
        WebElement element = driver.findElement(By.linkText("Shopping cart"));
        System.out.println(element.getTagName());
        WebElement cart = driver.findElement(By.partialLinkText("cart"));
        System.out.println(cart.getTagName());
    }

    @Test
    public void findElementByCssSelector(){
        driver.findElement(By.cssSelector("#bar-notification"));
        driver.findElement(By.cssSelector("ul"));
        WebElement element = driver.findElement(By.cssSelector(".top-menu"));
        System.out.println(element.getTagName());
        driver.findElement(By.cssSelector("[href='/apparel-shoes']"));
        //contains -> *
        driver.findElement(By.cssSelector("[href*='/apparel']"));
        //start -> ^
        driver.findElement(By.cssSelector("[href^='/app']"));
        // end on -> $
        driver.findElement(By.cssSelector("[href$='/shoes']"));
    }

    @Test
    public void findElementById(){
        WebElement element = driver.findElement(By.id("dialog-notifications-success"));
        System.out.println(element.getTagName());
        WebElement element1 = driver.findElement(By.id("bar-notification"));
        System.out.println(element1.getTagName());
        WebElement element2 = driver.findElement(By.id("dialog-notifications-error"));
        System.out.println(element2.getTagName());
        WebElement element3 = driver.findElement(By.id("flyout-cart"));
        System.out.println(element3.getTagName());
        WebElement element4 = driver.findElement(By.id("mob-menu-button"));
        System.out.println(element4.getTagName());

    }
    @Test
    public void findElementByClassName(){
        WebElement header = driver.findElement(By.className("header"));
        System.out.println(header.getText());
        WebElement topMenu = driver.findElement(By.className("top-menu"));
        System.out.println(topMenu.getText());
        WebElement search = driver.findElement(By.className("search-box"));
        System.out.println(search.getText());
        WebElement topMenu1 = driver.findElement(By.className("top-menu"));
        System.out.println(topMenu1.getText());
        WebElement topMenu2 = driver.findElement(By.className("mob-top-menu"));
        System.out.println(topMenu2.getText());
    }

    @Test
    public void findElementByXpath(){
        // any tag
//        driver.findElement(By.xpath("//*[@id='bar-notification']"));
        driver.findElement(By.xpath("//div[@id='bar-notification']"));
        driver.findElement(By.xpath("//ul"));
        driver.findElement(By.xpath("//ul[@class='top-menu']"));
        driver.findElement(By.xpath("//a[contains(.,'Gift')]"));
        //Text
        driver.findElement(By.xpath("//span[text() = 'Sign up for our newsletter:']"));
        driver.findElement(By.xpath("//input[starts-with(@value,'Se')]"));
        driver.findElement(By.xpath("//div[@class='header-menu']/.."));

        driver.findElement(By.xpath("//strong/parent::*"));
        driver.findElement(By.xpath("//strong/parent::div"));


        driver.findElement(By.xpath("//script/ancestor::*"));
        driver.findElement(By.xpath("//script/ancestor::head"));

        // +5
        driver.findElement(By.xpath("//script/parent::*"));
        driver.findElement(By.xpath("//script/following-sibling::*"));
        driver.findElement(By.xpath("//script/preceding-sibling::*"));

        driver.findElement(By.xpath("//strong/ancestor::*"));
        driver.findElement(By.xpath("//strong/following-sibling::*"));
        driver.findElement(By.xpath("//strong/following-sibling::script"));

        driver.findElement(By.xpath("//a/following-sibling::div"));

        driver.findElement(By.xpath("//a/preceding-sibling::*"));
//        driver.findElement(By.xpath("//a/preceding-sibling::div"));
        }

    }




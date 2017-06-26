package com.eviltester.webdriver;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by SAMUEL on 6/25/2017.
 */
public class BasicElementInterrogationTest {

    public static  WebDriver driver;

    @BeforeClass

    public static void startDriver(){

        driver = new FirefoxDriver();

    }

    @Test

    public void domInterrogationTest(){

        final String testURL = "https://www.compendiumdev.co.uk/selenium/basic_web_page.html";

        driver.navigate().to(testURL);

        System.out.println("Navigated");

        WebElement para1 = driver.findElement(By.id("para1"));

        System.out.println("Found Element");

        Assert.assertEquals(para1.getText(), "A paragraph of text");

        System.out.println("Asserted");

    }

    @AfterClass

    public static void stopDriver(){

        //driver.close();
        driver.quit();

    }




}

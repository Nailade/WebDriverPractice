package com.eviltester.webdriver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by SAMUEL on 6/28/2017.
 */
public class FindElementsTest {

    public static WebDriver driver;

    @BeforeClass

    public static void startDriver(){

        driver = new FirefoxDriver();

    }

    @Test


    public void useFindElements(){

        driver.navigate().to("http://www.compendiumdev.co.uk/selenium/find_by_playground.php");

        List<WebElement> elements;

        elements = driver.findElements(By.tagName("div"));

        assertEquals(19, elements.size());

        System.out.println(elements);

    }

    @AfterClass

    public static void closeDriver(){


        driver.quit();

    }


}

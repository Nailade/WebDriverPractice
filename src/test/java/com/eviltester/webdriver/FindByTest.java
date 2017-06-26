package com.eviltester.webdriver;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import com.eviltester.webdriver.DriverController;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.eviltester.webdriver.DriverController.driver;

/**
 * Created by SAMUEL on 6/25/2017.
 */
public class FindByTest{


    @BeforeClass

    public static void testStart(){

        final String testURL = "http://www.compendiumdev.co.uk/selenium/find_by_playground.php";

        DriverController.startFireFoxDriver();

        driver.navigate().to(testURL);

    }


    @Test

    public void findByText() {

        WebElement zeroParaText = driver.findElement(By.id("a26"));

        Assert.assertEquals("jump to para 0",zeroParaText.getText());

        System.out.println(zeroParaText.getText());


    }


    @Test

    public void findByLinkText() {

        WebElement jumpToPara0 = driver.findElement(By.linkText("jump to para 0"));

        Assert.assertEquals("a26",jumpToPara0.getAttribute("id"));


    }



    @Test

    public void findByID() {

        WebElement cParaText = driver.findElement(By.id("p3"));

        Assert.assertEquals("This is c paragraph text",cParaText.getText());

        System.out.println(cParaText.getText());

    }

    @AfterClass

    public static void endTest(){


        DriverController.closeDriver();

    }

}

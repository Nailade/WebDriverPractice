package com.eviltester.webdriver;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import com.eviltester.webdriver.DriverController;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.eviltester.webdriver.DriverController.driver;
import static org.junit.Assert.assertEquals;

public class ChainFindByTest {

    @BeforeClass

    public static void testStart(){

        DriverController.startFireFoxDriver();

        driver.navigate().to("http://www.compendiumdev.co.uk/selenium/find_by_playground.php");

    }

    @Test

    public void testChainFindBy(){

    WebElement element = driver.findElement(By.id("div18"))
                               .findElement(By.name("ulName1"))
                                .findElement(By.name("liName1"))
                                .findElement(By.id("a26"));

        assertEquals(element.getText(),"jump to para 0");

    }

    @AfterClass

    public static void closeDriver(){

            DriverController.closeDriver();

        }

}

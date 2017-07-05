package com.eviltester.webdriver;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import com.eviltester.webdriver.DriverController;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.eviltester.webdriver.DriverController.driver;



public class CssSelectiorTest {


    @BeforeClass

    public static void startDriver(){

        DriverController.startChromeDriver();

        driver.navigate().to("http://www.compendiumdev.co.uk/selenium/find_by_playground.php");

    }


    @Test

    public void cssSeletionPracticeTest(){

        WebElement p31ByID = driver.findElement(By.cssSelector("p#p31"));

        Assert.assertEquals("Test that ID 'p31' has the Name 'pName31'",p31ByID.getAttribute("name"),"pName31" );

        WebElement byName1 = driver.findElement((By.cssSelector("ul[name='ulName1']")));

        Assert.assertEquals("Test that name 'ulName1' has ID 'ul1'", byName1.getAttribute("id"), "ul1");

        WebElement byClassName = driver.findElement(By.cssSelector(".SpecialDiv"));

        Assert.assertEquals("Test that class name 'specialDiv'", byClassName.getAttribute("id"), "div1");

        WebElement byTagName = driver.findElement(By.cssSelector("li"));

        Assert.assertEquals("Test that tag name 'li' contains name 'liName1'", byTagName.getAttribute("name"), "liName1");




    }



    @AfterClass

    public static void closeDriver(){

        DriverController.closeDriver();


    }


}

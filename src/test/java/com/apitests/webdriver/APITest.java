package com.apitests.webdriver;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by SAMUEL on 7/23/2017.
 */
public class APITest {


   @Test

    public void startDriver() {

       WebDriver driver = new ChromeDriver();


       driver.navigate().to("https://www.worldwinner.com");

       WebElement userNameField = driver.findElement(By.cssSelector("#usernameElement"));

       assertEquals("name is 'username'", userNameField.getAttribute("name"),"username");

       userNameField.click();

       userNameField.sendKeys("thanos1991");

       userNameField.submit();

       assertEquals("name is 'username'", userNameField.getAttribute("name"),"thanos1991");

       driver.close();

   }

}

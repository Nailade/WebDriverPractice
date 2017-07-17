package com.eviltester.webdriver;
import org.junit.*;
import com.eviltester.webdriver.DriverController;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.eviltester.webdriver.DriverController.driver;
import static org.junit.Assert.assertEquals;
import static com.eviltester.webdriver.DriverController.startChromeDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

/**
 * Created by SAMUEL on 7/15/2017.
 */
public class BasicAjaxPageTest {

    public final static String server = "combo1" ;
    public final static String server2 = "option[value='3']";
    public final static String java = "combo2" ;
    public final static String java2 = "[value='23']";
    public final static String codeInIt = "[value='Code In It']";
    public static final String javatest = "option[value='23']";
    public final static String valueLanguageIDString = "_valuelanguage_id";
    WebDriverWait wait;


    @Before

    public void startDriver(){

        startChromeDriver();
        wait = new WebDriverWait(driver,10);

    }

    @Test
    public void  clickOnButtonTest(){

        driver.get("http://www.compendiumdev.co.uk/selenium/basic_ajax.html");


        wait.until(titleIs("Basic Ajax"));

        WebElement dropDownServer = driver.findElement(By.id(server));
        dropDownServer.findElement(By.cssSelector(server2)).click();

        wait.until(presenceOfElementLocated(By.cssSelector(java2)));

        WebElement dropDownJava = driver.findElement(By.id(java));
        dropDownJava.findElement(By.cssSelector(java2)).click();

        WebElement codeInItButton = driver.findElement(By.name("submitbutton"));
        codeInItButton.click();

        WebElement valueLanguageID = driver.findElement(By.id(valueLanguageIDString));
        assertEquals("element has '_valuelanguage_id' text of 23", "23",valueLanguageID.getText());

        System.out.println(valueLanguageID.getText());


    }

    @After

    public void closeDriver(){


        driver.close();
    }

}

package com.eviltester.webdriver;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasicWebPageTest {

    public static WebDriver driver;


    @BeforeClass

    public static void startDriver(){

        driver = new ChromeDriver();

    }



    @Test
    public void basicTest() {


        final String testPageURL = "https://www.compendiumdev.co.uk/selenium/basic_web_page.html";


        driver.navigate().to(testPageURL);


        Assert.assertTrue("Title is: 'Basic Web Page Title'",
                driver.getTitle().equals("Basic Web Page Title"));

        Assert.assertTrue("URL is:" + testPageURL,
                driver.getCurrentUrl().equals(testPageURL));

        Assert.assertTrue("Page source contains 'A paragraph of text'",
                driver.getPageSource().contains("A paragraph of text"));

        System.out.println(driver.getPageSource());


    }

     @AfterClass

     public static void stopDriver(){

         driver.close();
         driver.quit();



     }




}

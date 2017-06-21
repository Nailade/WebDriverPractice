package com.eviltester.webdriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasicWebPageTest {

    @Test
    public void startWebDriver() {

        WebDriver driver = new ChromeDriver();


        driver.navigate().to("https://www.compendiumdev.co.uk/selenium/basic_web_page.html");


        Assert.assertTrue("Title is: 'Basic Web Page Title'",
                driver.getTitle().equals("Basic Web Page Title"));

        Assert.assertTrue("URL is: 'https://www.compendiumdev.co.uk/selenium/basic_web_page.html'",
                driver.getCurrentUrl().equals("https://www.compendiumdev.co.uk/selenium/basic_web_page.html"));

        Assert.assertTrue("Page source contains 'A paragraph of text'",
                driver.getPageSource().contains("A paragraph of text"));

        driver.close();
        driver.quit();


    }




}

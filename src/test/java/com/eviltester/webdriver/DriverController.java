package com.eviltester.webdriver;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by SAMUEL on 6/25/2017.
 */
public class DriverController {


    public static WebDriver driver;


    public static void startChromeDriver(){

        driver = new ChromeDriver();

    }

    public static void startFireFoxDriver(){

        driver = new FirefoxDriver();

    }


    public static void closeDriver(){

        driver.close();

    }

}

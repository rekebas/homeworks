package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class NavigationTests {


    WebDriver driver;



public  void ChromeTest() {

      WebDriver driver = BrowserFactory.getDriver("Chrome");


    driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    driver.navigate().to("http://www.google.com");
    String titleGoogle = driver.getTitle();
    driver.get("http//www.etsy.com");
    String titleEtsy = driver.getTitle();
    driver.navigate().back();
    System.out.println(driver.getTitle().equalsIgnoreCase(titleGoogle));
    driver.navigate().forward();
    System.out.println(driver.getTitle().equalsIgnoreCase(titleEtsy));
    driver.quit();
}

    public  void firefoxTest() {

        WebDriver driver = BrowserFactory.getDriver("firefox");


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.navigate().to("http://www.google.com");
        String titleGoogle = driver.getTitle();
        driver.get("http//www.etsy.com");
        String titleEtsy = driver.getTitle();
        driver.navigate().back();
        System.out.println(driver.getTitle().equalsIgnoreCase(titleGoogle));
        driver.navigate().forward();
        System.out.println(driver.getTitle().equalsIgnoreCase(titleEtsy));
        driver.quit();
    }

    public  void edgeTest() {

        WebDriver driver = BrowserFactory.getDriver("edge");


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.navigate().to("http://www.google.com");
        String titleGoogle = driver.getTitle();
        driver.get("http//www.etsy.com");
        String titleEtsy = driver.getTitle();
        driver.navigate().back();
        System.out.println(driver.getTitle().equalsIgnoreCase(titleGoogle));
        driver.navigate().forward();
        System.out.println(driver.getTitle().equalsIgnoreCase(titleEtsy));
        driver.quit();
    }


}




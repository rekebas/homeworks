package com.cbt.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class TitleVerification {
    public static void main(String[] args) throws InterruptedException {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown", "http://practice.cybertekschool.com/login");

        WebDriver driver = BrowserFactory.getDriver("Chrome");


        List<String> texts = new ArrayList<>();
                for (int i = 0; i <urls.size() ; i++) {

                    driver.get(urls.get(i));

                    texts.add(driver.getTitle());
                    Thread.sleep(3000);


                }
          String expectedTitle = texts.get(0);
                String expectedURL ="http://practice.cybertekschool.com/";
                if (texts.get(0).equalsIgnoreCase(expectedTitle)&&
                        (texts.get(1).equalsIgnoreCase(expectedTitle))&&texts.get(2).equalsIgnoreCase(expectedTitle)){
                    System.out.println(" The Webpages Have The Same Title. TEST PASSED! ");
                }
                else {


                     System.out.println(" The Webpages Don't Have The Same Title. TEST FAILED!!! ");
                }

                if (urls.get(0).startsWith(expectedURL)&&
                (urls.get(1).startsWith(expectedURL))&&urls.get(2).startsWith(expectedURL)){
            System.out.println(" The Webpages Have The Correct URL. TEST PASSED! ");
        }
                else {


            System.out.println(" The Webpages Don't Have Correct URL. TEST FAILED!!! ");
        }



        driver.quit();

    }
}




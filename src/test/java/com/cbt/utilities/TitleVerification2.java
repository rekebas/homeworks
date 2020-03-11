package com.cbt.utilities;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");

        List<String> urls = Arrays.asList("https://www.luluandgeorgia.com/",
                "https://wayfair.com/", "https://walmart.com", "http://westelm.com/");



        for (String newUrl:urls){
            driver.get(newUrl);
            String title=driver.getTitle();
            title=title.replace(" ","").toLowerCase();
            System.out.println(newUrl+" contains: "+title+" Result: "+newUrl.contains(title));
        }
        driver.quit();
    }
}
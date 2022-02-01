package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P04_GettingPageSource_CurrentUrl {
    public static void main(String[] args) {

        // Setup Chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //navigate to practice page that open ner tab
        driver.get("http://www.google.com");

        String currentURL = driver.getCurrentUrl();
        System.out.println("driver.getCurrentUrl() = " +currentURL);

        // get the page source of html

        //System.out.println("driver.getPageSource() = " + driver.getPageSource());


        driver.quit();
    }


}

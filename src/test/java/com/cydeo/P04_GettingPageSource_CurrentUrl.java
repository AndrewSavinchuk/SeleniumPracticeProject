package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P04_GettingPageSource_CurrentUrl {
    public static void main(String[] args) {

        // Setup Chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //navigate to practice page that open ner tab
        driver.get("http://google.com");

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        // get the page source of html

        System.out.println("driver.getPageSource() = " + driver.getPageSource());


        driver.quit();
    }


}

package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_GettingPageTitle {

    public static void main(String[] args) {

        // Setup Chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //navigate to practice page that open ner tab
        driver.get("http://google.com");

        String pageTitle = driver.getTitle();
        System.out.println("pageTitle = " + pageTitle);

        if (pageTitle.equals("Google2")) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");

        }

        // quit the browser
        driver.quit();

    }


}

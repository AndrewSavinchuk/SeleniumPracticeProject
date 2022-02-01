//TC #1: Yahoo Title Verification
//        1. Open Chrome browser
//        2. Go to https://www.yahoo.com
//        3. Verify title:
//        Expected: Yahoo

package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

public class Practice01_YahooVerification {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        //driver.get(url)
        driver.get("https://www.yahoo.com");

        String yahooTitle = driver.getTitle();
        System.out.println("pageTitle = " + yahooTitle);


        String originalTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

        if (originalTitle.equals(yahooTitle)) {
            System.out.println("Test passed");
        } else {
            throw new RuntimeException("Test failed. CHECK YOUR TITLE:  " + originalTitle);
        }
        driver.quit();
    }

}

package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDryRun {

    public static void main(String[] args) {
        // 1. Setup Chrome Driver so selenium can use it to automate chrome
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\savaw\\OneDrive\\Desktop\\Cybertech school\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        // 2. Create Chrome Driver Object to open browser
        WebDriver driver = new ChromeDriver();
        // 3. navigate to https://google.com
        driver.navigate().to("https://www.tesla.com");

//        // 1. Setup Firefox Driver so selenium can use it to automate chrome
//        WebDriverManager.firefoxdriver().setup();
//        // 2. Create Firefox Driver Object to open browser
//        WebDriver driver = new FirefoxDriver();
//        // 3. navigate to https://google.com
//        driver.navigate().to("https://google.com");



    }


}

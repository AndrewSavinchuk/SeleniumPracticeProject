package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P02_CloseAndQuitBrowser {
    public static void main(String[] args) throws InterruptedException {
        // Setup Chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //navigate to practice page that open ner tab
        driver.get("http://practice.cybertekschool.com/open_new_tab");

        Thread.sleep(5000);
        // close method any current browser tab that in focus
        driver.close();

        // close all browser window opened by the driver
        //driver.quit();



    }




}

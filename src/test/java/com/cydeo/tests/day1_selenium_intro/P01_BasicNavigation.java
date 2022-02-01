package com.cydeo.tests.day1_selenium_intro;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_BasicNavigation {
    public static void main(String[] args) throws InterruptedException {

        // Setup Chrome and create WebDriver instance
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        //driver.get(url)
        driver.get("https://google.com");
        Thread.sleep(3000);
        driver.get("https://tesla.com");
        Thread.sleep(3000);
        // navigate.back()
        driver.navigate().back();
        Thread.sleep(3000);
        // navigate.forward()
        driver.navigate().forward();
        Thread.sleep(3000);
        // navigate.refresh()
        driver.navigate().refresh();
    }
}

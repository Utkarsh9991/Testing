package com.app.BusBooking.Base;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Base {
    public static WebDriver driver;
    public static ExtentReports extentreports;
    public static ExtentTest extentTest;

    public static void openBrowser(String browser) {
        System.out.println("Opening the browser");
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.redbus.com/");
    }
}

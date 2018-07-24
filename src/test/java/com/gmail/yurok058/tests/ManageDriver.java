package com.gmail.yurok058.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;


public class ManageDriver {

    public static WebDriver driver;


    @BeforeClass
    public static void start() {
        ///System.setProperty("webdriver.chrome.driver", "c:/Users/MacPro/Work/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @AfterClass
    public static void finish() {

        driver.quit();
    }
}

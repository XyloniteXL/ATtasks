package com.gmail.yurok058.tests;

import com.gmail.yurok058.pages.PoiskPage;
import com.gmail.yurok058.pages.PoiskResult;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;


public class ManageDriver {

    public static WebDriver driver;
    public static PoiskPage poiskPage;
    public static PoiskResult poiskResult;

    @BeforeClass
    public static void start() {
        ///System.setProperty("webdriver.chrome.driver", "c:/Users/MacPro/Work/chromedriver.exe");
        driver = new ChromeDriver();
        poiskPage = new PoiskPage(driver);
        poiskResult = new PoiskResult(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://ya.ru/");
    }
    @AfterClass
    public static void finish() {
        //WebElement onmain = driver.findElement(By.cssSelector("a[class*='ys-ru']"));
        //onmain.click();
        driver.quit();
    }
}

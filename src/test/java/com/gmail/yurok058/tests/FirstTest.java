package com.gmail.yurok058.tests;

import com.gmail.yurok058.pages.PoiskPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstTest extends ManageDriver{

    private static WebDriver driver;

    /*@BeforeClass
    public static void start() {
        ///System.setProperty("webdriver.chrome.driver", "c:/Users/MacPro/Work/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://ya.ru/");
    }*/
    @Test
    public void SearchWeather(){
        poiskPage.inputINsearch("Погода пенза");
        poiskPage.clickSearchButt();

    }
    @Test
    public void Weatherintown() {
        /*WebElement inputfield = driver.findElement(By.cssSelector("input[tabindex='2']"));
        inputfield.sendKeys("погода пенза");
        WebElement searchbutt = driver.findElement(By.cssSelector("button[type='submit']"));
        searchbutt.click();
        WebElement prognozlink = driver.findElement(By.cssSelector("a[accesskey*='1']"));*/

        String txtprognozlink = poiskResult.getTxtPrognozLink();
        Assert.assertTrue(txtprognozlink.contains("Погода"));
    }

   /* @AfterClass
    public static void finish() {
        //WebElement onmain = driver.findElement(By.cssSelector("a[class*='ys-ru']"));
        //onmain.click();
        driver.quit();
    }*/
}

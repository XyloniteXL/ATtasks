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


    @Test
    public void SearchWeather(){
        poiskPage.goPage();
        poiskPage.inputINsearch("погода пенза");
        poiskPage.clickSearchButt();
        String txtprognozlink = poiskResult.getTxtPrognozLink();
        Assert.assertTrue(txtprognozlink.contains("Погода"));

    }
}

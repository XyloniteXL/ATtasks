package com.gmail.yurok058.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PoiskPage {

    public PoiskPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }

    public WebDriver driver;

    @FindBy(css = "input[tabindex='2']")
    private WebElement inputfield;

    @FindBy(css = "button[type='submit']")
    private WebElement searchbutt;

    public void inputINsearch(String str){
        inputfield.sendKeys(str);

    }
    public void clickSearchButt(){
        searchbutt.click();

    }
    public void goPage(){
        driver.get("https://ya.ru/");
    }
}

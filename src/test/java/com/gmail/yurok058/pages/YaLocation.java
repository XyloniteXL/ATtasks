package com.gmail.yurok058.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YaLocation {
    public YaLocation(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;

    // YaLocationPage

    @FindBy (css = " input[class*='input']")
    private WebElement inputField;

    @FindBy (xpath = "//*[contains(@class,\"\")]/ul/li[1]")
    private  WebElement firstValueListLocation;

    public void changeLocation(String city){
        inputField.clear();
        inputField.sendKeys(city);

        firstValueListLocation.click();
    }

}

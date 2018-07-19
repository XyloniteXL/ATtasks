package com.gmail.yurok058.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PoiskResult {
    public PoiskResult(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;

    @FindBy (css = "a[accesskey*='1']")
    private WebElement prognozlink;

    public String getTxtPrognozLink(){
        String txtprognozlink = prognozlink.getText();
        return txtprognozlink;
    }
}

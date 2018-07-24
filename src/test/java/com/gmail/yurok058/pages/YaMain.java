package com.gmail.yurok058.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class YaMain {

    public YaMain(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;

    // YaPage
    /*
    span[class*='reg']

    a[class*='more']   ---кнопка ещё
    div[class*='home-tabs__more-item'] --выпад_список
     */
    List<String> linksMoreElements = new ArrayList<String>();

    @FindBy(css = "span[class*='geo']")
    private WebElement locLink;

    @FindBy(css = "a[class*='more']")
    private WebElement tabMore;

    @FindBy(css = "div[class*='home-tabs__more-item']")
    private List<WebElement> moreElements;


    public void clickLocLink(){
        locLink.click();
    }

    public List<String> getMoreElementsLinks(String city) {

        tabMore.click();
        System.out.println("Количество элементов в еще города " + city + " = " + moreElements.size());

        if (!linksMoreElements.isEmpty())
            linksMoreElements.clear();
        for(WebElement e : moreElements){
            linksMoreElements.add(e.getText());
        }
        return linksMoreElements;
    }

    public void goPage(){
        driver.get("https://yandex.ru/");
    }
}

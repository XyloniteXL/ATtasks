package com.gmail.yurok058.tests;

import com.gmail.yurok058.pages.YaMain;
import com.gmail.yurok058.pages.YaLocation;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FirstTest extends ManageDriver{
    public static YaMain yaMain;
    public static YaLocation yaLocation;

    final String LONDON = "Лондон";
    final String PARIS = "Париж";


    @Test
    public void SearchWeather(){
        List<String> moreListLinksL;
        List<String> moreListLinksP;

        yaMain = new YaMain(driver);
        yaLocation = new YaLocation(driver);

        yaMain.goPage();

        yaMain.clickLocLink();
        yaLocation.changeLocation(LONDON);
        moreListLinksL = yaMain.getMoreElementsLinks(LONDON);

        yaMain.clickLocLink();
        yaLocation.changeLocation(PARIS);
        moreListLinksP = yaMain.getMoreElementsLinks(PARIS);

        for (int i = 0; i < moreListLinksL.size(); i++) {
            Assert.assertEquals(moreListLinksL.get(i), moreListLinksP.get(i));

        }

    }
}

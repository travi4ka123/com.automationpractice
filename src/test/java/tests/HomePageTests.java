package tests;

import base.BaseTest;
import org.testng.annotations.Test;

import static constants.Constant.Urls.HOME_PAGE_URL;

public class HomePageTests extends BaseTest {
    @Test
    public void homePageMenuTest() {
        basePage.open(HOME_PAGE_URL);
        homePage
                .hoverOverWomenItem()
                .clickWomenItemAndCheckNewTitle()
                .hoverOverWomenItem()
                .clickWomenTopsItemAndCheckNewTitle()
                .hoverOverWomenItem()
                .clickWomenTshirtsItemAndCheckNewTitle()
                .hoverOverWomenItem()
                .clickWomenBlousesItemAndCheckNewTitle()
                .hoverOverWomenItem()
                .clickWomenDressesItemAndCheckNewTitle()
                .hoverOverWomenItem()
                .clickWomenCasualDressesItemAndCheckNewTitle()
                .hoverOverWomenItem()
                .clickWomenEveningDressesItemAndCheckNewTitle()
                .hoverOverWomenItem()
                .clickWomenSummerDressesItemAndCheckNewTitle()
                //Dresses
                .hoverOverDressesItem()
                .clickDressesItemAndCheckNewTitle()
                .hoverOverDressesItem()
                .clickDressesCasualDressesItemAndCheckNewTitle()
                .hoverOverDressesItem()
                .clickDressesEveningDressesItemAndCheckNewTitle()
                .hoverOverDressesItem()
                .clickDressesSummerDressesItemAndCheckNewTitle()
                //T-shirts
                .hoverOverTshirtsItem()
                .clickTshirtsItemAndCheckNewTitle();
    }
    @Test
    public void homePageSearchWithoutData(){
        basePage.open(HOME_PAGE_URL);
        homePage
                .clickSearchButton();
        searchPage
                .checkWeAreOnThePage()
                .emptyMessageIsShown();
    }

    @Test
    public void homePageSearchWithData(){
        basePage.open(HOME_PAGE_URL);
        homePage
                .sendTextToSearchField()
                .clickSearchButton();
        searchPage
                .checkWeAreOnThePage()
                .checkElementsMoreThanZero();
    }

}

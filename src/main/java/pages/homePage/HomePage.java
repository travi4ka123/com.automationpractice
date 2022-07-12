package pages.homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.basePage.BasePage;
import pages.catalog.blousesPage.BlousesPage;
import pages.catalog.casualDressesPage.CasualDressesPage;
import pages.catalog.dressesPage.DressesPage;
import pages.catalog.eveningDressesPage.EveningDressesPage;
import pages.catalog.summerDressesPage.SummerDressesPage;
import pages.catalog.topsPage.TopsPage;
import pages.catalog.tshirtsPage.TshirtsPage;
import pages.catalog.womenPage.WomenPage;
import pages.searchPage.SearchPage;

import java.time.Duration;

import static constants.Constant.Timeouts.explicitWait;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By womenItem = By.xpath("//a[text()='Women']");
    By womenTopsItem = By.xpath("//a[text()='Tops'][@title='Tops']");
    By womenTshirtsItem = By.xpath("//a[@title='Women']/..//a[@title='T-shirts']");
    By womenBlousesItem = By.xpath("//a[@title='Women']/..//a[@title='Blouses']");
    By womenDressesItem = By.xpath("//a[@title='Women']/..//a[@title='Dresses']");
    By womenCasualDressesItem = By.xpath("//a[@title='Women']/..//a[@title='Casual Dresses']");
    By womenEveningDressesItem = By.xpath("//a[@title='Women']/..//a[@title='Evening Dresses']");
    By womenSummerDressesItem = By.xpath("//a[@title='Women']/..//a[@title='Summer Dresses']");
    By dressesItem = By.xpath("//*[@id='block_top_menu']/ul/li[2]/a");
    By dressesCasualDressesItem = By.xpath("//*[@id='block_top_menu']/ul/li[2]//a[@title='Casual Dresses']");
    By dressesEveningDressesItem = By.xpath("//*[@id='block_top_menu']/ul/li[2]//a[@title='Evening Dresses']");
    By dressesSummerDressesItem = By.xpath("//*[@id='block_top_menu']/ul/li[2]//a[@title='Summer Dresses']");
    By tshirtsItem = By.xpath("//*[@id='block_top_menu']/ul/li[3]/a");

    By searchButton = By.xpath("//button[@name='submit_search']");
    By searchInputField = By.xpath("//*[@placeholder='Search']");

    public HomePage sendTextToSearchField(){
        findElement(searchInputField).sendKeys("dress");
        return this;
    }
    public HomePage clickSearchButton(){
        clickElement(searchButton);
        return this;
    }
    public HomePage hoverOverWomenItem(){
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(womenItem)).build().perform();
        return this;
    }
    public HomePage hoverOverTshirtsItem(){
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(tshirtsItem)).build().perform();
        return this;
    }
    public HomePage clickTshirtsItemAndCheckNewTitle(){
        clickElement(tshirtsItem);
        waitExpectedTitle(TshirtsPage.title);
        return this;
    }
    public HomePage hoverOverDressesItem(){
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(dressesItem)).build().perform();
        return this;
    }
    public HomePage clickDressesItemAndCheckNewTitle(){
        clickElement(dressesItem);
        waitExpectedTitle(DressesPage.title);
        return this;
    }
    public HomePage clickDressesCasualDressesItemAndCheckNewTitle(){
        clickElement(dressesCasualDressesItem);
        waitExpectedTitle(CasualDressesPage.title);
        return this;
    }
    public HomePage clickDressesEveningDressesItemAndCheckNewTitle(){
        clickElement(dressesEveningDressesItem);
        waitExpectedTitle(EveningDressesPage.title);
        return this;
    }
    public HomePage clickDressesSummerDressesItemAndCheckNewTitle(){
        clickElement(dressesSummerDressesItem);
        waitExpectedTitle(SummerDressesPage.title);
        return this;
    }
    public HomePage clickWomenItemAndCheckNewTitle(){
        clickElement(womenItem);
        waitExpectedTitle(WomenPage.title);
        return this;
    }
    public HomePage clickWomenTopsItemAndCheckNewTitle(){
        clickElement(womenTopsItem);
        waitExpectedTitle(TopsPage.title);
        return this;
    }
    public HomePage clickWomenTshirtsItemAndCheckNewTitle(){
        clickElement(womenTshirtsItem);
        waitExpectedTitle(TshirtsPage.title);
        return this;
    }
    public HomePage clickWomenBlousesItemAndCheckNewTitle(){
        clickElement(womenBlousesItem);
        waitExpectedTitle(BlousesPage.title);
        return this;
    }
    public HomePage clickWomenDressesItemAndCheckNewTitle(){
        clickElement(womenDressesItem);
        waitExpectedTitle(DressesPage.title);
        return this;
    }
    public HomePage clickWomenCasualDressesItemAndCheckNewTitle(){
        clickElement(womenCasualDressesItem);
        waitExpectedTitle(CasualDressesPage.title);
        return this;
    }
    public HomePage clickWomenEveningDressesItemAndCheckNewTitle(){
        clickElement(womenEveningDressesItem);
        waitExpectedTitle(EveningDressesPage.title);
        return this;
    }
    public HomePage clickWomenSummerDressesItemAndCheckNewTitle(){
        clickElement(womenSummerDressesItem);
        waitExpectedTitle(SummerDressesPage.title);
        return this;
    }
}

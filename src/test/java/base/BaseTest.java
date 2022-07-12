package base;

import common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.basePage.BasePage;
import pages.homePage.HomePage;
import pages.searchPage.SearchPage;

import static common.Config.CLEAR_CACHE_COOKIES;
import static common.Config.CLOSE_BROWSER;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();

    protected BasePage basePage = new BasePage(driver);
    protected HomePage homePage = new HomePage(driver);
    protected SearchPage searchPage = new SearchPage(driver);



 //   @AfterTest
    public void clearCookieAndStorage() {
        if (CLEAR_CACHE_COOKIES) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear");
        }
    }

   // @AfterSuite(alwaysRun = true)
    public void close() {
        if (CLOSE_BROWSER) {
            driver.quit();
        }
    }
}

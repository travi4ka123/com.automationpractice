package pages.searchPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.basePage.BasePage;

import java.util.ServiceConfigurationError;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public static final String title = "Search - My Store";

    By emptyResult = By.xpath("//p[contains(text(),'Please enter a search keyword')]");
    By foundElementsList = By.xpath("//ul[contains(@class,'product_list')]/li");

    public SearchPage emptyMessageIsShown() {
        findElement(emptyResult);
        return this;
    }

    public SearchPage checkElementsMoreThanZero() {
        Assert.assertTrue(driver.findElements(foundElementsList).size() > 0);
        return this;
    }

    public SearchPage checkWeAreOnThePage() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitExpectedTitle(title);
        return this;
    }
}

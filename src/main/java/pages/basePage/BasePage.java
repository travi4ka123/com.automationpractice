package pages.basePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.Constant.Timeouts.explicitWait;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String url) {
        driver.get(url);
    }

    public void waitExpectedTitle(String expected){
        new WebDriverWait(driver, Duration.ofSeconds(explicitWait)).until(ExpectedConditions.titleIs(expected));
    }
    public WebElement findElement(By by){
        new WebDriverWait(driver,Duration.ofSeconds(explicitWait)).until(ExpectedConditions.visibilityOfElementLocated(by));
        return driver.findElement(by);
    }
    public void clickElement(By by){
        findElement(by).click();
    }
}

package ApplicationManager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelperBase {
    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd =wd;
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void type(By locator, String text) {
        click(locator);
        if (text != null) {
            wd.findElement(locator).clear();
            wd.findElement(locator).sendKeys(text);
        }
    }
    public boolean isElementPresent(By locator) {
        try {
            wd.findElement(locator);
            return true;
        } catch (NoSuchElementException ex) {

            return false;
        }
    }

        public  boolean isAlertPresent(WebDriver wd){
            try {
                wd.switchTo().alert();
                return true;
            } catch (NoAlertPresentException e) {
                return false;
            }
        }

    }

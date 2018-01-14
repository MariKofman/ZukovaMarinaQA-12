package ApplicationManager;

import model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    FirefoxDriver wd;

    public GroupHeleper groupHeleper;
    public NavigationHeleper navigationeHelper;
    public ContactHelper contactHelper;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
    public int getGroupCount() {
        return groupHeleper.getGroupCoutDeletion();
    }

    public void start() {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        openAddressbook();
        groupHeleper = new GroupHeleper(wd);
        navigationeHelper = new NavigationHeleper(wd);
        contactHelper = new ContactHelper(wd);

        groupHeleper.login("admin", "secret");
    }



    public void openAddressbook() {
        wd.get("http://localhost/addressbook/");
    }

    public void stop() {
        wd.quit();
    }



    public GroupHeleper getGroupHeleper() {
        return groupHeleper;
    }

    public NavigationHeleper getNavigationeHelper() {
        return navigationeHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}

package ApplicationManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.rmi.activation.ActivationGroup;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;

    public GroupHeleper groupHeleper;
    public NavigationHeleper navigationeHelper;
    public ContactHelper contactHelper;
    public SessionHeleper sessionHeleper;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }


    public void start() {
       // String browser = BrowserType.FIREFOX;(чтобы построить систему)
        if (browser.equals(BrowserType.FIREFOX)) {
            wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        } else if (browser.equals(BrowserType.CHROME)) {
            wd = new ChromeDriver();

        } else if (browser.equals(BrowserType.IE)) {
            wd = new InternetExplorerDriver();
        }


            wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            sessionHeleper = new SessionHeleper(wd);
            sessionHeleper.openAddressbook("http://localhost/addressbook/");
            groupHeleper = new GroupHeleper(wd);
            navigationeHelper = new NavigationHeleper(wd);
            contactHelper = new ContactHelper(wd);

            sessionHeleper.login("admin", "secret");
        }

        public void stop() {
            wd.quit();
        }


        public GroupHeleper getGroupHeleper () {
            return groupHeleper;
        }


        public ContactHelper getContactHelper () {
            return contactHelper;
        }
        public SessionHeleper getSessionHeleper () {
            return sessionHeleper;
        }
        public NavigationHeleper getNavigationeHelper() {
            return navigationeHelper;
        }


}

package ApplicationManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHeleper extends HelperBase {

        WebDriver wd;

        public NavigationHeleper(WebDriver wd) {
            super(wd);
        }
    public void  goToGroupsPage() {
        click(By.linkText("groups"));

    }
    }

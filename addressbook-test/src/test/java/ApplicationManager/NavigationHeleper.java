package ApplicationManager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHeleper extends HelperBase {

        FirefoxDriver wd;

        public NavigationHeleper(FirefoxDriver wd) {
            super(wd);
        }
    public void  goToGroupsPage() {
        click(By.linkText("groups"));

    }
    }

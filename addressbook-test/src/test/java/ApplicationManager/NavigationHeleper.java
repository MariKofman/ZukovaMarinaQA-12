package ApplicationManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHeleper extends HelperBase {

       // WebDriver wd;

        public NavigationHeleper(WebDriver wd) {
            super(wd);
        }
    public void  goToGroupsPage() {
        if(isElementPresent(By.tagName("h1"))&& wd.findElement(By.tagName("h1")).getText().equals("Groups")
                && isElementPresent(By.name("new"))){
            return;
        }
        click(By.xpath("//*[@href='group.php']"));
    }
    }

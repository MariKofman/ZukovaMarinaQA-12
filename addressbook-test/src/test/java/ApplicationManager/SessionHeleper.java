package ApplicationManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHeleper extends HelperBase{
    public SessionHeleper(WebDriver wd) {
        super(wd);
    }
    public void openAddressbook(String url) {
        wd.get(url);
    }
    public void login(String userName, String password) {
        type(By.name("user"), userName);
        type(By.name("pass"), password);
        click(By.xpath("//*[@value='Login']"));//кнопка enter
    }
}

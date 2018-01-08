package tests;

import model.ContactData;
import model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
    FirefoxDriver wd;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    @BeforeClass
    public void setUp() throws Exception {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        openAddressbook();
        login("admin", "secret");
    }

    public void returneToGroupsPage() {
        click(By.linkText("group page"));
    }

    public void submitGroupCreation() {
        click(By.name("submit"));

    }public void  goToGroupsPage() {
        click(By.linkText("groups"));

    }
    public void initGroupCreation() {
        click(By.linkText("groups"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

    private void fillGreoupForm(GroupData groupData) {
        fillGreoupForm(new GroupData("name", "header", "footer"));
    }

    public void login(String userName, String password) {
        type(By.name("user"), userName);
        type(By.name("pass"), password);
        click(By.xpath("//*[@value='Login']"));//кнопка enter
    }


    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void openAddressbook() {
        wd.get("http://localhost/addressbook/");
    }

    @AfterClass
    public void tearDown() {
        wd.quit();
    }
    public void fillContactForm() {
        fillContactForm(new ContactData("marina", "qwert", "marina", "hitec", "beersheva"));
    }


    public void fillContactForm(ContactData contactData) {
        type(By.name("marina"),contactData.getMarina());
        type(By.name("qwert"),contactData.getQwert());
        type(By.name("marina1"),contactData.getMarina1());
        type(By.name("hitec"),contactData.getHitec());
        type(By.name("beersheva"),contactData.getBeersheva());
    }

    public void confirmAlert() {
        wd.switchTo().alert().accept();
    }

    public void clickButtonDelete() {
        click(By.xpath("//*[@value='Delete']"));
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }
}

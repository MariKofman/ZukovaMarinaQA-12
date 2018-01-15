package ApplicationManager;

import model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper extends HelperBase {
    public ContactHelper(WebDriver wd) {
        super(wd);
    }
   // public void fillContactForm() {
       // fillContactForm(new ContactData("marina", "qwert", "marina", "hitec", "beersheva"));
   // }
    //public void initContactCreation() {
      //  click(By.xpath("//*[@href='edit.php']"));
    //}

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"),contactData.getName());
       type(By.name("lastname"),contactData.getLname());
        type(By.name("nickname"),contactData.getMiddlename());
        type(By.name("company"),contactData.getWork());
       type(By.name("address"),contactData.getAddress());
    }

    public void confirmAlert() {
        wd.switchTo().alert().accept();
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }
    public void clickButtonDelete() {
        click(By.xpath("//*[@value='Delete']"));
    }

    public int getContactCount() {
        return wd.findElements(By.xpath("//*[@title='Details']")).size();
    }
}



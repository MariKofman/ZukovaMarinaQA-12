import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class CreateContactTest extends TestBase {

    @Test
    public void CreateContactTest() {
        //openAddressbook
        openAddressbook();
        //login
        login();
        //goToContactPage
        wd.findElement(By.linkText("add new")).click();
        //fillContactForm
        fillContactForm("marina", "qwert", "marina", "hitec", "beersheva");
        //submitContactCreation
        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }


}

package tests;

import model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class CreateContactTest extends TestBase {



    @Test
    public void CreateContactTest() {

        int before = wd.findElements(By.name("//*[@src='icons/status_online.png']")).size();
        //goToContactPage
        wd.findElement(By.linkText("add new")).click();
        //fillContactForm
        fillContactForm(new ContactData("marina", "qwert", "marina", "hitec", "beersheva"));
        //submitContactCreation
        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
        int after =wd.findElements(By.name("//*[@src='icons/status_online.png']")).size();
        Assert.assertEquals(after, before+1);
    }


}

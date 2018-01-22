package tests;

import model.ContactData;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateContactTest extends TestBase {



    @Test(enabled = false)
    public void CreateContactTest() {

        int before = app.getContactHelper().getContactCount();
        app.getGroupHeleper().click(By.linkText("add new"));
        app.getContactHelper().fillContactForm(new ContactData("Name", "Lname", "Middlename", "Work", "Address"));
        app.getGroupHeleper().click(By.name("submit"));/*click(By.xpath("//div[@id='content']/form/input[21]"));*/
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before+1);
    }




}

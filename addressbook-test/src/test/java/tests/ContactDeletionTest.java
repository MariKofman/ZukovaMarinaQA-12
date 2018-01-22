package tests;

import model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase {



    @Test
    public void contactDeletionTest (){
        if (!app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("Name", "Lname", "Middlename", "Work", "Address"));
        }
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().selecContactByIndex(before-1);
        //app.getContactHelper().selectContact();
        app.getContactHelper().clickButtonDelete();
        //app.getContactHelper().confirmAlert();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before-1);
    }


}
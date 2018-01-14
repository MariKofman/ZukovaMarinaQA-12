package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase {



    @Test
    public void contactDeletionTest (){
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().selectContact();
        app.getContactHelper().clickButtonDelete();
        app.getContactHelper().confirmAlert();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before-1);
    }


}
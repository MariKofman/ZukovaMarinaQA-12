package tests;

import model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
@Test
    public void testContactModify(){
    if (!app.getContactHelper().isThereAContact()){
        app.getContactHelper().createContact(new ContactData("Name", "Lname", "Middlename", "Work", "Address"));
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().fillContactForm(new ContactData(null, "Lname", "Middlename", "Work", "Address"));
app.getContactHelper().confirmContactModification();

}
}

package tests;

import model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {


    @Test
    public void groupDeletionTest() {
        app.getNavigationeHelper().goToGroupsPage();
        if(!app.getGroupHeleper().isThereAGroup()){
            app.getGroupHeleper().createGroup(new GroupData("edit", null, "footer"));
        }int before = app.getGroupHeleper().getGroupCoutDeletion();
       app.getGroupHeleper().selectGroupyndex(before-1);
       // app.getGroupHeleper().selectGroup();
        app.getGroupHeleper().clickButtonDelete();
        app.getGroupHeleper().returneToGroupsPage();
        int after = app.getGroupHeleper(). getGroupCoutDeletion();
        Assert.assertEquals(after, before-1);


    }



}

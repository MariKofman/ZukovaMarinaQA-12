package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {


    @Test
    public void groupDeletionTest() {
        app.getNavigationeHelper().goToGroupsPage();
        int before = app.getGroupHeleper().getGroupCoutDeletion();
        app.getGroupHeleper().selectGroup();
        app.getGroupHeleper().clickButtonDelete();
        app.getGroupHeleper().returneToGroupsPage();
        int after = app.getGroupHeleper(). getGroupCoutDeletion();
        Assert.assertEquals(after, before-1);


    }



}

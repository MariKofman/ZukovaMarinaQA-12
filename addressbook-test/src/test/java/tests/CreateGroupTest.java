package tests;

import model.GroupData;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateGroupTest  extends TestBase{


    @Test
    public void CreateGroupTest() {
        app.getNavigationeHelper().goToGroupsPage();
        int before = app.getGroupHeleper().getGroupCount();
        app.getGroupHeleper().initGroupCreation();
        app.getGroupHeleper().fillGreoupForm(new GroupData("name", "header", "footer"));
        app.getGroupHeleper().submitGroupCreation();
        app.getGroupHeleper().returneToGroupsPage();
        int after = app.getGroupHeleper().getGroupCount();
        Assert.assertEquals(after, before+1);
    }




}

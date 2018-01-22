package tests;

import model.GroupData;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {
    @Test
    public void testGroupModify(){
        app.getNavigationeHelper().goToGroupsPage();
        if(!app.getGroupHeleper().isThereAGroup()){
            app.getGroupHeleper().createGroup(new GroupData("edit", null, "footer"));
        }
        app.getGroupHeleper().selectGroup();
        app.getGroupHeleper().initGroupModification();//это клик на кнопку Adit group
        app.getGroupHeleper().fillGreoupForm(new GroupData("name", null, "footer"));
        app.getGroupHeleper().confirmGroupModification();//то клик на кнопку Update();
        app.getGroupHeleper().returneToGroupsPage();
    }
}

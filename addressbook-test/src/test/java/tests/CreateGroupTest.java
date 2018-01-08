package tests;

import model.GroupData;
import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateGroupTest  extends TestBase{


    @Test
    public void CreateGroupTest() {
        goToGroupsPage ();
        int before = wd.findElements(By.name("selected[]")).size();
        initGroupCreation();
        fillGroupForm(new GroupData("name", "header", "footer"));
        submitGroupCreation();
        returneToGroupsPage();
        int after = wd.findElements(By.name("selected[]")).size();
        Assert.assertEquals(after, before+1);
    }



}

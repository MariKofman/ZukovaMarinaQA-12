package tests;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {


    @Test
    public void groupDeletionTest() {
        goToGroupsPage();
        int before = wd.findElements(By.name("selected[]")).size();
        selectGroup();
        clickButtonDeleteGroup ();
        returneToGroupsPage();
        int after =wd.findElements(By.name("selected[]")).size();
        Assert.assertEquals(after, before-1);


    }

}

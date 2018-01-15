package ApplicationManager;

import model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupHeleper extends HelperBase {

    public GroupHeleper(WebDriver wd) {
        super(wd);
    }
    public int getGroupCount() {
        return getGroupCoutDeletion();
    }
    public void returneToGroupsPage() {
        click(By.linkText("group page"));
    }

    public void submitGroupCreation() {
        click(By.name("submit"));

    }

    public void initGroupCreation() {
        click(By.name("new"));
    }
    public void clickButtonDelete() {
        click(By.name("delete"));
    }
    public void fillGreoupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

    public int getGroupCoutDeletion() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

}

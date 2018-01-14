package ApplicationManager;

import model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupHeleper extends HelperBase {

    public GroupHeleper(FirefoxDriver wd) {
        super(wd);
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

    public void login(String userName, String password) {
        type(By.name("user"), userName);
        type(By.name("pass"), password);
        click(By.xpath("//*[@value='Login']"));//кнопка enter
    }



    public void selectGroup() {
        click(By.name("selected[]"));
    }

}

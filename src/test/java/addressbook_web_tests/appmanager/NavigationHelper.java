package addressbook_web_tests.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {

    private WebDriver wd;

    public NavigationHelper(WebDriver wd) {
        this.wd = wd;

    }

    public void gotoContactPage() {
        wd.findElement(By.linkText("add new")).click();
    }

    public void gotoGroupPage() {
        wd.findElement(By.linkText("groups")).click();
    }


}

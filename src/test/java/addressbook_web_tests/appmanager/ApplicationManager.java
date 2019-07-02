package addressbook_web_tests.appmanager;

import addressbook_web_tests.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    public WebDriver wd;

    private final GroupHelper groupHelper = new GroupHelper();

    public void init() {
      groupHelper.wd = new FirefoxDriver();
      groupHelper.wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      login("admin", "secret");

    }

    public void login (String username, String password) {
      groupHelper.wd.get("http://localhost/addressbook/");
      groupHelper.wd.findElement(By.name("user")).click();
      groupHelper.wd.findElement(By.name("user")).clear();
      groupHelper.wd.findElement(By.name("user")).sendKeys(username);
      groupHelper.wd.findElement(By.name("pass")).click();
      groupHelper.wd.findElement(By.name("pass")).clear();
      groupHelper.wd.findElement(By.name("pass")).sendKeys(password);
      groupHelper.wd.findElement(By.xpath("//input[@value='Login']")).click();
    }

    public void logout() {
      groupHelper.wd.findElement(By.linkText("Logout")).click();
    }

    public void gotoGroupPage() {
      groupHelper.wd.findElement(By.linkText("groups")).click();
    }

    public void stop() {
      groupHelper.wd.quit();
    }

    public boolean isElementPresent(By by) {
      try {
        groupHelper.wd.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

    public boolean isAlertPresent() {
      try {
        groupHelper.wd.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }

    public void returnToContactPage() {
      groupHelper.wd.findElement(By.linkText("home page")).click();
    }

    public void submitContactCreation() {
      groupHelper.wd.findElement(By.name("submit")).click();
    }

    public void fillContactForm(ContactData contactData) {
      groupHelper.wd.findElement(By.name("firstname")).click();
      groupHelper.wd.findElement(By.name("firstname")).clear();
      groupHelper.wd.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());
      groupHelper.wd.findElement(By.name("lastname")).click();
      groupHelper.wd.findElement(By.name("lastname")).clear();
      groupHelper.wd.findElement(By.name("lastname")).sendKeys(contactData.getLastname());
      groupHelper.wd.findElement(By.name("nickname")).click();
      groupHelper.wd.findElement(By.name("nickname")).clear();
      groupHelper.wd.findElement(By.name("nickname")).sendKeys(contactData.getNickname());
      groupHelper.wd.findElement(By.name("company")).click();
      groupHelper.wd.findElement(By.name("company")).clear();
      groupHelper.wd.findElement(By.name("company")).sendKeys(contactData.getCompany());
      groupHelper.wd.findElement(By.name("address")).click();
      groupHelper.wd.findElement(By.name("address")).clear();
      groupHelper.wd.findElement(By.name("address")).sendKeys(contactData.getAddress());
      groupHelper.wd.findElement(By.name("mobile")).click();
      groupHelper.wd.findElement(By.name("mobile")).clear();
      groupHelper.wd.findElement(By.name("mobile")).sendKeys(contactData.getMobile());
      groupHelper.wd.findElement(By.name("email")).click();
      groupHelper.wd.findElement(By.name("email")).click();
      groupHelper.wd.findElement(By.name("email")).clear();
      groupHelper.wd.findElement(By.name("email")).sendKeys(contactData.getEmail());
      groupHelper.wd.findElement(By.name("bday")).click();
      new Select(groupHelper.wd.findElement(By.name("bday"))).selectByVisibleText(contactData.getBdayDay());
      groupHelper.wd.findElement(By.xpath("//option[@value='7']")).click();
      groupHelper.wd.findElement(By.name("bmonth")).click();
      new Select(groupHelper.wd.findElement(By.name("bmonth"))).selectByVisibleText(contactData.getBdayMonth());
      groupHelper.wd.findElement(By.xpath("//option[@value='February']")).click();
      groupHelper.wd.findElement(By.name("byear")).click();
      groupHelper.wd.findElement(By.name("byear")).clear();
      groupHelper.wd.findElement(By.name("byear")).sendKeys(contactData.getBdayYear());
      groupHelper.wd.findElement(By.name("notes")).click();
      // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | name=notes | ]]
      groupHelper.wd.findElement(By.name("notes")).clear();
      groupHelper.wd.findElement(By.name("notes")).sendKeys(contactData.getNotes());
      groupHelper.wd.findElement(By.name("address2")).click();
      groupHelper.wd.findElement(By.name("address2")).clear();
      groupHelper.wd.findElement(By.name("address2")).sendKeys(contactData.getAddress2());
      groupHelper.wd.findElement(By.name("phone2")).click();
      groupHelper.wd.findElement(By.name("phone2")).clear();
      groupHelper.wd.findElement(By.name("phone2")).sendKeys(contactData.getPhone2());
    }

    public void gotoContactPage() {
      groupHelper.wd.findElement(By.linkText("add new")).click();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }
}

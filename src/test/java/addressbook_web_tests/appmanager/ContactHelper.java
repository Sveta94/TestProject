package addressbook_web_tests.appmanager;

import addressbook_web_tests.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase {


    public ContactHelper(WebDriver wd) {

        super(wd);
    }

    public void returnToContactPage() {

        click(By.linkText("home page"));

    }

    public void submitContactCreation() {

        click(By.name("submit"));

    }

    public void fillContactForm(ContactData contactData) {

        type(By.name("firstname"),contactData.getFirstname());
        type(By.name("lastname"),contactData.getLastname());
        type(By.name("nickname"),contactData.getNickname());
        type(By.name("email"),contactData.getEmail());
        type(By.name("address"),contactData.getAddress());
        click(By.name("bday"));
        select(By.name("bday"), contactData.getBdayDay());
        click(By.xpath("//option[@value='7']"));
        click(By.name("bmonth"));
        select(By.name("bmonth"), contactData.getBdayMonth());
        click(By.xpath("//option[@value='February']"));
        type(By.name("byear"),contactData.getBdayYear() );
        type(By.name("notes"),contactData.getNotes() );
        type(By.name("address2"), contactData.getAddress2());
        type(By.name("phone2"),contactData.getPhone2());
    }

}

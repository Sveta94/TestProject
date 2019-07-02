package addressbook_web_tests.tests;

import addressbook_web_tests.model.ContactData;
import org.junit.Test;

public class ContactCreationTest extends TestBase {


  @Test
  public void testContactCreation() throws Exception {

    app.getNavigationhelper().gotoContactPage();
    app.fillContactForm(new ContactData("Svetlana", "Avetisyan", "Sveta", "GGG", "Ulitsa Yunikh Lenintsev", "+7915000000000", "testemail@example.com", "7", "February", "1994", "test", "test", "test"));
    app.submitContactCreation();
    app.returnToContactPage();
    app.getSessionHelper().logout();
  }


}

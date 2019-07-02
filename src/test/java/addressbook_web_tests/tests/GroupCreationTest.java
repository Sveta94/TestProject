package addressbook_web_tests.tests;

import addressbook_web_tests.model.GroupData;
import org.junit.Test;
public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("Test", "test1", "test2"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
    app.logout();
  }


}

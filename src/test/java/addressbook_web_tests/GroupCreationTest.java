package addressbook_web_tests;

import org.junit.Test;
public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage("groups");
    initGroupCreation("new");
    fillGroupForm(new GroupData("Test", "test1", "test2"));
    submitGroupCreation("submit");
    returnToGroupPage("group page");
    logout("Logout");
  }


}

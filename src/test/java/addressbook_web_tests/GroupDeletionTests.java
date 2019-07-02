package addressbook_web_tests;

import org.junit.Test;
public class GroupDeletionTests extends TestBase {


  @Test
  public void testGroupDeletion() throws Exception {

    gotoGroupPage("groups");
    selectGroup();
    deleteSelectedGroup();
    returnToGroupPage("group page");
    logout("Logout");
  }


}

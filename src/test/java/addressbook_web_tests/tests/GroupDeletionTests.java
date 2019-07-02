package addressbook_web_tests.tests;

import org.junit.Test;
public class GroupDeletionTests extends TestBase {


  @Test
  public void testGroupDeletion() throws Exception {

    app.getNavigationhelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroup();
    app.getGroupHelper().returnToGroupPage();
    app.getSessionHelper().logout();
  }


}

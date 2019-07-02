package addressbook_web_tests.tests;

import addressbook_web_tests.appmanager.ApplicationManager;
import org.junit.After;
import org.junit.Before;


public class TestBase {

  protected final ApplicationManager app = new ApplicationManager();

  @Before
    public void setUp() throws Exception {
      app.init();
  }

  @After
  public void tearDown() throws Exception {
    app.stop();

  }


}

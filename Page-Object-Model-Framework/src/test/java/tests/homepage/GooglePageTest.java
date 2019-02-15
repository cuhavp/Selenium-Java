package tests.homepage;

import framework.core.BaseTest;
import org.testng.annotations.Test;
import pageobject.homepage.GooglePage;

public class GooglePageTest extends BaseTest {
  @Test
  public void homepageTests() {
    GooglePage googleHomepage = new GooglePage(getDriver());
  }
}

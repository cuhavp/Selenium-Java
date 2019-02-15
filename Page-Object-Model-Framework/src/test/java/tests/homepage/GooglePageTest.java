package tests.homepage;

import framework.core.BaseTest;
import org.testng.annotations.Test;
import pageobject.homepage.GoogleSearchPage;

public class GooglePageTest extends BaseTest {
  @Test
  public void homepageTests() {
    GoogleSearchPage googleHomepage = new GoogleSearchPage(getDriver());
    googleHomepage.search("Testingvn");
  }
}

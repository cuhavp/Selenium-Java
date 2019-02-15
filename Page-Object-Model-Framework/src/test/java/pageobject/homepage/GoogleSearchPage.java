package pageobject.homepage;

import framework.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage extends BasePage {
  public GoogleSearchPage(WebDriver driver) {
    super(driver);
    driver.get("https://google.com.vn");
  }

  public void search(String keywords) {
    waitForElementToAppear(By.name("q")).sendKeys(keywords + "\n");
  }
  
}

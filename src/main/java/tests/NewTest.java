package tests;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	public WebDriver driver;
	
  @Test
  public void openMyBlog() {
	assertTrue(driver != null);
  }
  
  @Test
  public void secondAssert() {
	assertFalse(1 == 12);
  }
  
  @BeforeClass
  public void beforeClass() {
	  //System.setProperty("webdriver.gecko.driver", "D:\\PErso\\Ausbildung\\Python\\geckodriver.exe");
      driver = new FirefoxDriver();
      driver.get("https://www.softwaretestingmaterial.com/");

  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
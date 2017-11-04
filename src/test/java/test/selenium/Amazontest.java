package test.selenium;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Amazontest {
  @Test
  public void f() {
	  
	  FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		
		System.out.println(driver.getTitle());


  }
}

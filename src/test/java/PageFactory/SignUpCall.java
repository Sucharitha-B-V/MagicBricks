package PageFactory;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignUpCall {
	@Test
	public void test() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","‪C:\\D Drive\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.magicbricks.com/bricks/User-Registration1");
		driver.manage().window().maximize(); 
		SignUpMethod su = new SignUpMethod(driver);
		su.radiobtn();
		su.username();
		su.email();
		su.password();
		su.countrycode();
		su.mobilenum();
		su.checkbx();
		su.signupbutton();
	}
}

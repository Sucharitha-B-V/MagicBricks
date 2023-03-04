package com.demo.MB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


public class SignUpStepDef {
	WebDriver driver;
	@Given("User is on SignUp Page")
	public void user_is_on_SignUp_Page() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","‪C:\\D Drive\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.magicbricks.com/bricks/User-Registration1");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@When("User selects radio button")
	public void user_selects_radio_button() throws InterruptedException {
		driver.findElement(By.id("ubiusertype1")).click();
		Thread.sleep(3000);
		
	}

	@When("User enters valid name, email, password, country code and mobile number")
	public void user_enters_valid_name_email_password_country_code_and_mobile_number() throws InterruptedException {
		WebElement uname = driver.findElement(By.xpath("//input[@id='ubifname']"));
		uname.sendKeys("Manasa");
		Thread.sleep(3000);
		WebElement uemail = driver.findElement(By.xpath("//input[@id='ubiemail']"));
		uemail.sendKeys("manasareddy8897@gmail.com");
		Thread.sleep(3000);
		WebElement pwd = driver.findElement(By.xpath("//input[@id='ubipass']"));
		pwd.sendKeys("Manasa@23");
		Thread.sleep(3000);
		WebElement cc = driver.findElement(By.xpath("//input[@id='isdCodeText']"));
		cc.click();
		Thread.sleep(3000);
		WebElement mobnum = driver.findElement(By.xpath("//input[@id='ubimobile1']"));
		mobnum.sendKeys("8897073798");
		Thread.sleep(3000);
	}

	@When("User selects the checkbox")
	public void user_selects_the_checkbox() throws InterruptedException {
		WebElement checkbx = driver.findElement(By.xpath("//*[@id=\"signUp\"]/div/div[10]/div/label"));
		checkbx.click();
	}

	@When("clicks on SignUp button")
	public void clicks_on_SignUp_button() {
		WebElement signupbtn = driver.findElement(By.xpath("//button[@class='mui-btn mui-btn--primary']"));
		signupbtn.click();
	}

	
	@SuppressWarnings("deprecation")
	@Then("User SignUp and navigate to the MagicBricks HomePage")
	public void user_SignUp_and_navigate_to_the_MagicBricks_HomePage() {
		 boolean displayed = driver.findElement(By.id("home_page_msg")).isDisplayed();
		 Assert.assertTrue(displayed);
		 
	}

	@When("User enters invalid email")
	public void user_enters_invalid_email() {
		WebElement uemail = driver.findElement(By.xpath("//input[@id='ubiemail']"));
		uemail.sendKeys("#$%^@gmail.com");
	}

	@When("User should see an error message")
	public void user_should_see_an_error_message() {
		driver.findElement(By.id("//span[@id='ubiemail.errors']")).isDisplayed();
	}

	@SuppressWarnings("deprecation")
	@Then("User should not be redirected to the MagicBricks HomePage")
	public void user_should_not_be_redirected_to_the_MagicBricks_HomePage() {
		boolean displayed = driver.findElement(By.id("home_page_msg")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	@When("User enters an email that is already in use")
	public void user_enters_an_email_that_is_already_in_use() {
		WebElement uemail = driver.findElement(By.xpath("//input[@id='ubiemail']"));
		uemail.sendKeys("venkateswarinandyala@gmail.com");
	}

	@When("User enter {int}@gmail.com as email")
	public void user_enter_gmail_com_as_email(Integer int1) {
		WebElement uemail = driver.findElement(By.xpath("//input[@id='ubiemail']"));
		uemail.sendKeys("123456@gmail.com");
	}

	@When("User enter {int} as password")
	public void user_enter_as_password(Integer int1) {
		WebElement pwd = driver.findElement(By.xpath("//input[@id='ubipass']"));
		pwd.sendKeys("123456");
	}

	@When("User enter abc,{int}@gmail.com as email")
	public void user_enter_abc_gmail_com_as_email(Integer int1) {
		WebElement uemail = driver.findElement(By.xpath("//input[@id='ubiemail']"));
		uemail.sendKeys("$12345@gmail.com");
	}

	@When("User enter abcdef as password")
	public void user_enter_abcdef_as_password() {
		WebElement pwd = driver.findElement(By.xpath("//input[@id='ubipass']"));
		pwd.sendKeys("abcdef");
	}

	@When("User enters invalid contact number")
	public void user_enters_invalid_contact_number() {
		WebElement mobnum = driver.findElement(By.xpath("//input[@id='ubimobile1']"));
		mobnum.sendKeys("1234567");
	}
}

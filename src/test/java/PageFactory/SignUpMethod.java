package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpMethod {
WebDriver driver = null;
	
	@FindBy(xpath="//input[@id='ubiusertype1']")    //buyer or owner radio button
	WebElement radiobtn1;
	
	//@FindBy(xpath="//input[@id='ubiusertype2']")   //Agent Radio button
	//WebElement radiobtn2;
	
	//@FindBy(xpath="//input[@id='ubiusertype3']")   //Builder Radio button
	//WebElement radiobtn3;
	
	@FindBy(xpath="//input[@id='ubifname']")       //To input user name
	WebElement uname;
	
	@FindBy(xpath="//input[@id='ubiemail']")        //To input user email
	WebElement uemail;
	
	@FindBy(xpath="//input[@id='ubipass']")         //To input user password
	WebElement pwd;
	
	@FindBy(xpath="//input[@id='isdCodeText']")     //To select country code
	WebElement countrycde;
	
	@FindBy(xpath="//input[@id='ubimobile1']")      //To select mobile number
	WebElement mobilenum;
	
	@FindBy(xpath="//input[@id='tc__checkbox']")      //To select check box
	WebElement checkbx;
	
	@FindBy(xpath="//input[@id='ubiAutoRegister']")    //To click on sign up button
	WebElement signupbtn;
	
	public SignUpMethod(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void radiobtn() throws InterruptedException
	{
		radiobtn1.click();
	}
	public void username()
	{
		uname.sendKeys("venkateswari");
	}
	public void email()
	{
		uemail.sendKeys("venkateswarinandyala@gmail.com");
	}
	public void password()
	{
		pwd.sendKeys("Venky$27");
	}
	public void countrycode()
	{
		countrycde.click();
	}
	public void mobilenum()
	{
		mobilenum.sendKeys("6305413731");
	}
	public void checkbx()
	{
		checkbx.click();
	}
	public void signupbutton()
	{
		signupbtn.click();
	}
}




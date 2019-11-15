package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import junit.framework.Assert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class titlestepdefinition {

	public String basurl = "https://demo.opencart.com/";
	WebDriver driver=new ChromeDriver();
	
@Given("^user in Open cart homepage$")
public void user_in_Open_cart_homepage(){
	// System.setProperty("Webdriver.chrome.driver","D://Jess//Divers//chromedriver_win32//chromedriver.exe");
    driver.get(basurl);
	driver.manage().window().maximize();	
}

@When("^user verify the homepage title$")
public void verify_title(){
	String Actual_Title=driver.getTitle();
	String Expected_Title="Your Store";
	Assert.assertEquals(Actual_Title, Expected_Title);
}
@Then("^customer waits for 5 seconds$")
public void customer_wait() throws InterruptedException{
	Thread.sleep(5000);	
}
@When("^user click on Login menu from My account section$")
public void click_on_login(){
	WebElement My_Account= driver.findElement(By.xpath("//span[contains(text(),'My Account')]"));
	My_Account.click();
	WebElement Login = driver.findElement(By.xpath("(//a[contains(text(),'Login')])[1]"));
	Login.click();
}
@Then("^user verifies the login page$")
public void login_page() throws InterruptedException{
	// EmailID Field
		WebElement EmailId_Field= driver.findElement(By.xpath("//label[contains(text(),'E-Mail Address')]"));
		String Actual_Value= EmailId_Field.getText();
		String Expected_EmailID_Value = "E-Mail Address";
		Assert.assertEquals(Actual_Value, Expected_EmailID_Value);
		// Password Field
		WebElement Password_Field= driver.findElement(By.xpath("//label[contains(text(),'Password')]"));
		String Actual_PassValue= Password_Field.getText();
		String Expected_pswd_PlaceValue = "Password";
		Assert.assertEquals(Actual_PassValue, Expected_pswd_PlaceValue);
		// Login Button
		Thread.sleep(1000);
		WebElement ForgotPass = driver.findElement(By.xpath("(//a[contains(text(),'Forgotten Password')])[1]"));
		String ForgotPass_value = ForgotPass.getText();
		String ExptdBtn_value = "Forgotten Password";
		Assert.assertEquals(ExptdBtn_value, ForgotPass_value);
}
@And("^user close the browser$")
public void close_browser(){
	driver.quit();
}
} 

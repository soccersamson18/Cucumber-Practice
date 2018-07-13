package XrayCucumber.stepsFile;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorProject {

	
	
WebDriver driver;
	
	/*
	 * Testing Credentials
	 * username: autotestudemy@mail.com
	 * password: Password321!
	 */
	
	@Before 
	public void setupChrome()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/wlayton/eclipse-workspace/XrayCucumber/src/test/java/resources/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
	}

	
	@After
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		driver.quit();
		driver = null;
	}

	
	@Given("^User navigates to stackoverflow website$")
	public void user_navigates_to_stackoverflow_website() throws Throwable 
	{
	    driver.get("https://stackoverflow.com");
	}

	@And("^User clicks on the login button on home page$")
	public void user_clicks_on_the_login_button_on_home_page() throws Throwable 
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Log In']")).click();
		  
	}

	@And("^User enter a valid username$")
	public void user_enter_a_valid_username() throws Throwable 
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("autotestudemy@mail.com");
		
	}

	@And("^User enters a valid password$")
	public void user_enters_a_valid_password() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("Password321!");
	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@id=\'submit-button\']")).click();
		
	}

	@Then("^User should be taken to the successful login page$")
	public void user_should_be_taken_to_the_successful_login_page() throws Throwable 
	{
		Thread.sleep(3000);
		WebElement validation = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[1]/div/a"));
		Assert.assertEquals(validation.isDisplayed(), true);
	}


}


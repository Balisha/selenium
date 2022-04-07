package Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class steps {
	WebDriver driver;
	public String URL= "https://demoapp.skillrary.com/login.php?type=login";

	@Given("I should open the browser and navigate to the loginpage of skillary")
	public void i_should_open_the_browser_and_navigate_to_the_loginpage_of_skillary() {
	    // Write code here that turns the phrase above into concrete actions
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);

	    
	}
	@When("Enter the username {string}")
	public void enter_the_username(String user) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email")).sendKeys(user);
		System.out.println(user);
		
		
	    
	}
	@When("Enter the password {string}")
	public void enter_the_password(String pwd) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys(pwd);
		System.out.println(pwd);
		
	}
	@When("Click the login button")
	public void click_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("last")).click();
	}
	@Then("I should see the username as {string}")
	public void i_should_see_the_username_as(String name) {
	    // Write code here that turns the phrase above into concrete actions
		String str1=  driver.getCurrentUrl();
		if(str1.equalsIgnoreCase("https://demoapp.skillrary.com/cart_view.php")) {

		String username = driver.findElement(By.xpath("//span[contains(text(),'Harry Den')]")).getText();
		Assert.assertEquals(username, name);
		}
		else
		{
			String admin = driver.findElement(By.xpath("//*[@class='pull-left info']/p")).getText();
			Assert.assertEquals(admin, name);
		}
		driver.close();
		
	    
	}
	
//	@Then("I should see the admin as {string}")
//	public void i_should_see_the_admin_as(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//		String admin = driver.findElement(By.xpath("//*[@class='pull-left info']/p")).getText();
//		Assert.assertEquals(admin, string);
//		driver.close();
//
//	}
	
	

	@Then("I should navigate to the page {string}")
	public void i_should_navigate_to_the_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String Register= driver.findElement(By.xpath("//*[@class='btnRegister']")).getAttribute("value");
		 Assert.assertEquals(Register, string);
		 driver.close();

	  
	}

}

//Name: Juhi Chaudhary
//Date: 13/08/2024

package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC5_multipleInput {
	WebDriver driver;
	@Given("user is on the login page for different user")
	public void user_is_on_the_login_page_for_different_user() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.className("ico-login")).click();	

		
	}
	
	@When("user enter {string} and {string}")
	public void user_enter_and(String username, String password) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		//Thread.sleep(50000);
		}
	
	@Then("user redirect to homepage")
	public void user_redirect_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		driver.quit();
	}


}

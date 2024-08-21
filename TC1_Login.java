//Name: Juhi Chaudhary
//Date: 13/08/2024

package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_Login {
	WebDriver driver;
	WebDriverWait wait;

	@Given("the user in the login page")
	public void the_user_in_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		wait=new WebDriverWait(driver,25);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		System.out.println("User is in the login page");
		
	}
	@When("the user enters valid details in login page")
	public void the_user_enters_valid_details_in_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement loginButton=wait.until(driver -> driver.findElement(By.className("ico-login")));
		loginButton.click();		
		System.out.println("User enters valid details")	;}
	
	
	@Then("user reaches to the HOME page")
	public void user_reaches_to_the_HOME_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User reaches home page");
		WebElement enterEmail=wait.until(driver -> driver.findElement(By.name("Email")));
		enterEmail.sendKeys("Twinkle27@gmail.com");
		WebElement enterPassword=wait.until(driver ->driver.findElement(By.id("Password")));
		enterPassword.sendKeys("test123");
		WebElement clickonlogin=wait.until(driver ->driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")));
		clickonlogin.click();
		driver.quit();
		
	}
	}
	
	

	


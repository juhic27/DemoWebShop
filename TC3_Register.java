//Name: Juhi Chaudhary
//Date: 13/08/2024

package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3_Register {
	WebDriver driver;
	WebDriverWait wait;
	@Given("the user is in the registration page")
	public void the_user_is_in_the_registration_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		wait=new WebDriverWait(driver,25);
		driver.manage().window().maximize();
		System.out.println("User is on registration page ");
		driver.get("https://demowebshop.tricentis.com");

	}
	@When("the user enters valid details in registration page")
	public void the_user_enters_valid_details_in_registration_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User enters valid details");
		WebElement clickRegister=wait.until(driver ->driver.findElement(By.linkText("Register")));
		clickRegister.click();
	}

	
	@Then("user registered")
	public void user_registered() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is on registered page ");
		WebElement selectGender=wait.until(driver ->driver.findElement(By.id("gender-female")));
		selectGender.click();
		WebElement Fname=wait.until(driver ->driver.findElement(By.id("FirstName")));
		Fname.sendKeys("tester");
		WebElement Lname=wait.until(driver ->driver.findElement(By.id("LastName")));
		Lname.sendKeys("singh");
		WebElement email=wait.until(driver ->driver.findElement(By.id("Email")));
		email.sendKeys("Twinkle27@gmail.com");
		WebElement createPassword=wait.until(driver ->driver.findElement(By.id("Password")));
		createPassword.sendKeys("test123");
		WebElement ConfirmPassword=wait.until(driver -> driver.findElement(By.id("ConfirmPassword")));
		ConfirmPassword.sendKeys("test123");
		WebElement Clickregister=wait.until(driver ->driver.findElement(By.id("register-button")));
		Clickregister.click();
		driver.quit();
	}

}

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

public class TC4_searchProduct {
	WebDriver driver;
	WebDriverWait wait;
	@Given("the user is in the search page")
	public void the_user_is_in_the_search_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		wait=new WebDriverWait(driver,55);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		System.out.println("the user is on the search page");
	}
	@When("the user enters product name")
	public void the_user_enters_product_name() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Enter the product name");
		WebElement searchpage=wait.until(driver ->driver.findElement(By.id("small-searchterms")));
		searchpage.sendKeys("Books");
		WebElement submit=wait.until(driver ->driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")));
		submit.click();
	
	}
	@Then("product showed")
	public void product_showed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Product shown");
		//Thread.sleep(5000);
		driver.quit();
	}

}

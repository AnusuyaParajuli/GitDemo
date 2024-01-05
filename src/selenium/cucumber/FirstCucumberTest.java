package selenium.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FirstCucumberTest {
	
	
	WebDriver driver =new ChromeDriver();
	
	@Given("I landed on Facebook")
	public void I_landed_on_Facebook() {
		
		//WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");			
	}

	@Given("^I input my username (.+) and password (.+)$")
	public void I_input_my_username_and_password(String username, String password) {
		//WebDriver driver =new ChromeDriver();
		driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);
		
	}
	
	@When("I clicked on submit button")
	public void I_clicked_on_submit_button() {
		
		driver.findElement(By.name("login")).click();			
	}
	
	@Then("I can see my name {string} on the screen")
	public void I_can_see_my_name_on_the_screen(String string) {
		
		String name = driver.findElement(By.xpath("//span[contains(text(),'Anusuya Parajuli')]")).getText();
		Assert.assertTrue(name.equalsIgnoreCase(string));
		
		
	}
		
}

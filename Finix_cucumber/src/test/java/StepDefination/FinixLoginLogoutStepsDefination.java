package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import PO.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FinixLoginLogoutStepsDefination {
	public WebDriver driver;
	public Login obj1; 
	
	@Given("Chrome browser") 
	public void chrome_browser() {
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		obj1 = new Login(driver);

	}

	@When("User opens URL {string}")
	public void user_open_url(String url) {
		driver.get(url);
	    
	}

	@When("User enters Email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String uname, String password) {
	    
		obj1.enterEmailAndPasswordAndClick(uname, password);
		
	}

	@When("Click on Login")
	public void click_on_login() {
		obj1.clickOnLogin();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) {
		obj1.checkHeader(title);
	}

	@When("User Click NewDemo")
	public void user_click_new_demo() {
	    obj1.clickDemoAdmin();
	}

	@When("user click on Log Out Link")
	public void user_click_on_log_out_link() {
	    obj1.clickLogOut();
	}
	
	@Then("Page Title should now be {string}")
	public void page_title_should_now_be(String title) {
		
	}
	@AfterMethod
	@Then("Close Browser")
	public void close_browser() {
	    driver.close();
	}

}

package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login {

	public WebDriver driver;
    public Login(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//input[@id='useremail']")
    @CacheLookup
    WebElement useremail_login;
    
    @FindBy(xpath = "//input[@id='password']")
    @CacheLookup
    WebElement password_login;
    
    @FindBy(xpath = "//button[@class='btn btn-primary btn-flat m-b-30 m-t-30']")
    @CacheLookup
    WebElement login_button;
    
    public void enterEmailAndPasswordAndClick(String str1, String str2) {
    	useremail_login.sendKeys(str1);
    	password_login.sendKeys(str2);
    }
    public void clickOnLogin() {
    	login_button.click();
    }
    
    @FindBy(xpath = "//div[@class=\"page-title\"]//h1")
    @CacheLookup
    WebElement DashboardHeader;
    
    public void checkHeader(String title) {
    	Assert.assertEquals(title,DashboardHeader.getText());
    }
    
    @FindBy(xpath = "//span[@class='user-avatar']")
    @CacheLookup
    WebElement DemoAdmin;
    
    public void clickDemoAdmin() {
    	try {
			Thread.sleep(1000);
			DemoAdmin.click();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    @FindBy(xpath = "//i[@class='ti-power-off']")
    @CacheLookup
    WebElement LogOutbtn;
    
    public void clickLogOut() {
    	LogOutbtn.click();
    }
    
    
}
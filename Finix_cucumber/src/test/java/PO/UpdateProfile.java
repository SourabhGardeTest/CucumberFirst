package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class UpdateProfile {
	public WebDriver driver;
	public UpdateProfile(WebDriver driver) {
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
	    
	    @FindBy(xpath = "(//ul/li/a/i[@class='ti-user'])[1]")
	    @CacheLookup
	    WebElement Profilebtn;
	    
	    public void clickProfile() {
	    	Profilebtn.click();
	    	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    @FindBy(xpath = "//a[@href='https://finix.pisystindia.com/admin/admins/editprofile']")
	    @CacheLookup
	    WebElement UpdateProfileBtn;
	    
	    public void clickUpdateProfile() {
	    	UpdateProfileBtn.click();
	    	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	  
	    @FindBy(xpath = "//input[@id='admin_name']")
	    @CacheLookup
	    WebElement NewAdminName;
	    
	    public void EnterNewName(String newName) {
	    	NewAdminName.clear();
	    	NewAdminName.sendKeys(newName);
	    	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	  
	    @FindBy(xpath = "//button[@type='submit']")
	    @CacheLookup
	    WebElement UpdateBtn;
	    
	    public void ClickUpdateBtn() {
	    	UpdateBtn.click();
	    	
	    	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    @FindBy(xpath = "((//tr)[1]/td)[2]")
	    @CacheLookup
	    WebElement NewName;
	    
	    public void CheckIfNameIsUpdated(String UpdatedName) {
	    	
	    	Assert.assertEquals(true, NewName.getText().equals(UpdatedName));
	    	
	    	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    @FindBy(xpath = "//li//span[@class='user-avatar']")
	    @CacheLookup
	    WebElement NewDemoAdmin;
	    
	    public void clickNewDemoAdmin() {
	    	try {
				Thread.sleep(1000);
				NewDemoAdmin.click();
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

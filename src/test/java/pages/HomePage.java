package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.lang.Thread;


public class HomePage {
	public WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
	}
	  @FindBy(how = How.ID, using = "user-name")
	  WebElement username;

	  @FindBy(how = How.ID, using = "password")
	  WebElement password;
	  
	  @FindBy(how = How.ID, using = "login-button")
	  WebElement login;	
	  
	  @FindBy(how = How.CLASS_NAME, using = "error-button")
	  WebElement Errorbtn;

	  
		  
	  public void setUsername(String string) {
		  username.sendKeys(string);
      }
	  
	  public void setPassword(String pass) {
		  password.sendKeys(pass);
      }

	  public void clickOnLoginButton() {
	        login.click();
	  }
	  
	  public boolean errorShows()
	  {
		 return Errorbtn.isDisplayed();
	 
	 }
	 

}
	  
	 
		  
	
	  




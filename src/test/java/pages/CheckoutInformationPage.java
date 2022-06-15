package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckoutInformationPage {
	
	 @FindBy(how = How.ID, using = "checkout_info_container")
	  WebElement checkoutContainer;  
	
	  @FindBy(how = How.ID, using = "first-name")
	  WebElement first_name;
	  
	  @FindBy(how = How.ID, using ="last-name")
	  WebElement last_name;
	  
	  @FindBy(how = How.ID, using = "postal-code")
	  WebElement postal_code;
	  
	  @FindBy(how = How.ID, using = "continue")
	  WebElement continue1;
	  
	  public WebElement checkoutLandingPage() {
	        return checkoutContainer;
	  	}

	  
	  public void setFirstname(String firstname) {
		  first_name.sendKeys(firstname);
	  	}
	  
	  public void setLastname(String lastname) {
		  last_name.sendKeys(lastname);
	  	}
	  
	  public void setpostalcode(String postalcode) {
		  postal_code.sendKeys(postalcode);
	  	}

	  public void clickOnContinue() {
	        continue1.click();
	  	}
	  
	  


}

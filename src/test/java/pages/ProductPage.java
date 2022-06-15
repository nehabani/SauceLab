package pages;

//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {

		
	  @FindBy(how=How.CLASS_NAME, using="peek") 
	  WebElement img;

	  @FindBy(how=How.CLASS_NAME, using="product_sort_container") 
	  WebElement filterDropdown;
	  
	  @FindBy(how = How.ID, using = "add-to-cart-sauce-labs-fleece-jacket")
	  WebElement item_1;
	  
	  @FindBy(how = How.ID, using = "add-to-cart-sauce-labs-backpack")
	  WebElement item_2;
	  
	  @FindBy(how = How.ID, using = "add-to-cart-sauce-labs-bolt-t-shirt")
	  WebElement item_3;
	  
	  @FindBy(how = How.CLASS_NAME, using = "shopping_cart_badge")
	  WebElement addCart;
	 
		  public WebElement  image() {
		        return img;
		  }
	  
	 	 public Select sortHighToLow() {
		  Select dropdown = new Select(filterDropdown);  
		  dropdown.selectByVisibleText("Price (high to low)");
		  return dropdown;

	     }

		  
		  public void clickOnItem1() {
		        item_1.click();
		        
		  }
		  
		  public void clickOnItem2() {
		        item_2.click();
		  }
		  
		  public void clickOnItem3() {
		        item_3.click();
		  }
		  
		  public void clickOnCart() {
		        addCart.click();
		        
		  }

}

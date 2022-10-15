package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart extends PageBase {

	public Cart(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "submit.add-to-cart")
	WebElement AddBtn;
	
	@FindBy(id = "nav-cart")
	WebElement cartPage;
	
	public void Add_to_Cart() {
		AddBtn.click();	
	}
	
	public void open_Cart_Page() {
		cartPage.click();
	}

}

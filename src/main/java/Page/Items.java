package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Items extends PageBase {

	public Items(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div/div/div[1]/span/a/div")
	WebElement ItemChoose;
	
	@FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div/div[1]/span/a/div/img")
	WebElement headphoneChoose;
	
	public void Select_Item() {
		ItemChoose.click();
	}
	
	public void select_headphone() {
		headphoneChoose.click();
	}

}

package Page;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement SearchField;
	
	@FindBy(className = "nav-search-submit nav-sprite")
	WebElement SearchSubmit;
	
	@FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[1]")
	WebElement TodayDeal;
	
	@FindBy(xpath = "//*[@id=\"nav-hamburger-menu\"]")
	WebElement filtrationOption;
	
	@FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[1]/li[7]/a")
	WebElement ElectronicOption;
	
	
	@FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[5]/li[9]/a")
	WebElement openHeadphone;
	
	@FindBy(className = "a-last")
	WebElement nextPage;
	
	
	public void SelectCategory(String SearchType) {
		SearchField.clear();
		SearchField.sendKeys(SearchType);
		SearchField.submit();
	}
	
	public void open_Today_Deal() {
		TodayDeal.click();
	}
	
	public void filter_By_headphone() {
		filtrationOption.click();
	}
	
	public void open_electronic_option() {
		ElectronicOption.click();	
	}
	
	public void open_headphone_option() {
		openHeadphone.click();
	}
	
	public void next_page() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		for(int i =0 ; i<=4 ; i++) {
			JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,3000)", "");
			
			nextPage.click();
		}
		
	}
}

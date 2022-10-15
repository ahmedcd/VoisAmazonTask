package Senario1_Test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Page.HomePage;
import Page.Items;

public class SelectItemTest extends TestBase {
	
	HomePage homePage;
	Items items ;
	
	@Test
	public void Choose_Item() {
		homePage = new HomePage(driver);
		homePage.SelectCategory("car accessories");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		
		items = new Items(driver);
		items.Select_Item();
	}

}

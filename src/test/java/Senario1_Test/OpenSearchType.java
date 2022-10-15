package Senario1_Test;

import org.testng.annotations.Test;
import Page.HomePage;

public class OpenSearchType extends TestBase {
	
	HomePage homepage;
	
	@Test(enabled = false)
	public void select_Item_Type() {
		homepage = new HomePage(driver);
		homepage.SelectCategory("car accessories");
	}
	
	@Test(enabled = true)
	public void open_today_Deals() {
		homepage = new HomePage(driver);
		homepage.open_Today_Deal();
	}

	
}

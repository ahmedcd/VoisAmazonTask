package Senario2_Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Page.Cart;
import Page.HomePage;
import Page.Items;
import Senario1_Test.TestBase;

public class OpenToDayTest extends TestBase{

	HomePage homepage ;
	Items item;
	Cart cart ;
	
	@Test
	public void open_today_Deals() {
		
		homepage = new HomePage(driver);
		homepage.open_Today_Deal();
		
		homepage.filter_By_headphone();
		homepage.open_electronic_option();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		homepage.open_headphone_option();

		homepage.next_page();
		
		item = new Items(driver);
		item.select_headphone();
		
		cart = new Cart(driver);
		cart.Add_to_Cart();
		
		WebElement Result = driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/span"));
		String massage = Result.getText();
		Assert.assertEquals(massage,"Added to Cart");
		System.out.println(massage);
		
		cart.open_Cart_Page();
		
		WebElement Result2= driver.findElement(By.xpath("//*[@id=\"sc-active-cart\"]/div/div/div"));
		String massage2 = Result2.getText();
		Assert.assertEquals(massage2,"Shopping Cart");
		System.out.println(massage2);
		
	}

}

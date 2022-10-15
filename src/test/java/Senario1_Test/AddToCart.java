package Senario1_Test;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Page.Cart;
import Page.HomePage;
import Page.Items;

public class AddToCart extends TestBase {
	
	HomePage homePage;
	Items items ;
	Cart cart;
	
	@Test
	private void Choose_Item() {
		
		homePage = new HomePage(driver);
		homePage.SelectCategory("car accessories");
		
		//JavascriptExecutor js= (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1500)", "");
				
		items = new Items(driver);
		items.Select_Item();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
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

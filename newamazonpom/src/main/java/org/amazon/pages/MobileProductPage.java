package org.amazon.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import ProjectSpecificMethod.baseclass;

public class MobileProductPage extends baseclass {
	public MobileProductPage getdeliveryDate()
	{
		Set<String> allWindowSet=driver.getWindowHandles();
		List<String> windowsList=new ArrayList<String>();
		windowsList.addAll(allWindowSet);
		windowsList.get(1);
		driver.switchTo().window(windowsList.get(1));
		String title = driver.getTitle();
		System.out.println("Title is"+ title);
		
		String Deliverydate =driver.findElementByXPath("(//span[@class='a-text-bold'])[4]").getText();
		System.out.println("Delivery date is	"+Deliverydate);
		return this;
	}
	public AddtoCartPage clickAddtoCart()
	{
		driver.findElementByXPath("//input[@value='Add to Cart']").click();
		
		
		return new AddtoCartPage();
	}
}

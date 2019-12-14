package org.amazon.pages;

import ProjectSpecificMethod.baseclass;

public class Homepage extends baseclass {
	public Homepage search()
	{
	driver.findElementById("twotabsearchtextbox").sendKeys("Samsung Galaxy M30");
	driver.findElementByClassName("nav-input").click();
	String price = driver.findElementByClassName("a-price-whole").getText();
	System.out.println("Price of the first search result"+price);
	
	return this;
	}

	public MobileProductPage clickonimage()
	{
		driver.findElementByClassName("s-image").click();
		return new MobileProductPage();
	}
}

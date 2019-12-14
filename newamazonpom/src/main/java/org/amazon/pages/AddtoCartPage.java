package org.amazon.pages;

import ProjectSpecificMethod.baseclass;

public class AddtoCartPage extends baseclass {
	
	public AddtoCartPage addtoCart()
	{
		
		String CartMsg = driver.findElementByXPath("//h1[@class='a-size-medium a-text-bold']").getText();
		System.out.println("Cart msg	"+CartMsg);
		return this;
}
	public loginPage clickProceedbutton()
	{
		driver.findElementByXPath("(//a[@class='a-button-text a-text-center'])[1]").click();
		return new loginPage();
	}
}

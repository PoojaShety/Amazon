package org.amazon.pages;

import ProjectSpecificMethod.baseclass;

public class loginPage extends baseclass{
	public loginPage login()
	{
		String SigninTitle = driver.getTitle();
		if(SigninTitle.contains("Amazon Sign In"))
		{
		System.out.println("Title confirmed:  "+SigninTitle);
		}else
		{
		System.out.println("Title is wrong");
		}
		
		driver.findElementById("continue").click();
		String errorMsg = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").getText();
		System.out.println("Error Message is:  "+errorMsg);
		return this;
	}

}

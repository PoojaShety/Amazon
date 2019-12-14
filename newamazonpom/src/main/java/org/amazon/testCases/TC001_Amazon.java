package org.amazon.testCases;

import org.amazon.pages.Homepage;
import org.testng.annotations.Test;

import ProjectSpecificMethod.baseclass;

public class TC001_Amazon extends baseclass{
	@Test
	public void amazon()
	{
		new Homepage()
		.search()
		.clickonimage()
		.getdeliveryDate()
		.clickAddtoCart()
		.addtoCart()
		.clickProceedbutton()
		.login();
	}

}

package com.selenium.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.selenium.action.GoogleSearchAction;
import com.selenium.utilities.BaseDriver;

public class GoogleSearchActionTest extends BaseDriver{

private GoogleSearchAction gsa;
	
	@Test
	public void testInput(){
		   gsa=PageFactory.initElements(driver, GoogleSearchAction.class);
		   try {
			gsa.open("http://www.google.com");
			gsa.typeAndSearchResult();		
		   } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
	}
}

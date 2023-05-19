package org.stepdefinition;

import org.baseutils.BaseClass;
import org.junit.AfterClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	
	
	@Before
	public void Launchbrowser()
	{
		try
		{
			BaseClass.loadProperties();
			if(BaseClass.driver==null)
			{
			BaseClass.browserLaunch();
			}
		}catch(Exception e)	
		{
			e.printStackTrace();
		}
	}
	
	@After
	public void closeBrowser()
	{
		
//				BaseClass.driver.quit();
		
	}
	

}

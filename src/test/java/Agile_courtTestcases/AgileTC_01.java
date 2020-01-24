package Agile_courtTestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Agile_courtpageobjects.LoginPage;

public class AgileTC_01 extends BaseClass {

	@Test
	public void loginTest()
	
	{ 
		setup();
		bdriver.get("url");
		log.info("application loaded");
		LoginPage lp=new LoginPage(bdriver);
		lp.username(username);
		lp.password(password);
		lp.log();
		log.info("Logined to application");
		if(bdriver.getTitle().equals("AgileCourt"))
				{
			Assert.assertTrue(true);
			log.info("Home page displayed ");
			
				}
		else 
		{
			Assert.assertFalse(false);
		}
		System.out.println(bdriver.getTitle());
		log.info("Title pf the page captured ");
	}
	
}

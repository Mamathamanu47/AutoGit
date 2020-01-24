package Agile_courtTestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Agile_courtpageobjects.LoginPage;

public class AgileTC_01 extends BaseClass {

	@Test
	public void loginTest()
	
	{ 
		System.out.print("test case01");
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
		System.out.println("adding one extra loine");
		log.info("Title pf the page captured ");
	} 
	
}

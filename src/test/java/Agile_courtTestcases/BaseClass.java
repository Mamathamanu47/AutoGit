package Agile_courtTestcases;

import java.util.concurrent.TimeUnit;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import Agile_courtUtiles.Readconfig;

public class BaseClass {
	
       public WebDriver bdriver;
	   public static Logger log;
	   Readconfig read=new Readconfig();
	   public String url=read.baseurl();
	   public String username=read.username();
	   public String password=read.password();

public void setup()
{
	System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver.exe");//forward slashes
	bdriver=new ChromeDriver();
	bdriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	log=Logger.getLogger("Agile_Cour");//to apply log message
	PropertyConfigurator.configure("Log4j.properties");
	
}

}
//@AfterClass
//public void teardown()
//{
//	bdriver.quit();
//}
//}
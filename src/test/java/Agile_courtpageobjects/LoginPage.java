package Agile_courtpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{   this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
   @FindBy(id="username")
   private  WebElement username;
   @FindBy(id="password")
   private WebElement password;
   @FindBy(id="loginSubmit")
   private WebElement login;
   

public void username(String un)
{
     username.sendKeys(un);
}
public void password(String pass)
{
	password.sendKeys(pass);
}
public void log()
{
  login.click();
}
}

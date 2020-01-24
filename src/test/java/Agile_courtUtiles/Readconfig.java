package Agile_courtUtiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readconfig {
	
	Properties pro;
	public void config() throws IOException
	{
     
     String src="C:\\Users\\Mamatha BN\\eclipse-workspace\\Agile_Cour\\Configuration\\Config.properties";

     FileInputStream fis=new FileInputStream(src);
     pro.load(fis);

}

public String baseurl()
{
	String burl= pro.getProperty("Url");
	System.out.println(burl);
	return burl;
}

public String username()
{
	String un=pro.getProperty("username");
	return un;
}
public String password()
{
	String pass=pro.getProperty("password");
	return pass;
	
}

public String chrompath()
{
	String chome=pro.getProperty("chromepath");
	return chome;
}
}



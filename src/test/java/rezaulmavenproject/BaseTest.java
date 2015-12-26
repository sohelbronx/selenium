package rezaulmavenproject;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest
{
   FirefoxDriver dr;
	
	@Before
	public void start()
	{
		dr=new FirefoxDriver();
		dr.get("http://www.facebook.com");
	}
	
	@After
	public void quit()
	{
		dr.quit();
	}
	
}

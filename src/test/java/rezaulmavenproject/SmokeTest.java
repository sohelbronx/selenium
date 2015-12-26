package rezaulmavenproject;

import org.junit.Test;
import org.openqa.selenium.By;


public class SmokeTest extends BaseTest
{
	@Test
	public void login()
	{
		dr.findElement(By.xpath(".//*[@id='u_0_x']")).click();
	}
}



package com.kerb.test.Scenarios;
import org.testng.annotations.Test;
import com.kerb.core.base.SupportTest;
import com.kerb.core.pages.HomePage;

public class HomePageTest extends SupportTest {
	@Test
	public void HomeTest() throws InterruptedException{
		HomePage hp=new HomePage(driver);
		hp.waitUntilSearchAppears();
		hp.findSpaceByUsingSearchOption();
		Thread.sleep(5000);
	}
	

}

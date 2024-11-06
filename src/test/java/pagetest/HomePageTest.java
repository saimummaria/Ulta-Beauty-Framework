package pagetest;

import org.testng.annotations.Test;

import baseutil.Baseclass;

public class HomePageTest extends Baseclass{
	
	@Test
	
	public void clicklogotest() throws InterruptedException {
		homepage.clicklogo();

}
}
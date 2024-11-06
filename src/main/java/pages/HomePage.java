package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// //html tag[@attributeName='attributeValue']//parent::html 
	//tag[@attributeName='attributeValue']
@FindBy(xpath = "//div[@class='PrimaryBar__logo__image']")
WebElement logo;
public void clicklogo() throws InterruptedException {
	Thread.sleep(3000);
	logo.click();
}
	


}

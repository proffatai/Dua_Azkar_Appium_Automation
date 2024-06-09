package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

//import baseClass.DA_baseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomeScreen   {
	private AndroidDriver driver;
	
	public HomeScreen(AndroidDriver driver) {
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id="com.ls.arabic:id/ch1_image")
	private WebElement duaAfterSolat;

	@AndroidFindBy(id="com.ls.arabic:id/ch2_image")
	private WebElement eveningAzkar;
	
	@AndroidFindBy(id="com.ls.arabic:id/ch3_image")
	private WebElement morningAzkar;
	
	@AndroidFindBy(id="com.ls.arabic:id/ch4_image")
	private WebElement dailyDuas;
	
	public void clickDuaAfterAzkar() throws InterruptedException {
		duaAfterSolat.click();
	}
	public void clickEveningAzkar() throws InterruptedException {
		eveningAzkar.click();
	}
	public void clickMorningAzkar() throws InterruptedException {
		morningAzkar.click();
	}
	public void clickDailyDuas() throws InterruptedException {
		dailyDuas.click();
	}

}

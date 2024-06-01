package Fatai;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppiumBasics {
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	@Test
	
	public void AppiumTest() throws MalformedURLException, InterruptedException
	{ 
		UiAutomator2Options options = new UiAutomator2Options();
		
		options.setApp("//Users//proffatai//Documents//Appium projects//AppiumProject//src//resources//dua-and-azkar.apk");
		options.setDeviceName("API DEMOS"); 
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		
		Thread.sleep(4000);
		
		driver.quit();
	}


}
 
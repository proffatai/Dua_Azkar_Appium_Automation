package baseClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class DA_baseClass {
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	@BeforeTest
	public void AppiumSetup() throws MalformedURLException, InterruptedException
	{ 
		
//		UiAutomator2Options options = new UiAutomator2Options();
//		options.setApp("//Users//proffatai//Documents//Appium projects//Dua_Azkar_Appium_Automation//src//resources//DA.apk");
//		options.setDeviceName("Pixel4"); 
		
		 //Alternative way of starting the app by setting all the app capabilites
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Pixel4");
        capabilities.setCapability("appPackage", "com.ls.arabic");
        capabilities.setCapability("appActivity", "com.ls.arabic.HomeActivity");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("noReset", true);
        capabilities.setCapability("appWaitDuration", 10000); // 30 seconds
		capabilities.setCapability("app", "//Users//proffatai//Documents//Appium projects//Dua_Azkar_Appium_Automation//src//resources//DA.apk");
		

		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),capabilities);
		acceptPermissions();
		
	}
	
	public void acceptPermissions() throws InterruptedException {
//		WaitForTwoSeconds();
		driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/continue_button")).click(); 
		WaitForTwoSeconds();
		driver.findElement(AppiumBy.id("android:id/button1")).click(); 

	}
	
	public void WaitForTwoSeconds() throws InterruptedException {
		Thread.sleep(5000);
	}
	
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
	
}
 
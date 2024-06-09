package testCases;

import org.testng.annotations.Test;

import baseClass.DA_baseClass;
import pageObject.HomeScreen;

public class accessingDifferentMenus extends DA_baseClass {
		
		@Test (priority=1)
		public void AccessingMenus() throws InterruptedException {
			HomeScreen HP = new HomeScreen(driver);
			HP.clickDuaAfterAzkar();
			WaitForTwoSeconds();
		}
	}

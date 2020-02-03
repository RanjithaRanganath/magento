package com.abc.testMain;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.testobject.Login;
import com.abc.testobject.MyAccount;
import com.abc.testobject.Welcome;

public class Main {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://magento.com/");
		
		Welcome w=new Welcome(driver);
		w.clickonMyAccount();
	    Login l=new Login(driver);
		l.enterEmail("ranjithagub@gmail.com");
        l.enterpassword("Welcome@1234");
		l.clickonlogin();
		MyAccount m=new MyAccount(driver);
		m.clickonlogout();
		driver.quit();
	}

}

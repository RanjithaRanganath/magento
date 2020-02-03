package com.abc.testobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	 By e=By.id("email");
	 By p=By.id("pass");
	 By lo=By.id("send2");
	 public Login(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	public void enterEmail(String em)
	 {
		 driver.findElement(e).sendKeys(em);
	 }
	 public void enterpassword(String pw)
	 {
		 driver.findElement(p).sendKeys(pw);
	 }
	 public void clickonlogin()
	 {
		 driver.findElement(lo).click();
	 }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import base_class.DriverSetup;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;

public class LoginPage{

	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public LoginPage(WebDriver driver) {
          this.driver = driver;
	}
	
	//Locator for username field
	By email = By.id("email");
	
	//Locator for password field
	By password = By.id("password");
	
	//Locator for login button
	By loginBtn = By.xpath("/html/body/div[2]/div/div/div/div/div/div/div/div/form/div[4]/div/button");
	
	
	//Method to enter username
	public void enterUsername(String user) {
		driver.findElement(email).sendKeys(user);
	}

	//Method to enter password
	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	//Method to click on Login button
	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}
}
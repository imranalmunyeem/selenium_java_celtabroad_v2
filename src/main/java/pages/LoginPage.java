package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

// This class will store all the locator and methods of login page

public class LoginPage {

	WebDriver driver;

	By username = By.id("email");
	By password = By.xpath("//*[@id=\"password\"]");
	By loginButton = By.xpath("/html/body/div[2]/div/div/div/div/div/div/div/div/form/div[4]/div/button");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void loginToWordpress(String userid, String pass) {

		driver.findElement(username).sendKeys("admin@admin.com");
		driver.findElement(password).sendKeys("admin123");
		driver.findElement(loginButton).click();

	}

	public void typeUserName11(String uid) {

		driver.findElement(username).sendKeys(uid);
	}

	public void typePassword1(String pass) {

		driver.findElement(password).sendKeys(pass);
	}

	public void clickOnLoginButton() {
		driver.findElement(loginButton).click();
	}

	public void clickLogin() {
		// TODO Auto-generated method stub
		
	}

	public void typeUserName(String uid) {
		// TODO Auto-generated method stub
		
	}

	public void typePassword(String pass) {
		// TODO Auto-generated method stub
		
	}

	public void typeUserName111(String uid) {
		// TODO Auto-generated method stub
		
	}

	public void typeUserName1(String uid) {
		// TODO Auto-generated method stub
		
	}
}

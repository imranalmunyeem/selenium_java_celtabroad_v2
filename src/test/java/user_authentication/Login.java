package user_authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base_class.DriverSetup;

public class Login extends DriverSetup {
	@Test
	public void TestLogin() throws InterruptedException {	
//		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		driver.get("https://www.celtabroad.com/admin/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//First test case for valid login
		//Finding the web elements and passing the values
		driver.findElement(By.id("email")).sendKeys("admin@admin.com");
		driver.findElement(By.id("password")).sendKeys("admin123");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div/div/form/div[4]/div/button")).click();
		
		Thread.sleep(5000);

		//Capture the page heading and print on console
		System.out.println("The page heading is --- " +driver.findElement(By.xpath("//div[@class=\"main-header\"]")).getText());
		
		//Logout from the session
		driver.findElement(By.id("submit")).click();
		
		
		//Second test case for invalid login credentials
		driver.findElement(By.id("email")).sendKeys("abdc");
		driver.findElement(By.id("password")).sendKeys("Password");
		driver.findElement(By.id("login")).click();
		
		String expectedURL = "https://www.celtabroad.com/admin/login";
		String actualURL = driver.getCurrentUrl();
		
		if(actualURL.equalsIgnoreCase(expectedURL))
			System.out.println("Test passed !!!!");
		else
			System.out.println("Test failed");
		
		//Closing browser session
		driver.quit();

	}
		
}
package user_authentication_backend;
import org.testng.annotations.Test;
import base_class.DriverSetup;
import pages.LoginPage;

public class VerifyLogin extends DriverSetup {

	@Test
	public void verifyValidLogin() {

		driver.get("https://www.celtabroad.com/admin/login");
		driver.manage().window().maximize();

		

		LoginPage login = new LoginPage(driver);

		login.clickOnLoginButton();

		driver.quit();

	}

}
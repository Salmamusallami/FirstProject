package MyTestCasessauceLab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MaintestCases {
	// standard_user 
	
	WebDriver driver = new ChromeDriver();
	String myWebsite = "https://www.saucedemo.com/";
	String userName="standard_user";
	String passwordInput = "secret_sauce";
	
	@BeforeTest
	
	public void MySetup() {
		
		driver.get(myWebsite);
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=1)
	
	public void Login() {
		WebElement userNameInput = driver.findElement(By.id(userName));
		WebElement passwordInput = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.id("login-button"));
		
		
		
		
		//driver.findElement(By.xpath("id=\"user-name\"")).sendKeys(userName);
		//driver.findElement(By.id("password")).sendKeys(passwordInput);
		//driver.findElement(By.id("login-button")).click();
	}
	
	
	@Test(priority = 2)

	public void AddToCartItem() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

	}

	@Test(priority = 3)

	public void RemoveItemFromThecart() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
	}

	//@AfterTest
	//public void PostTesting() {
		
//}
}


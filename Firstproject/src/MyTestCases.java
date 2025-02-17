import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases {

	WebDriver driver = new ChromeDriver();

	@BeforeTest

	public void mySetup() {

		driver.get("https://www.google.com");

		driver.manage().window().maximize();
	}

	@Test()

	public void myFirstTest() {

		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("abdulraheem alsaka" + Keys.ENTER);

		driver.findElement(By.xpath("//*[@id=\"ixcYae\"]/div/div/div[1]/div/div/span/a/h3/span")).click();
	}

	@AfterTest
	public void AfterTheTestIsDone() throws InterruptedException {

		Thread.sleep(5000);
		driver.quit();
	}
}
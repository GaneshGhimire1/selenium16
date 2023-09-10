package seleniumtutorials;

// wait
import org.openqa.selenium.By;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\sharm\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		

		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button btn_action")).click();
		driver.findElement(By.cssSelector(".bm-burger-button")).click();
	
	try {
		Thread.sleep(5000);
		
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	driver.findElement(By.cssSelector("#logout_sidebar_link"));
	driver.close();
	
	}

}

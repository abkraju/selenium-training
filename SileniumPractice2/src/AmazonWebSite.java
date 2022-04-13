import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;





public class AmazonWebSite {

//		String SearchProduct;
//		String Select;
//		public void Launch() {
//			//WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			driver.get("https://www.amazon.in/");
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//	}
		
		//driver.findElement(By.id("ap_email")).sendKeys("9092005345");
	
	
	
	
	

	
		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\WELCOME\\eclipse-workspace\\Silenium\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
	}

}

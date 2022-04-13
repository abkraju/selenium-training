import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Baseclass {
	public WebDriver driver;
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WELCOME\\eclipse-workspace\\Silenium\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void close() {
	driver.quit();
	}
}

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class Xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WELCOME\\eclipse-workspace\\Silenium\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(1000);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement name = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		// 1.Locating Elements with Known Attributes
		Highlight(driver, name);
		name.sendKeys("Admin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		// 2.Locating Elements with Known Element & Attributes
		Highlight(driver, password);
		password.sendKeys("admin123");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement Login = driver
				.findElement(By.xpath("//input[@class='button'][@type='submit'][@name='Submit'][@class='button']"));
		// 5.Locating Elements with Multiple Attributes
		Highlight(driver, Login);
		Login.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement text = driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']"));
		// 3.Locating Elements with known visible Text
		Highlight(driver, text);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement forgetpassword = driver.findElement(By.xpath("//*[@id='forgotPasswordLink']"));
		// 1.Locating Elements with Known Attributes
		Highlight(driver, forgetpassword);
		WebElement partialtext = driver.findElement(By.xpath("//a[contains(text(),'Orange')]"));
		// 4.Locating Elements when part of visible text
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.quit();

	}

	public static void Highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
				element);
	}
}

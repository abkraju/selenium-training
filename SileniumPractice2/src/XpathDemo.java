import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class XpathDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WELCOME\\eclipse-workspace\\Silenium\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		WebElement name = driver.findElement(By.xpath("//*[@id=\'txtUsername\"]"));
		Highlight(driver, name);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		WebElement password = driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
		Highlight(driver, password);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		WebElement Login = driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
		Highlight(driver, Login);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		
	}

	public static void Highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
				element);

	}

}

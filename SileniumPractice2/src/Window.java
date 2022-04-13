import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class Window {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WELCOME\\eclipse-workspace\\Silenium\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Window.html");
		String oldwindow = driver.getWindowHandle();
		WebElement firstButton = driver.findElement(By.id("home"));
		firstButton.click();
		java.util.Set<String> handles = driver.getWindowHandles();
		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
		}
		WebElement editbox = driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]/a/img"));
		editbox.click();
		driver.close();
		driver.switchTo().window(oldwindow);
		WebElement openMultiple = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
		openMultiple.click();
		int numberOfWindows = driver.getWindowHandles().size();
		System.out.println("No of Windows Opened: " + numberOfWindows);
		WebElement dontCloseMe = driver.findElement(By.id("color"));
		dontCloseMe.click();
		Thread.sleep(3000);
		java.util.Set<String> newWindowHandles = driver.getWindowHandles();
		for (String allWindows : newWindowHandles) {
			if (!allWindows.equals(oldwindow)) {
				driver.switchTo().window(allWindows);
				driver.close();
			}

		}

	}
}
    

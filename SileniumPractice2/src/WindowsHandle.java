import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowsHandle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlywait(10, TimeUnit.SECONDS);
	driver.get("https://letcode.in//windows");
	String windowHandle = driver.getWindowHandle();
	System.out.println("first Window:"+windowHandle);
	driver.findElement(By.id("home")).click();
	driver.getWindowHandles();

	}
}

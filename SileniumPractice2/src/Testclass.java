import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;;

public class Testclass extends Baseclass{
	
	@Test
	public void openPage() {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Assert.assertTrue(driver.getTitle().equals("Google"));
	}

	}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WELCOME\\eclipse-workspace\\Silenium\\Lib\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.youtube.com/");
driver.get("https://www.selenium.dev/downloads/");
	}

}

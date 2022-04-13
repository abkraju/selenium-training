	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	//import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	//import seleniumWeb.WebTester.MainClass;

	//import io.github.bonigarcia.wdm.WebDriverManager;

	public class Webdriver_University extends UniversityMainClass {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

//			WebDriverManager.chromedriver().setup();
//			WebDriver driver = new ChromeDriver();
//			driver.get("http://www.leafground.com/pages/Dropdown.html");
			OpenBrowser();

			WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
			Highlight(driver, dropdown1);
			Thread.sleep(SEC);
			Select indexselect = new Select(dropdown1);
			indexselect.selectByIndex(1);

			WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
			Highlight(driver, dropdown2);
			Thread.sleep(SEC);
			Select textselect = new Select(dropdown2);
			textselect.selectByVisibleText("Appium");

			WebElement dropdown3 = driver.findElement(By.name("dropdown3"));
			Highlight(driver, dropdown3);
			Thread.sleep(SEC);
			Select valueselect = new Select(dropdown3);
			valueselect.selectByValue("3");

			WebElement dropdown4 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/select"));
			Highlight(driver, dropdown4);
			Select optionselect = new Select(dropdown4);
			List<WebElement> list = optionselect.getOptions();
			int size = list.size();
			System.out.println(size);
			for (WebElement elements : list) {
				System.out.println(elements.getText());
				Thread.sleep(SEC);
				if (elements.getText().equalsIgnoreCase("Selenium")) {
					elements.click();
					break;
				}

				WebElement dropdown = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
				Highlight(driver, dropdown);
				dropdown.sendKeys("Loadrunner");
			}

			Thread.sleep(SEC);
			driver.quit();

		}

	}
	}

}

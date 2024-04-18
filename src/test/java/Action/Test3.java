package Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {
	@Test
	void browserLaunchTest() {
		
		 ChromeOptions option = new ChromeOptions();
		    option.addArguments("--remote-allow-origins=*");

		    WebDriverManager.chromedriver().setup();
		    WebDriver driver = new ChromeDriver(option);
		

	        driver.get("https://www.amazon.com/");
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
		
	}

}

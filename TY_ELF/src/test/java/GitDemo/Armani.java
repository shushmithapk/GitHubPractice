package GitDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Armani {

	@Test(invocationCount = 4,threadPoolSize = 2)
	public void armani() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.armani.com/en-in/armani-exchange/man/accessories/sunglasses");
}
}

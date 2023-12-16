package basepkg;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

public class NYbaebase {
public static WebDriver driver;
	
	@BeforeClass
	public void setUp() throws Exception
	{
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");
	    driver=new ChromeDriver(options);
		
		driver.get("https://www.nybaebeauty.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		Thread.sleep(10000);
		
		
	
		
		
	}



}

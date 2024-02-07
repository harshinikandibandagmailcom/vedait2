package BasePP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseCC {
	
    public static WebDriver driver;

public static void browserlaunch()
{
WebDriverManager.chromedriver().setup();
 driver= new ChromeDriver();
driver.get("https://www.facebook.com/");

}
public static void browser_close()

{
driver.close();
}
}

package Programs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseProgram {

	 public static WebDriver driver;
	 
	 public void openDriver()
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\eclipse-workspace\\PomPrograms\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
	 }
	 
	 public void openUrl(String url)
	 {
		 driver.get(url);
	 }
	 
	 public void scrollDown(WebElement element)
	 {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView(true)", element);
	 }
	 
	
}

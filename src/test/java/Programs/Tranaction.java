package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tranaction extends BaseProgram {

	public static void main(String[] args) {
		
		BaseProgram b = new BaseProgram();
		b.openDriver();
		b.openUrl("https://www.facebook.com/");
		WebElement scroll = driver.findElement(By.xpath("//a[@title='Visit our Help Centre.']"));
        b.scrollDown(scroll);		
	}
}

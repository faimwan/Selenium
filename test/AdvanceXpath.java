package Practice;
import Conf.Config;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class AdvanceXpath {

	public static void main(String[] args) {
		
		final String chromeDriver = "\\drivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + chromeDriver);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.w3schools.com");
		//driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//nav[@id='sidemenu']/a[text()='Learn W3.CSS']")).click();
		//driver.findElement(By.xpath("//nav[@id='sidemenu']/a[starts-with(text(),'Learn Boots')]")).click();
		//driver.findElement(By.xpath("//nav[@id='sidemenu']/a[contains(text(),'earn Boots')]")).click();
		//driver.findElement(By.xpath("//*[@id='main']/div[3]/div[1]/a[last()]")).click();
		//driver.findElement(By.xpath("//*[@id='main']/div[3]/div[1]/a[last()-1]")).click();
		//driver.findElement(By.xpath("//*[@id='main']/div[3]/div[1]/a[position()=1]")).click();
		driver.findElement(By.xpath("//*[@id='main']/div[3]/div[1]/a[position()=2]")).click();
//		driver.findElement(By.xpath("//a[@id='gb_70']")).click();
//		driver.findElement(By.xpath("//a[starts-with(@id,'gb_7')]")).click();
//		driver.findElement(By.xpath("//a[contains(@id,'b_7')]")).click();
		
	//		List<WebElement> list = driver.findElements(By.className("w3-btn"));
	//		System.out.println("There are: " + list.size() + " buttons");
	//				
	//		for(int i=0; i<list.size(); i++){
	//			//System.out.println(list.get(i).getText());
	//			if(list.get(i).getText().equals("JAVASCRIPT REFERENCE")){
	//				list.get(i).click();
	//				break;
	//			}
	//		}
		
	}
	
	System.out.println("End of file");

}

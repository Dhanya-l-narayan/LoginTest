package ui;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Flipkart {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\browserdrivers\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
			driver.findElement(By.id("nav-search-submit-button")).click();
			
			
			
			driver.findElement(By.linkText("realme narzo N55 (Prime Black, 6GB+128GB) 33W Segment Fastest Charging | Super High-res 64MP Primary AI Camera")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div/div/span/span/input")).submit();
			driver.findElement(By.xpath("")).click();
			

	}

}

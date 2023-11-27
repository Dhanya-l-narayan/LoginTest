package ui;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class LoginTest {
	/*public static String browser="chrome";
	public static WebDriver driver;


	//@SuppressWarnings("deprecation")*/
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		/*if(browser.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			
		}*/
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\browserdrivers\\chromedriver.exe");
	   //System.setProperty("webdriver.edge.driver", "E:\\browserdrivers\\msedgedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//WebDriver driver=new EdgeDriver();
		//driver.addArguments("--remote-allow-origins=*");
		driver.get("http://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		try {
		    
		    Thread.sleep(2000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		try {
		    
		    Thread.sleep(2000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	    driver.findElement(By.id("login-button")).click();
	    try {
	        
	        Thread.sleep(5000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
	    try {
	        
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    driver.findElement(By.id("continue-shopping")).click();
	    try {
	        
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[3]/div[2]/div[1]/a/div")).click();
	    try {
	       
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
	    try {
	        
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    driver.findElement(By.id("back-to-products")).click();
	    try {
	        
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	    try {
	        
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")).click();
	    try {
	        
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    driver.findElement(By.id("checkout")).click();
	    try {
	       
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    driver.findElement(By.id("first-name")).sendKeys("Dhanya");
	    try {
	        
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    driver.findElement(By.id("last-name")).sendKeys("L");
	    try {
	        
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    driver.findElement(By.id("postal-code")).sendKeys("573201");
	    try {
	        
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    driver.findElement(By.id("continue")).click();
	    try {
	        
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    driver.findElement(By.id("finish")).click();
	    try {
	        
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    driver.findElement(By.id("back-to-products")).click();
	    
	    
	    //driver.close();
	}	

	

}

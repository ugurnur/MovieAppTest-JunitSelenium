package com.Testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DeleteMovie {
	
	

	static WebDriver driver;
	
	@BeforeClass
	public static void beforeTest(){
		System.setProperty(
            "webdriver.chrome.driver",
            "/Users/un/Desktop/chromedriver");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


	@Test
	public void deleteMovie() {
		driver = new ChromeDriver();
        driver.get("http://localhost:8080/movie3/admin");
       
        
        WebElement elementDeleteBtn= driver.findElement(By.xpath("//*[@data-deletetitle='The Shawshank Redemption2']"));
        elementDeleteBtn.click();
        
        // conform the delete
        Alert alert = driver.switchTo().alert();
        alert.accept();	 
        List<WebElement> deleteLinks = driver.findElements(By.xpath("//*[text()='The Shawshank Redemption2']"));

        Assert.assertTrue(deleteLinks.isEmpty());
	}	

	
	
	@AfterClass 
	public static void BrowserClose() { 
//		driver.close();
//		driver.quit(); 
	} 
	
}

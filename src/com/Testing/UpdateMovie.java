package com.Testing;

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


public class UpdateMovie {
	
	

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
	public void Update_Title() {
		driver = new ChromeDriver();
        driver.get("http://localhost:8080/movie3/admin");
        
        String expectedResult = null;
        
        // update button
        WebElement updateButton = driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[3]/a"));
        updateButton.click();
        
        WebElement titleField = driver.findElement(By.id("title"));
        String titleText = titleField.getText();
        titleText += " Updated";
        titleField.sendKeys(titleText); 
        WebElement elementSbmtBtn= driver.findElement(By.className("smb_button"));
        elementSbmtBtn.click();

        updateButton = driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[3]/a"));
        updateButton.click();
        
        WebElement elementUpdated = driver.findElement(By.id("title"));
        String titleText2 = elementUpdated.getAttribute("value");
        
        String actualResult = titleText2;
        expectedResult = "Inception Updated";
        
        WebElement elementSbmtBtn2= driver.findElement(By.className("smb_button"));
        elementSbmtBtn2.click();
 
        Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Update_ImdbRate() {
		driver = new ChromeDriver();
        driver.get("http://localhost:8080/movie3/admin");
        
        String expectedResult = "9.9";
        String actualResult = null;
        
        // update button
        

        
        WebElement updateButton= driver.findElement(By.xpath("//*[@data-update='Inception']"));
        updateButton.click();
        
//        WebElement updateButton = driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[3]/a"));
//        updateButton.click();
        
        WebElement elementImdb = driver.findElement(By.id("imdb"));
        elementImdb.clear();
        elementImdb.sendKeys(expectedResult);

        WebElement elementSbmtBtn= driver.findElement(By.className("smb_button"));
        elementSbmtBtn.click();
        
        // Check if it is updated
//        updateButton = driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[3]/a"));
        
        updateButton= driver.findElement(By.xpath("//*[@data-update='Inception']"));
        updateButton.click();
        
        WebElement elementUpdated = driver.findElement(By.id("imdb"));
        String imdbUpdated = elementUpdated.getAttribute("value");
        
        actualResult = imdbUpdated;
        WebElement elementSbmtBtn2= driver.findElement(By.className("smb_button"));
        elementSbmtBtn2.click();
 
        Assert.assertEquals(expectedResult, actualResult);
	}
        
        

	
	
	@AfterClass 
	public static void BrowserClose() { 
//		driver.close();
//		driver.quit(); 
	} 
	
}

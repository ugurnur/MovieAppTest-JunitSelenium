package com.Testing;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SearchByTitle {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void beforeTest(){
		System.out.println("Running before test");
		System.setProperty(
            "webdriver.chrome.driver",
            "/Users/un/Desktop/chromedriver");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void TitleSearch_success () {
		driver = new ChromeDriver();
        driver.get("http://localhost:8080/movie3/home");
        driver.manage().window().maximize() ;
        
        WebElement elementSearchInput = driver.findElement(By.className("searchbar"));
        elementSearchInput.click();
        elementSearchInput.sendKeys("Irishman");
        
        WebElement elementSubmitBtn = driver.findElement(By.className("sndbutton"));
        elementSubmitBtn.click();
        

        String actualResult = driver.getTitle();
        String expectedResult = "Search Results"; 
        Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void TitleSearch_fail () {
        driver.get("http://localhost:8080/movie3/home");
        driver.manage().window().maximize() ;
        
        WebElement elementSearchInput = driver.findElement(By.className("searchbar"));
        elementSearchInput.click();
        elementSearchInput.sendKeys("");
        
        WebElement elementSubmitBtn = driver.findElement(By.className("sndbutton"));
        elementSubmitBtn.click();
        
        // get the text from html validation error message
        String validationMessage = elementSearchInput.getAttribute("validationMessage");

        String actualResult = validationMessage;
        		
        String expectedResult = "Please fill out this field."; 
        Assert.assertEquals(expectedResult, actualResult);
        driver.quit(); 
	}
	

	
	@AfterClass 
	public static void BrowserClose() { 
//		driver.close();
		driver.quit(); 
	} 
	
}

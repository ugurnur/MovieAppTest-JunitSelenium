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


public class AdvanceSearch {
	
// Cases
	// 1. all fields are empty
	// 2. Search result is ok, show movies
	// 3. Not found any movie
	

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
	public void AdvancedSearch_EmptyFields () {
        driver.get("http://localhost:8080/movie3/fe-advanced-search.jsp");
        
        WebElement elementId = driver.findElement(By.id("MovieId"));
        elementId.click();
        elementId.sendKeys("");
        
        WebElement elementTitle = driver.findElement(By.id("title"));
        elementTitle.click();
        elementTitle.sendKeys("");
        
        WebElement elementYear = driver.findElement(By.id("year"));
        elementYear.click();
        elementYear.sendKeys("");
        
        Select select = new Select(driver.findElement(By.id("genre")));
        select.selectByVisibleText("Select Genre");
        
        WebElement elementImdb = driver.findElement(By.id("imdb"));
        elementImdb.click();
        elementImdb.sendKeys("");
        
        WebElement elementCast = driver.findElement(By.id("cast"));
        elementCast.click();
        elementCast.sendKeys("");
        
        WebElement elementAwards = driver.findElement(By.id("awards"));
        elementAwards.click();
        elementAwards.sendKeys("");
        
        WebElement elementSbmtBtn= driver.findElement(By.className("smb_button"));
        elementSbmtBtn.click();
        
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        
        alert.accept();	
        
        String actualResult = alertMessage;
        String expectedResult = "you did not enter any information yet";
        
        Assert.assertEquals(expectedResult, actualResult);

	}

	
	@Test
	public void AdvancedSearch_MovieNotFound() {
		driver = new ChromeDriver();
        driver.get("http://localhost:8080/movie3/fe-advanced-search.jsp");
        
        WebElement elementId = driver.findElement(By.id("MovieId"));
        elementId.click();
        elementId.sendKeys("50");
        
        WebElement elementTitle = driver.findElement(By.id("title"));
        elementTitle.click();
        elementTitle.sendKeys("Irish");
        
        WebElement elementYear = driver.findElement(By.id("year"));
        elementYear.click();
        elementYear.sendKeys("2019");
        
        Select select = new Select(driver.findElement(By.id("genre")));
        select.selectByVisibleText("Action");
        
        WebElement elementImdb = driver.findElement(By.id("imdb"));
        elementImdb.click();
        elementImdb.sendKeys("8.3");
        
        WebElement elementCast = driver.findElement(By.id("cast"));
        elementCast.click();
        elementCast.sendKeys("Robert");
        
        WebElement elementAwards = driver.findElement(By.id("awards"));
        elementAwards.click();
        elementAwards.sendKeys("");
        
        WebElement elementSbmtBtn= driver.findElement(By.className("smb_button"));
        elementSbmtBtn.click();
        
        WebDriverWait wait = new WebDriverWait(driver, 10); 
        WebElement messageElement = 
        		wait.until( ExpectedConditions.presenceOfElementLocated(By.className("error")) );
        
        WebElement elementH2 = driver.findElement(By.className("error"));
        String actualResult = elementH2.getText();
        String expectedResult = "We could not find any movie related to your search inquiry!\n" + 
        		"Please search again";
        
        Assert.assertEquals(expectedResult, actualResult); 
	}
	
	@Test
	public void AdvancedSearch_MovieFound() {
		driver = new ChromeDriver();
        driver.get("http://localhost:8080/movie3/fe-advanced-search.jsp");
        
        WebElement elementId = driver.findElement(By.id("MovieId"));
        elementId.click();
        elementId.sendKeys("49");
        
        WebElement elementTitle = driver.findElement(By.id("title"));
        elementTitle.click();
        elementTitle.sendKeys("Iri");
        
        WebElement elementYear = driver.findElement(By.id("year"));
        elementYear.click();
        elementYear.sendKeys("2019");
        
        Select select = new Select(driver.findElement(By.id("genre")));
        select.selectByVisibleText("Action");
        
        WebElement elementImdb = driver.findElement(By.id("imdb"));
        elementImdb.click();
        elementImdb.sendKeys("8.3");
        
        WebElement elementCast = driver.findElement(By.id("cast"));
        elementCast.click();
        elementCast.sendKeys("Robert");
        
        WebElement elementAwards = driver.findElement(By.id("awards"));
        elementAwards.click();
        elementAwards.sendKeys("Atl");
        
        WebElement elementSbmtBtn= driver.findElement(By.className("smb_button"));
        elementSbmtBtn.click();
        
        WebDriverWait wait = new WebDriverWait(driver, 10); 
        WebElement messageElement = 
        		wait.until( ExpectedConditions.presenceOfElementLocated(By.className("list-title")) );
        
        WebElement movieTitle = driver.findElement(By.className("list-title"));
        String actualResult = movieTitle.getText();
        String expectedResult = "The Irishman";
        
        Assert.assertEquals(expectedResult, actualResult); 
	}
	
	
	@AfterClass 
	public static void BrowserClose() { 
//		driver.close();
		driver.quit(); 
	} 
	
}

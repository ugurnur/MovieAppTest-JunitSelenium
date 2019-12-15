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


public class AddMovie {
	
	

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
	public void AddMovie_allfieldsempty() {
		driver = new ChromeDriver();
        driver.get("http://localhost:8080/movie3/be-admin-addmovie.jsp");
        

        WebElement elementTitle = driver.findElement(By.id("title"));
        elementTitle.click();
        elementTitle.sendKeys("");
        
        WebElement elementYear = driver.findElement(By.id("year"));
        elementYear.click();
        elementYear.sendKeys("");
        
        Select select = new Select(driver.findElement(By.id("genre")));
        select.selectByVisibleText("Action");
        
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
        
        String validationMessage = elementTitle.getAttribute("validationMessage");
        String actualResult = validationMessage;
        String expectedResult = "Please fill out this field.";
        
        Assert.assertEquals(expectedResult, actualResult);
}
	
	@Test
	public void AddMovie_success() {
		driver = new ChromeDriver();
        driver.get("http://localhost:8080/movie3/be-admin-addmovie.jsp");
        

        WebElement elementTitle = driver.findElement(By.id("title"));
        elementTitle.click();
        elementTitle.sendKeys("The Shawshank Redemption");
        
        WebElement elementYear = driver.findElement(By.id("year"));
        elementYear.click();
        elementYear.sendKeys("1994");
        
        Select select = new Select(driver.findElement(By.id("genre")));
        select.selectByVisibleText("Drama");
        
        WebElement elementImdb = driver.findElement(By.id("imdb"));
        elementImdb.click(); 
        elementImdb.sendKeys("9.4");
        
        WebElement elementCast = driver.findElement(By.id("cast"));
        elementCast.click();
        elementCast.sendKeys("Tim Robbins, Morgan Freeman, Bob Gunton");
        
        WebElement elementAwards = driver.findElement(By.id("awards"));
        elementAwards.click();
        elementAwards.sendKeys("");
        
        WebElement elementPoster = driver.findElement(By.id("poster"));
        elementPoster.click();
        elementPoster.sendKeys("img/shawshank.jpg");
        
        WebElement elementSbmtBtn= driver.findElement(By.className("smb_button"));
        elementSbmtBtn.click();
        
        driver.get("http://localhost:8080/movie3/fe-advanced-search.jsp");
        

        WebElement elementTitle2 = driver.findElement(By.id("title"));
        elementTitle2.click();
        elementTitle2.sendKeys("The Shawshank Redemption");
        
        WebElement elementSbmtBtn2= driver.findElement(By.className("smb_button"));
        elementSbmtBtn2.click();
        
        
        
        WebElement elementTitle3 = driver.findElement(By.className("list-title"));

        String actualResult = elementTitle3.getText();
        String expectedResult = "The Shawshank Redemption";
        Assert.assertEquals(expectedResult, actualResult);
}

	
	
	@AfterClass 
	public static void BrowserClose() { 
//		driver.close();
		driver.quit(); 
	} 
	
}

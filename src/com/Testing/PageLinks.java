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


public class PageLinks {
	
	

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
	public void testLogo_goes_to_homepage() {
		driver = new ChromeDriver();
        driver.get("http://localhost:8080/movie3/Category?genre=Action");
       
        String expectedResult = "http://localhost:8080/movie3/home";
        String actualResult = null;
        
        WebElement elementLogo= driver.findElement(By.cssSelector("html body header#header.clearfix div.head-cont a.logo img.logo"));
        elementLogo.click(); 
        actualResult = driver.getCurrentUrl();
        
        Assert.assertEquals(expectedResult, actualResult);
	}	
	
	@Test
	public void ActionLink_goes_to_actionpage() {
		driver = new ChromeDriver();
        driver.get("http://localhost:8080/movie3/home");
       
        String expectedResult = "http://localhost:8080/movie3/Category?genre=Action";
        String actualResult = null;
        
        WebElement elementActionLink= driver.findElement(By.xpath("/html/body/header/div/div/nav/a[2]"));
        elementActionLink.click(); 
        actualResult = driver.getCurrentUrl();
        
        Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Action_page_list_movies() {
		driver = new ChromeDriver();
        driver.get("http://localhost:8080/movie3/home");
       
        String expectedResult = "Action Movies";
        String actualResult = null;
        
        WebElement elementActionLink= driver.findElement(By.xpath("/html/body/header/div/div/nav/a[2]"));
        elementActionLink.click(); 
        
        WebElement elementGenreTitle = driver.findElement(By.cssSelector("html body div.content_cont h2"));
        actualResult = elementGenreTitle.getText();
 
        Assert.assertEquals(expectedResult, actualResult);

	}
	
	@Test
	public void horror_page_no_movies() {
		driver = new ChromeDriver();
        driver.get("http://localhost:8080/movie3/home");
       
        String expectedResult = "Sorry, We could not find any movie!\n" + 
        		"Please select another genre from the top menu";
        String actualResult = null;
        
        WebElement elementActionLink= driver.findElement(By.xpath("/html/body/header/div/div/nav/a[8]"));
        elementActionLink.click(); 
        
        WebElement elementGenreTitle = driver.findElement(By.cssSelector("html body div.content_cont h2"));
        actualResult = elementGenreTitle.getText();
 
        Assert.assertEquals(expectedResult, actualResult);

	}


	@AfterClass 
	public static void BrowserClose() { 
//        driver.close();
		driver.quit(); 
	} 
	
}

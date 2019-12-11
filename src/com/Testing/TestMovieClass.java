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


public class TestMovieClass {
	

	@Test
	public void Set_Movie_Title () {

		String title="Cas";
		int year =1995;
		String genre="Action";
		float imdb_rate= (float) 6.5;
		String cast="Robert De Niro, Sharon Stone, Joe Pesci";
		String awards="MTV Movie";
		String trailerUrl="	https://www.youtube.com/watch?v=EJXDMwGWhoA";
		String imgUrl="https://m.media-amazon.com/images/M/MV5BMTcxOWYzNDYtYmM4YS00N2NkLTk0NTAtNjg1ODgwZjAxYzI3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SY1000_CR0,0,666,1000_AL_.jpg";
		
		String nTitle="Casino";
		String expectedResult="Casino";
		String actualResult="Casino";
		
		Movie myMovie = new Movie(title, year,genre, imdb_rate,cast, awards, trailerUrl,imgUrl);
		myMovie.setTitle(nTitle);
		actualResult = myMovie.getTitle();
		
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	
	
}

package com.Testing;


import org.junit.Assert;
import org.junit.Test;



public class TestMovieClass {

	@Test
	public void Set_Title () {

		String title="Cas";
		int year =1995;
		String genre="Action";
		double imdb_rate= 6.5;
		String cast="Robert De Niro, Sharon Stone, Joe Pesci";
		String awards="MTV Movie";
		String trailerUrl="	https://www.youtube.com/watch?v=EJXDMwGWhoA";
		String imgUrl="https://m.media-amazon.com/images/M/MV5BMTcxOWYzNDYtYmM4YS00N2NkLTk0NTAtNjg1ODgwZjAxYzI3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SY1000_CR0,0,666,1000_AL_.jpg";
		
		String newTitle="Casino";
		String expectedResult="Casino";
		String actualResult="Casino";
		
		Movie myMovie = new Movie(title, year,genre, imdb_rate,cast, awards, trailerUrl,imgUrl);
		myMovie.setTitle(newTitle);
		actualResult = myMovie.getTitle();
		
		Assert.assertEquals(expectedResult, actualResult);
	}	
	
	@Test
	public void Get_Title () {

		String title="Casino";
		int year =1995;
		String genre="Action";
		double imdb_rate= 6.5;
		String cast="Robert De Niro, Sharon Stone, Joe Pesci";
		String awards="MTV Movie";
		String trailerUrl="	https://www.youtube.com/watch?v=EJXDMwGWhoA";
		String imgUrl="https://m.media-amazon.com/images/M/MV5BMTcxOWYzNDYtYmM4YS00N2NkLTk0NTAtNjg1ODgwZjAxYzI3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SY1000_CR0,0,666,1000_AL_.jpg";
	
		Movie myMovie = new Movie(title, year,genre, imdb_rate,cast, awards, trailerUrl,imgUrl);
		String actualResult = myMovie.getTitle();
		
		String expectedResult="Casino";
		actualResult= myMovie.getTitle();
		
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Set_Year () {

		String title="Casino";
		int year =1995;
		String genre="Action";
		double imdb_rate=6.5;
		String cast="Robert De Niro, Sharon Stone, Joe Pesci";
		String awards="MTV Movie";
		String trailerUrl="	https://www.youtube.com/watch?v=EJXDMwGWhoA";
		String imgUrl="https://m.media-amazon.com/images/M/MV5BMTcxOWYzNDYtYmM4YS00N2NkLTk0NTAtNjg1ODgwZjAxYzI3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SY1000_CR0,0,666,1000_AL_.jpg";
	
		Movie myMovie = new Movie(title, year,genre, imdb_rate,cast, awards, trailerUrl,imgUrl);
		
		int expectedResult=2000;
		int newYear=2000;
		myMovie.setYear(newYear);
		int actualResult= myMovie.getYear();
		
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Get_Year () {

		String title="Casino";
		int year =1995;
		String genre="Action";
		double imdb_rate= 6.5;
		String cast="Robert De Niro, Sharon Stone, Joe Pesci";
		String awards="MTV Movie";
		String trailerUrl="	https://www.youtube.com/watch?v=EJXDMwGWhoA";
		String imgUrl="https://m.media-amazon.com/images/M/MV5BMTcxOWYzNDYtYmM4YS00N2NkLTk0NTAtNjg1ODgwZjAxYzI3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SY1000_CR0,0,666,1000_AL_.jpg";
	
		Movie myMovie = new Movie(title, year,genre, imdb_rate,cast, awards, trailerUrl,imgUrl);
		
		int expectedResult=1995;
		int actualResult= myMovie.getYear();
		
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Set_Genre () {
		String title="Cas";
		int year =1995;
		String genre="Action";
		double imdb_rate= 6.5;
		String cast="Robert De Niro, Sharon Stone, Joe Pesci";
		String awards="MTV Movie";
		String trailerUrl="	https://www.youtube.com/watch?v=EJXDMwGWhoA";
		String imgUrl="https://m.media-amazon.com/images/M/MV5BMTcxOWYzNDYtYmM4YS00N2NkLTk0NTAtNjg1ODgwZjAxYzI3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SY1000_CR0,0,666,1000_AL_.jpg";
		
		Movie myMovie = new Movie(title, year,genre, imdb_rate,cast, awards, trailerUrl,imgUrl);
		
		String newGenre="Drama";
		String expectedResult="Drama";
		myMovie.setGenre(newGenre);
		String actualResult = myMovie.getGenre();
		
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Get_Genre() {
		String title="Cas";
		int year =1995;
		String genre="Action";
		double imdb_rate= 6.5;
		String cast="Robert De Niro, Sharon Stone, Joe Pesci";
		String awards="MTV Movie";
		String trailerUrl="	https://www.youtube.com/watch?v=EJXDMwGWhoA";
		String imgUrl="https://m.media-amazon.com/images/M/MV5BMTcxOWYzNDYtYmM4YS00N2NkLTk0NTAtNjg1ODgwZjAxYzI3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SY1000_CR0,0,666,1000_AL_.jpg";
		
		Movie myMovie = new Movie(title, year,genre, imdb_rate,cast, awards, trailerUrl,imgUrl);
		
		String expectedResult="Action";
		String actualResult = myMovie.getGenre();
		
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Set_Imdb () {

		String title="Casino";
		int year =1995;
		String genre="Action";
		double imdb_rate=6.5;
		String cast="Robert De Niro, Sharon Stone, Joe Pesci";
		String awards="MTV Movie";
		String trailerUrl="	https://www.youtube.com/watch?v=EJXDMwGWhoA";
		String imgUrl="https://m.media-amazon.com/images/M/MV5BMTcxOWYzNDYtYmM4YS00N2NkLTk0NTAtNjg1ODgwZjAxYzI3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SY1000_CR0,0,666,1000_AL_.jpg";
	
		Movie myMovie = new Movie(title, year,genre, imdb_rate,cast, awards, trailerUrl,imgUrl);
		
		double actualResult;
		double expectedResult = 9.9;
		double newImdb = 9.9;
		myMovie.setImdb_rate(newImdb);
		actualResult = myMovie.getImdb_rate();
		
		Assert.assertEquals(expectedResult, actualResult, 0.0);
	}
	
	@Test
	public void Set_Cast () {
		String title="Casino";
		int year =1995;
		String genre="Action";
		double imdb_rate= 6.5;
		String cast="Sharon Stone, Joe Pesci";
		String awards="MTV Movie";
		String trailerUrl="	https://www.youtube.com/watch?v=EJXDMwGWhoA";
		String imgUrl="https://m.media-amazon.com/images/M/MV5BMTcxOWYzNDYtYmM4YS00N2NkLTk0NTAtNjg1ODgwZjAxYzI3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SY1000_CR0,0,666,1000_AL_.jpg";
		
		Movie myMovie = new Movie(title, year,genre, imdb_rate,cast, awards, trailerUrl,imgUrl);
		
		String newCast="Robert De Niro, Sharon Stone, Joe Pesci";
		String expectedResult="Robert De Niro, Sharon Stone, Joe Pesci";
		myMovie.setCast(newCast);
		String actualResult = myMovie.getCast();	
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Get_Cast() {
		String title="Casino";
		int year =1995;
		String genre="Action";
		double imdb_rate= 6.5;
		String cast="Robert De Niro, Sharon Stone, Joe Pesci";
		String awards="MTV Movie";
		String trailerUrl="	https://www.youtube.com/watch?v=EJXDMwGWhoA";
		String imgUrl="https://m.media-amazon.com/images/M/MV5BMTcxOWYzNDYtYmM4YS00N2NkLTk0NTAtNjg1ODgwZjAxYzI3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SY1000_CR0,0,666,1000_AL_.jpg";
		
		Movie myMovie = new Movie(title, year,genre, imdb_rate,cast, awards, trailerUrl,imgUrl);
		
		String expectedResult="Robert De Niro, Sharon Stone, Joe Pesci";
		String actualResult = myMovie.getCast();	
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Set_Awards() {
		String title="Casino";
		int year =1995;
		String genre="Action";
		double imdb_rate= 6.5;
		String cast="Sharon Stone, Joe Pesci";
		String awards="MTV Movie";
		String trailerUrl="	https://www.youtube.com/watch?v=EJXDMwGWhoA";
		String imgUrl="https://m.media-amazon.com/images/M/MV5BMTcxOWYzNDYtYmM4YS00N2NkLTk0NTAtNjg1ODgwZjAxYzI3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SY1000_CR0,0,666,1000_AL_.jpg";
		
		Movie myMovie = new Movie(title, year,genre, imdb_rate,cast, awards, trailerUrl,imgUrl);
		
		String newAwards="Academy";
		String expectedResult="Academy";
		myMovie.setAwards(newAwards);
		String actualResult = myMovie.getAwards();	
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Get_Awards() {
		String title="Casino";
		int year =1995;
		String genre="Action";
		double imdb_rate= 6.5;
		String cast="Sharon Stone, Joe Pesci";
		String awards="Academy";
		String trailerUrl="	https://www.youtube.com/watch?v=EJXDMwGWhoA";
		String imgUrl="https://m.media-amazon.com/images/M/MV5BMTcxOWYzNDYtYmM4YS00N2NkLTk0NTAtNjg1ODgwZjAxYzI3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SY1000_CR0,0,666,1000_AL_.jpg";
		
		Movie myMovie = new Movie(title, year,genre, imdb_rate,cast, awards, trailerUrl,imgUrl);
		
		String expectedResult="Academy";
		String actualResult = myMovie.getAwards();	
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Set_TrailerUrl() {
		String title="Casino";
		int year =1995;
		String genre="Action";
		double imdb_rate= 6.5;
		String cast="Sharon Stone, Joe Pesci";
		String awards="MTV Movie";
		String trailerUrl="https://www.youtube.com/watch?v=RS3aHkkfuEI";
		String imgUrl="https://m.media-amazon.com/images/M/MV5BMTcxOWYzNDYtYmM4YS00N2NkLTk0NTAtNjg1ODgwZjAxYzI3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SY1000_CR0,0,666,1000_AL_.jpg";
		
		Movie myMovie = new Movie(title, year,genre, imdb_rate,cast, awards, trailerUrl,imgUrl);
		
		String newTrailer="https://www.youtube.com/watch?v=EJXDMwGWhoA";
		String expectedResult="https://www.youtube.com/watch?v=EJXDMwGWhoA";
		myMovie.setTrailerUrl(newTrailer);
		String actualResult = myMovie.getTrailerUrl();	
		Assert.assertEquals(expectedResult, actualResult);
	}

	@Test
	public void Get_TrailerUrl() {
		String title="Casino";
		int year =1995;
		String genre="Action";
		double imdb_rate= 6.5;
		String cast="Sharon Stone, Joe Pesci";
		String awards="MTV Movie";
		String trailerUrl="https://www.youtube.com/watch?v=RS3aHkkfuEI";
		String imgUrl="https://m.media-amazon.com/images/M/MV5BMTcxOWYzNDYtYmM4YS00N2NkLTk0NTAtNjg1ODgwZjAxYzI3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SY1000_CR0,0,666,1000_AL_.jpg";
		
		Movie myMovie = new Movie(title, year,genre, imdb_rate,cast, awards, trailerUrl,imgUrl);
		
		String expectedResult="https://www.youtube.com/watch?v=RS3aHkkfuEI";
		String actualResult = myMovie.getTrailerUrl();	
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Set_ImgUrl() {
		String title="Casino";
		int year =1995;
		String genre="Action";
		double imdb_rate= 6.5;
		String cast="Sharon Stone, Joe Pesci";
		String awards="MTV Movie";
		String trailerUrl="https://www.youtube.com/watch?v=RS3aHkkfuEI";
		String imgUrl="https://m.media-amazon.com/images/M/MV5BMTcxOWYzNDYtYmM4YS00N2NkLTk0NTAtNjg1ODgwZjAxYzI3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SY1000_CR0,0,666,1000_AL_.jpg";
		
		Movie myMovie = new Movie(title, year,genre, imdb_rate,cast, awards, trailerUrl,imgUrl);
		
		String newImgUrl="http://localhost:8080/movie3/img/beautifulmind.jpg";
		String expectedResult="http://localhost:8080/movie3/img/beautifulmind.jpg";
		myMovie.setImgUrl(newImgUrl);
		String actualResult = myMovie.getImgUrl();	
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	public void Get_ImgUrl() {
		String title="Casino";
		int year =1995;
		String genre="Action";
		double imdb_rate= 6.5;
		String cast="Sharon Stone, Joe Pesci";
		String awards="MTV Movie";
		String trailerUrl="https://www.youtube.com/watch?v=RS3aHkkfuEI";
		String imgUrl="http://localhost:8080/movie3/img/beautifulmind.jpg";
		
		Movie myMovie = new Movie(title, year,genre, imdb_rate,cast, awards, trailerUrl,imgUrl);

		String expectedResult="http://localhost:8080/movie3/img/beautifulmind.jpg";
		String actualResult = myMovie.getImgUrl();	
		Assert.assertEquals(expectedResult, actualResult);
	}
	
}

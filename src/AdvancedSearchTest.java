
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AdvancedSearchTest {


    static WebDriver driver;

    public static void main(final String[] args) throws InterruptedException {
        // Telling the system where to find the chrome driver
        System.setProperty(
                "webdriver.chrome.driver",
                "/Users/un/Desktop/chromedriver");
        

        driver = new ChromeDriver();
        driver.get("http://localhost:8080/movie3/fe-advanced-search.jsp");
        

        WebElement elementId = driver.findElement(By.id("MovieId"));
        elementId.click();
        elementId.sendKeys("49");
        
        WebElement elementTitle = driver.findElement(By.id("title"));
        elementTitle.click();
        elementTitle.sendKeys("Irish");
        
        WebElement elementYear = driver.findElement(By.id("year"));
        elementYear.click();
        elementYear.sendKeys("2019");
        
//        WebElement elementGenre = driver.findElement(By.id("genre"));
//        elementGenre.click();
        
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
        elementAwards.sendKeys("At");
        
        WebElement elementSbmtBtn= driver.findElement(By.className("smb_button"));
        elementSbmtBtn.click();
        

        WebDriverWait wait = new WebDriverWait(driver, 10); 
        WebElement messageElement = 
        		wait.until( ExpectedConditions.presenceOfElementLocated(By.className("error")) );
        
        WebElement elementYear2 = driver.findElement(By.id("year"));
        elementYear2.click();
        elementYear2.sendKeys("2019");

        
//        driver.quit();
    }
}

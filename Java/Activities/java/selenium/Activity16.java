package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity16 {
    public static void main(String[] args) {

        // Start Firefox browser
        WebDriver driver = new FirefoxDriver();

        // Open website
        driver.get("https://www.google.com");

        // Find search box and type text
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium testing");

        // Click search button
        searchBox.submit();

        // Check if results page loaded
        String title = driver.getTitle();

        if(title.contains("Selenium testing")) {
            System.out.println("Search button is working");
        } else {
            System.out.println("Search button is NOT working");
        }

        // Close browser
        driver.quit();
    
        
    }
}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/login-form");

        // Print the title
        System.out.println("Page title: " + driver.getTitle());

        // Enter username and password
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");

        // Click login button
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        // Close browser
        driver.quit();
    }
}
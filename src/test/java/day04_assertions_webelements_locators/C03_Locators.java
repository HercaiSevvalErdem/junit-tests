package day04_assertions_webelements_locators;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Locators {


    @Test
    void test01() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Go to Amazon page
        driver.get("https://www.amazon.com/");
        // Locate the search box and print and search for Iphone
        WebElement searchBox = driver.findElement(By.id("nav-bb-search"));
        searchBox.sendKeys("Iphone", Keys.ENTER); //Enter butonuna basmanin 1. yolu
        // searchBox.submit(); // Enter butonuna basmanin 2. yolu
        // Close the page
        driver.quit();


    }
}

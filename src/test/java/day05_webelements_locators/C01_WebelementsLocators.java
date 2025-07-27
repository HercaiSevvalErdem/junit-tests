package day05_webelements_locators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_WebelementsLocators {


    @Test
    void test01() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Go to Google page
        driver.get("https://www.google.com");

        // Find the search box according to the "name" attribute and type "selenium"

        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("selenium");

        // Make the call
        searchbox.submit();

        // Test that the header contains "selenium"
        Assertions.assertTrue(driver.getTitle().contains("selenium"));

        // Prints how many links are the page to the console
        List<WebElement> lists = driver.findElements(By.tagName("a"));
        System.out.println("linklerin sayısı = " + lists.size());

        //If the links on the page have text, print them to the console
        for (WebElement w : lists) {
            if (!w.getText().isEmpty()) {
                System.out.println(w.getText());
            }

        }

        // Close te page
        driver.quit();

    }
}
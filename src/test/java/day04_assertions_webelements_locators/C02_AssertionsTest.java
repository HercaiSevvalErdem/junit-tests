package day04_assertions_webelements_locators;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_AssertionsTest {

    WebDriver driver;

    @BeforeEach
    void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test
    void testPageTitle() {

        //Go to Google Website
        driver.get("https://www.google.com/");

        //Verify that the page title is Google
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assertions.assertEquals(expectedTitle, actualTitle);

    }

    @Test
    void testUrl() {

        //Go to Google Website
        driver.get("https://www.google.com/");

        //Verify that the page url is https://www.google.com/
        String expUrl = "https://www.google.com/";
        String actUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expUrl, actUrl);


    }

    @AfterEach
    void tearDown() {

        //Close the page
        driver.quit();
    }
}

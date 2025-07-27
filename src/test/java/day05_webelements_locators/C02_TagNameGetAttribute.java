package day05_webelements_locators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_TagNameGetAttribute {

    @Test
    void test01() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // techproeducation sayfasina gidin
        driver.get("https://www.techproeducation.com/");

        // Arama kutusunun tagname'inin input oldugunu test edelim

        WebElement searchBox = driver.findElement(By.id("searchHeaderInput"));
        String expectedTagName = "input";
        String actualTagName = searchBox.getTagName();

        Assertions.assertEquals(expectedTagName, actualTagName);

        //sayfayi kapat
        driver.quit();


    }
}

package day05_webelements_locators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ClassWork {


    @Test
    void test01() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://testcenter.techproeducation.com/index.php adresine gidin
        driver.get("https://testcenter.techproeducation.com/index.php");

        // "Back to Techproeducation" butonunun kullanici erisimş icin etkin olup olmadigini test edin

        WebElement backToButton = driver.findElement(By.linkText("Back to TechProEducation.com"));
        Assertions.assertTrue(backToButton.isEnabled());

        // "Application lists" basliginin  gorunur olup olmadigini test ediniz
        WebElement applicationList = driver.findElement(By.tagName("h1"));
        Assertions.assertTrue(applicationList.isDisplayed());

        driver.quit();


    }
}

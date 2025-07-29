package day06_xpath_css;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_XPathWork {
    @Test
    void test01() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // Add Element butonuna tiklayin
        WebElement addElementButton = driver.findElement(By.xpath("//button[text()='Add Element']"));
        addElementButton.click();

        // Delete butonu'nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.xpath("//button[text()='Delete']"));
        Assertions.assertTrue(deleteButton.isDisplayed());

        // Delete butonuna basin
        deleteButton.click();

        // "Add/Remove Elements" yazisinin gorunur oldugunu test edin
        WebElement addRemoveText = driver.findElement(By.xpath("//h3"));
        Assertions.assertTrue(addRemoveText.isDisplayed());

        // sayfayi kapatin
        driver.quit();


    }


}

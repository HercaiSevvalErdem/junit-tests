package day06_xpath_css;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_XPath {

    @Test
    void test01() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Go to the web page, https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        WebElement contiuneShoppingButton = driver.findElement(By.xpath("//button[@type='submit']"));
        contiuneShoppingButton.click();

        // Search "city bike" in the search box(locate the search box with xpath)
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("city bike", Keys.ENTER);

        // Print the number of relevant results displayed on Amazon
        WebElement resultText = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        System.out.println("resultText= " + resultText.getText());

        // Just print the result number
        // 1-16 of over 6,000 results for "city bike"
        System.out.println("Sonuc sayisi = " + resultText.getText().split(" ")[3]);


        // Close the page
        driver.quit();


    }
}

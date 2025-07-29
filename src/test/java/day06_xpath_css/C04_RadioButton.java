package day06_xpath_css;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_RadioButton {


    @Test
    void radioButton() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https//www.facebook.com adresine gidin
        driver.get("https://www.facebook.com/");

        //"Create an Account" butonuna tiklayin
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

        //"radio buttons elementlerini locate edin
        WebElement femaleRadioButton = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        WebElement maleRadioButton = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));

        //Secili degilse cinsiyet butonundan size uygun olani secin

        if (!femaleRadioButton.isSelected()){
            femaleRadioButton.click();
        }

        // Close the page
        driver.quit();
    }
}

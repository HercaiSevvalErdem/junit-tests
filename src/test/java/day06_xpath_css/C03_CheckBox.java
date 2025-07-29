package day06_xpath_css;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_CheckBox {

    @Test
    void checkbox() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Go to the given web page https://the-internet.herokuapp.com/checkboxes
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        //Locate checkbox1 and checkbox2 elements
        WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

        //If checkbox1 is not selected, click the checkbox
        if (!checkBox1.isSelected()) {
            checkBox1.click();
        }
        //If checkbox2 is not selected, click the checkbox
        if (!checkBox2.isSelected()) {
            checkBox2.click();
        }

        //Close the page
        driver.quit();


    }
}

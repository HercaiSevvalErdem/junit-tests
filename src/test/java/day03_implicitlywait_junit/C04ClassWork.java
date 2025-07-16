package day03_implicitlywait_junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C04ClassWork {

    WebDriver driver;
    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
        public void test01(){

            driver.get("https://www.techproeducation.com");

        }

        @Test
        void test02() {

            driver.get("https://www.facebook.com");

        }

        @Test
        void test03(){
            driver.get("https://www.google.com");


        }

    @AfterEach
    void tearDown() {

        driver.close();
    }
}

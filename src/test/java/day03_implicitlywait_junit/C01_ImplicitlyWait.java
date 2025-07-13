package day03_implicitlywait_junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;
import java.time.Duration;

public class C01_ImplicitlyWait {

    public static void main(String[] args) {

       // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // Sayfayi buyuttuk
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // Sayfadaki tum webelementlerin yuklenmessini max 15 saniye icin bekle

        // Go to Techpro page
        driver.get("https://www.techproeducation.com");

        // Test that the page title contains TechPro Education
        String expectedData = "TechPro Education";
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        if (actualTitle.contains(expectedData)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        /*
        if (actualTitle.contains("TechPro Education")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
       */
        // Go to Facebook page
        driver.get("https://www.facebook.com");

        // Test that the page url contains facebook
        /*
        String actualUrl = driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);
        if (actualUrl.contains("facebook")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        */

        if (driver.getCurrentUrl().contains("facebook")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }
        // Go back to Techpro page
        driver.navigate().back();

        // Test that you are back
        if (driver.getTitle().equals("TechPro Education IT Programs")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        // Close the page
        driver.close();

    }
}

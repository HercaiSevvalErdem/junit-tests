package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_GetMethodsTest {

    public static void main(String[] args) {

        // Go to Techproeducation page https://www.techproeducation.com/
        // Print the page title
        // Test if the page title contains "IT"
        // Print the page address (url)
        // Test that the page url contains "education"
        // Print the page handle value
        // Test wheter the word "IT Programs" appears in the page HTML codes
        // Close the page


        WebDriverManager.chromedriver().setup(); // Altyapıyı kurduk.
        WebDriver driver = new ChromeDriver(); // Bos bir sayfa actik

        driver.get("https://www.techproeducation.com/");

        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        if (actualTitle.contains("IT")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        String actualUrl = driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);

        if (actualUrl.contains("education")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        String windowHandle = driver.getWindowHandle();
        System.out.println("windowHandle = " + windowHandle);

        String tehchproPageSource = driver.getPageSource();

        if (tehchproPageSource.contains("IT Programs")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        driver.close();

    }
}

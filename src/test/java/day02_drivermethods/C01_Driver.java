package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C01_Driver {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://google.com");
        chromeDriver.quit();

        WebDriverManager.edgedriver().setup();
        WebDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://google.com");
        edgeDriver.quit();


    }
}

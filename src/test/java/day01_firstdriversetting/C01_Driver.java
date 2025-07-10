package day01_firstdriversetting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Driver {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe" );

        WebDriver driver = new ChromeDriver(); // Browser'i actik. Sonra gitmek istediğimiz url yazılır.

        driver.get("https://www.google.com");
        driver.quit();
    }

}

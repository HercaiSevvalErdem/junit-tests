package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_ManageMethods {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Techpro sayfasına gidelim https://www.techproeducation.com/
        driver.get("https://www.techproeducation.com/");

        // Sayfanin boyutunu yazdirin
        System.out.println("Sayfanin olculeri = " + driver.manage().window().getSize());

        // Sayfayi simge durumuna getirin (kucult)
        driver.manage().window().minimize();

        // Simge durumunda 2 saniye bekletip sayfayi maximize yapin
        Thread.sleep(2000);
        driver.manage().window().maximize();

        // Sayfanin boyutunu maximize durumunda yazdirin
        System.out.println("Sayfanin olculeri = " + driver.manage().window().getSize());

        // Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();

        // Sayfanin boyutunu fullscreen durumunda yazdirin
        System.out.println("Sayfanin olculeri = " + driver.manage().window().getSize());

        // Sayfayi kapatin
        driver.close();

    }
}

package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_ManageMethods {

    public static void main(String[] args) {

        // Techpro sayfasına gidelim https://www.techproeducation.com/
        // Sayfanin konumunu ve boyutunu yazdirin
        // Sayfayi simge durumuna getirin
        // Simge durumunda 2 saniye bekletip sayfayi maximize yapin
        // Sayfanin konumunu ve boyutunu maximize durumunda yazdirin
        // Sayfayi fullscreen yapin
        // Sayfanin konumunu ve boyutunu fullscreen durumunda yazdirin
        // Sayfayi kapatin

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();




    }
}

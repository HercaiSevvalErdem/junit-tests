package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigateMethods {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Go to Techproeducation homepage https://www.techproeducation.com/
        driver.navigate().to("https://www.techproeducation.com/");
        // driver.get("https://www.techproeducation.com/");
        Thread.sleep(2000);

        //Go to amazon homepage https://www.amazon.com
        driver.navigate().to("https://www.amazon.com");
        // driver.get("https://www.amazon.com");
        Thread.sleep(2000);

        //Go back to Techpro page
        driver.navigate().back();
        Thread.sleep(2000);

        //Go to Amazon page again
        driver.navigate().forward();
        Thread.sleep(2000);

        //Refresh the page
        driver.navigate().refresh();
        Thread.sleep(2000);

        //Close all pages
        driver.close();

        /*
        Thread.sleep(2000); metot'u Java'dan gelmeketedir. Hard wait dir. Otomasyonda kullanılmaktan kacinilir.
        Gereksiz beklemeye neden olur.
         */

    }
}

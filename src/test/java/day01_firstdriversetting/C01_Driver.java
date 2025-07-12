package day01_firstdriversetting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Driver {

    public static void main(String[] args) {

        /*
        ChromeDriver, Seleniumdan gelen komutlari alir ve bunları chrome'un anlayabilecegi sekilde cevirir
        Bunun icin Java dan System.setProperty() methodu ile Selenium'a ChromeDriver'in komutunu bildirerek
        ChromeBrowser'in dogru bir sekilde baslatilmasini saglar.
         */

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver(); // Bos bir browser acat. Browser'i actik. Sonra gitmek istediğimiz url yazılır.

        driver.get("https://www.google.com"); // get() methodu ile String belirttigimiz url'e gideriz.
        driver.quit(); // oturumu sonlandirir

    }

}

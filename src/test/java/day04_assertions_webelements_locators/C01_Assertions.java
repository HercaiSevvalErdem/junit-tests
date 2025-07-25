package day04_assertions_webelements_locators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class C01_Assertions {


    @Test
    void test01() {

        String expectedData = "Junit 4";
        String actualData = "Junit 4";
        Assertions.assertEquals(expectedData, actualData);


    }

    @Test
    void test02() {

        Assertions.assertTrue(3 < 14);
        Assertions.assertTrue("Selenium".contains("e"));


    }
}

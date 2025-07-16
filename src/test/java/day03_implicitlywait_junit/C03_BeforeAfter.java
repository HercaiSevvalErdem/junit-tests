package day03_implicitlywait_junit;

import org.junit.jupiter.api.*;

public class C03_BeforeAfter {

    @BeforeAll
    static void beforeAll() {

    }

    @BeforeEach
    void setUp() {

    }

    @Test
    void test01() {

    }

    @Test @Disabled
    void disable() {
    }

    @AfterAll
    static void afterAll() {

    }


    @AfterEach
    void tearDown() {

    }
}
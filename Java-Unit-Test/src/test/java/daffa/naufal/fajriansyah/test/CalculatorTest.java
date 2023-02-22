package daffa.naufal.fajriansyah.test;

import daffa.naufal.fajriansyah.test.generator.SimpleDisplayNameGenerator;
import org.junit.jupiter.api.*;
import org.opentest4j.TestAbortedException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
// @DisplayName("Test untuk Calculator Class") // Manual
public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before All");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After All");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Before Each");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("After Each");
    }

    @Test
    // @DisplayName("Test skenario sukses untuk method add(Integer, Integer)") // Manual
    public void testAddSuccess() {
        var result = calculator.add(10, 10);
        assertEquals(20, result);
    }

    @Test
    public void testDivideSuccess() {
        var result = calculator.divide(100, 10);
        assertEquals(10, result);
    }

    @Test
    public void testDivideFailed() {
        // calculator.divide(10, 0); // Error
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }

    @Test
    @Disabled
    public void testComingSoon() {

    }

    @Test
    public void testAborted() {
        var profile = System.getenv("PROFILE");
        if (!"DEV".equals(profile)) {
            throw new TestAbortedException("Test dibatalkan karena bukan DEV");
        }

        // unit test untuk DEV
    }

    @Test
    public void testAssumptions() {
        assumeTrue("DEV".equals(System.getenv("PROFILE")));

        // unit test untuk DEV
        // Belum di push
    }

}
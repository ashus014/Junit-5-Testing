package com.ashusingh;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeEach
    void init(){
        mathUtils = new MathUtils();
    }

    @Nested
    @DisplayName("Testing Add method")
    class AddTest{

        @Test
        @DisplayName("Testing add method +")
        void addTestPositive() {
            int expected = 2;
            int actual = mathUtils.add(1,1);
            assertEquals(expected, actual);
        }

        @Test
        @DisplayName("Testing add method -")
        void addTestNegative() {
            int expected = 2;
            int actual = mathUtils.add(1,1);
            assertEquals(expected, actual);
        }
    }

    @Test
    void divide() {
        MathUtils mathUtils = new MathUtils();
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1,0), "Divide by zero should throw");
    }

    @Test
    void computeCircleArea(){
        MathUtils mathUtils = new MathUtils();
        assertEquals(Math.PI*10*10, mathUtils.computeCircleArea(10),
                "Should return right circle area");

    }

    @Test
    @DisplayName("Testing multiply method")
    void testMultiply() {

        assertAll(
                () -> assertEquals(2, mathUtils.multiply(1,2)),
                () -> assertEquals(0, mathUtils.multiply(0,2)),
                () -> assertEquals(-5, mathUtils.multiply(1,-5)),
                () -> assertEquals(100, mathUtils.multiply(10,10))
        );
    }

    @Test
    @Disabled
    @DisplayName("Testing Disabled method")
    void testDisabled() {
        fail("This test should be disabled");
    }

}
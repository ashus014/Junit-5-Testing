package com.ashusingh;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void test() {
        MathUtils mathUtils = new MathUtils();
        int expected = 2;
        int actual = mathUtils.add(1,1);
        assertEquals(expected, actual, "Add method Failed");
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

}
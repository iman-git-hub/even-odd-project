package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class even_oddTest {

    private final even_odd checker = new even_odd();

    @Test
    void testEvenNumber() {
        assertEquals("Even", checker.checkEvenOdd(8));
    }

    @Test
    void testOddNumber() {
        assertEquals("Odd", checker.checkEvenOdd(7));
    }

    @Test
    void testZeroIsEven() {
        assertEquals("Even", checker.checkEvenOdd(0));
    }

    @Test
    void testNegativeEvenNumber() {
        assertEquals("Even", checker.checkEvenOdd(-4));
    }

    @Test
    void testNegativeOddNumber() {
        assertEquals("Odd", checker.checkEvenOdd(-5));
    }
}

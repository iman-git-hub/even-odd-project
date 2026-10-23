
package com.example.even_odd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOddTest {

    @Test
    public void testEvenNumber() {
        assertEquals("Even", EvenOdd.checkEvenOdd(4));
    }

    @Test
    public void testOddNumber() {
        assertEquals("Odd", EvenOdd.checkEvenOdd(7));
    }

    @Test
    public void testZero() {
        assertEquals("Even", EvenOdd.checkEvenOdd(0));
    }

    @Test
    public void testNegativeNumber() {
        assertEquals("Odd", EvenOdd.checkEvenOdd(-3));
    }
}

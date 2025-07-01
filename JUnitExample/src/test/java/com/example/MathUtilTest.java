package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class MathUtilTest {

    MathUtil math = new MathUtil();

    @Test
    public void testAdd() {
        assertEquals(5, math.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, math.subtract(5, 4));
    }

    @Test
    public void testIsEven() {
        assertTrue(math.isEven(6));
        assertFalse(math.isEven(7));
    }
}


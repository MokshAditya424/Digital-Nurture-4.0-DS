package com.example;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    // This method runs before each test
    @Before
    public void setUp() {
        // Arrange
        calculator = new Calculator();
        System.out.println("Setup complete.");
    }

    // This method runs after each test
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown complete.");
    }

    @Test
    public void testAdd() {
        // Arrange done in @Before

        // Act
        int result = calculator.add(2, 3);

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testMultiply() {
        // Act
        int result = calculator.multiply(4, 2);

        // Assert
        assertEquals(8, result);
    }
}

package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RPNCalculatorTest {

    private RPNCalculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new RPNCalculator();
    }

    @Test
    public void testSimpleAddition() {
        int result = calculator.evaluate("3 4 +");
        assertEquals(7, result);
    }

    @Test
    public void testSimpleSubtraction() {
        int result = calculator.evaluate("10 5 -");
        assertEquals(5, result);
    }

    @Test
    public void testSimpleMultiplication() {
        int result = calculator.evaluate("6 7 *");
        assertEquals(42, result);
    }

    @Test
    public void testSimpleDivision() {
        int result = calculator.evaluate("8 2 /");
        assertEquals(4, result);
    }

    @Test
    public void testNegateOperator() {
        int result = calculator.evaluate("5 negate");
        assertEquals(-5, result);
    }

    @Test
    public void testSumOperator() {
        int result = calculator.evaluate("3 4 5 7 sum");
        assertEquals(19, result);
    }

    @Test
    public void testComplexExpression() {
        int result = calculator.evaluate("5 1 2 + 4 * + 3 -");
        assertEquals(14, result);
    }

    @Test
    public void testComplexExpression2() {
        int result = calculator.evaluate("14 1 3 2 * + /");
        assertEquals(2, result);
    }


    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.evaluate("10 0 /"));
    }

    @Test
    public void testUnknownOperator() {
        assertThrows(IllegalArgumentException.class, () -> calculator.evaluate("2 2 cos"));
    }

    @Test
    public void testInvalidOperandCount() {
        assertThrows(IllegalArgumentException.class, () -> calculator.evaluate("2 -"));
    }

    @Test
    public void testExpressionWithOnlySpaces_ThrowsIllegalStateException() {
        assertThrows(IllegalStateException.class, () -> calculator.evaluate("   "));
    }

}

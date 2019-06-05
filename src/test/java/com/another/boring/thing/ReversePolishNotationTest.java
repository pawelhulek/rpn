package com.another.boring.thing;

import static org.junit.Assert.*;

public class ReversePolishNotationTest {
    private final ReversePolishNotation normalCalculator = new ReversePolishNotation();

    @org.junit.Test
    public void oneDigit() {
        assertEquals(1, normalCalculator.calculate("1"));
    }

    @org.junit.Test
    public void calculateNumber() {
        assertEquals(12, normalCalculator.calculate("12"));
    }

    @org.junit.Test
    public void calculateSimpleExpression() {
        assertEquals(3, normalCalculator.calculate("1 2 +"));
    }

    @org.junit.Test
    public void calculateExpressionForOpositePriorityOfOperation() {
        assertEquals(2, normalCalculator.calculate("2 1 /"));
    }

    @org.junit.Test
    public void moreOperationsAtTail() {
        assertEquals(2, normalCalculator.calculate("30 5 3 * /"));
    }

    @org.junit.Test
    public void moreOperationsBetweenNumbers() {
        assertEquals(17, normalCalculator.calculate("3 5 * 2 +"));
    }
}
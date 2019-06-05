package com.another.boring.thing;

import static org.junit.Assert.assertEquals;

public class PrimitivePolishNotationTest {
    private final PrimitivePolishNotation primitiveCalculator = new PrimitivePolishNotation();

    @org.junit.Test
    public void oneDigit() {
        assertEquals(1, primitiveCalculator.calculate("1"));
    }

    @org.junit.Test
    public void calculateNumber() {
        assertEquals(12, primitiveCalculator.calculate("12"));
    }

    @org.junit.Test
    public void calculateSimpleExpression() {
        assertEquals(3, primitiveCalculator.calculate("1 2 +"));
    }

    @org.junit.Test
    public void calculateExpressionForOpositePriorityOfOperation() {
        assertEquals(2, primitiveCalculator.calculate("4 2 /"));
    }

    @org.junit.Test
    public void moreOperationsAtTail() {
        assertEquals(2, primitiveCalculator.calculate("30 5 3 * /"));
    }

    @org.junit.Test
    public void moreOperationsBetweenNumbers() {
        assertEquals(17, primitiveCalculator.calculate("3 5 * 2 +"));
    }
}
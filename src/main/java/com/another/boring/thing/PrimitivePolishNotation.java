package com.another.boring.thing;

public class PrimitivePolishNotation {
    public int calculate(String expression) {
        int result = 0;
        int[] stack = new int[expression.length() / 2 + 1];
        int pointer = 0;
        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);
            if (currentChar >= '0' && currentChar <= '9') {
                result = result * 10 + charToInt(currentChar);
                stack[pointer] = result;
            } else if (currentChar == ' ') {
                result = 0;
                pointer++;
            } else {
                if (currentChar == '+') {
                    stack[pointer - 2] = stack[pointer - 1] + stack[pointer - 2];
                }
                if (currentChar == '-') {
                    stack[pointer - 2] = stack[pointer - 2] - stack[pointer - 1];
                }
                if (currentChar == '*') {
                    stack[pointer - 2] = stack[pointer - 1] * stack[pointer - 2];
                }
                if (currentChar == '/') {
                    stack[pointer - 2] = stack[pointer - 2] / stack[pointer - 1];
                }
                pointer--;
                pointer--;
            }
        }
        return stack[0];
    }

    private int charToInt(char expression) {
        return expression - 48;
    }
}

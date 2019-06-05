package com.another.boring.thing;

import java.util.*;

import static java.util.Arrays.*;

public class ReversePolishNotation {
    private final Set<String> availableOperations = new HashSet<>(asList("+", "-", "*", "/"));

    public int calculate(String expression) {
        Deque<Integer> deque = new ArrayDeque<>((expression.length() / 2) + 1);
        String[] tokens = expression.split(" ");
        for (String tok : tokens) {
            if (availableOperations.contains(tok)) {
                if (tok.equals("+")) {
                    deque.push(deque.poll() + deque.poll());
                } else if (tok.equals("-")) {
                    Integer first = deque.poll();
                    deque.push(deque.poll() - first);
                } else if (tok.equals("*")) {
                    deque.push(deque.poll() * deque.poll());
                } else if (tok.equals("/")) {
                    Integer first = deque.poll();
                    deque.push(deque.poll() / first);
                }
            } else {
                deque.push(Integer.parseInt(tok));
            }
        }
        return deque.poll();
    }
}

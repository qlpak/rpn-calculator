package org.example;

import java.util.HashMap;
import java.util.Map;

public class OperatorFactory {
    private static final Map<String, Operator> OPERATORS = new HashMap<>();

    static {
        registerOperator("+", new AddOperator());
        registerOperator("-", new SubtractOperator());
        registerOperator("*", new MultiplyOperator());
        registerOperator("/", new DivideOperator());
        registerOperator("negate", new NegateOperator());
        registerOperator("sum", new SumOperator());
    }

    public static void registerOperator(String symbol, Operator operator) {
        OPERATORS.put(symbol, operator);
    }

    public static Operator getOperator(String symbol) {
        return OPERATORS.get(symbol);
    }
}

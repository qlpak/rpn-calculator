package org.example;

public class DivideOperator implements Operator {

    @Override
    public int getArgumentCount() {
        return 2;
    }

    @Override
    public String execute(String... operands) {
        int divisor = Integer.parseInt(operands[0]);
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        int result = Integer.parseInt(operands[1]) / divisor;
        return String.valueOf(result);
    }
}


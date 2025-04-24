package org.example;

public class NegateOperator implements Operator {

    @Override
    public int getArgumentCount() {
        return 1;
    }

    @Override
    public String execute(String... operands) {
        int result = -Integer.parseInt(operands[0]);
        return String.valueOf(result);
    }
}


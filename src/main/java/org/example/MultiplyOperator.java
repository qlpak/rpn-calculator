package org.example;

public class MultiplyOperator implements Operator {

    @Override
    public int getArgumentCount() {
        return 2;
    }

    @Override
    public String execute(String... operands) {
        int result = Integer.parseInt(operands[1]) * Integer.parseInt(operands[0]);
        return String.valueOf(result);
    }
}

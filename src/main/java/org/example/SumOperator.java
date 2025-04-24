package org.example;

public class SumOperator implements Operator {

    @Override
    public int getArgumentCount() {
        return -1;
    }

    @Override
    public String execute(String... operands) {
        int sum = 0;
        for (String operand : operands) {
            sum += Integer.parseInt(operand);
        }
        return String.valueOf(sum);
    }
}

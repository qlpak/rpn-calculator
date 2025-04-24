package org.example;

public class RPNCalculator {
    private final Stack stack;

    public RPNCalculator() {
        this.stack = new Stack(10);
    }

    public int evaluate(String expression) {
        processTokens(expression.split(" "));
        return getFinalResult();
    }

    private void processTokens(String[] tokens) {
        for (String token : tokens) {
            processToken(token);
        }
    }

    private void processToken(String token) {
        if (isInteger(token)) {
            stack.push(token);
        } else {
            executeOperator(token);
        }
    }

    private void executeOperator(String token) {
        Operator operator = OperatorFactory.getOperator(token);
        if (operator == null) {
            throw new IllegalArgumentException("Unknown operator: " + token);
        }

        String[] operands = fetchOperands(operator.getArgumentCount());
        String result = operator.execute(operands);
        stack.push(result);
    }

    private String[] fetchOperands(int argumentCount) {
        if (argumentCount == -1) {
            argumentCount = stack.size();
        }

        if (stack.size() < argumentCount) {
            throw new IllegalArgumentException("insufficient operands: Expected " + argumentCount + ", but found " + stack.size());
        }

        String[] operands = new String[argumentCount];
        for (int i = 0; i < argumentCount; i++) {
            operands[i] = stack.pop();
        }
        return operands;
    }

    private int getFinalResult() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Invalid RPN expression: Stack does not contain a valid result.");
        }
        return Integer.parseInt(stack.peek());
    }

    private boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

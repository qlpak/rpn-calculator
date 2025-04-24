package org.example;

public interface Operator {
    String execute(String... operands);
    int getArgumentCount();
}

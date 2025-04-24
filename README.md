# RPN Calculator (Reverse Polish Notation) – Java

A modular and extensible calculator that evaluates arithmetic expressions written in Reverse Polish Notation (RPN), implemented in Java using SOLID and Clean Code principles.

## 💡 Features

- **Custom Stack Implementation**
  - Dynamic resizing
  - `push`, `pop`, `peek`, and `size` methods
- **RPN Expression Evaluation**
  - Supports integers and the following operators:
    - `+` (Addition)
    - `-` (Subtraction)
    - `*` (Multiplication)
    - `/` (Division)
    - `negate` (Unary negation)
    - `sum` (Sums all values on the stack)
- **Error Handling**
  - Division by zero
  - Empty stack operations
  - Unknown operators
  - Insufficient operands

## 🧪 Testing

- Written with **JUnit 5** using the **AAA (Arrange-Act-Assert)** pattern
- Achieves **100% test coverage**
- Validates:
  - Stack behavior
  - Operator execution
  - RPN calculator edge cases
  - Exception handling

## 📁 Project Structure

```bash
.
├── src
│   └── main
│       └── java
│           └── org.example
│               ├── RPNCalculator.java
│               ├── Stack.java
│               ├── Operator.java
│               ├── OperatorFactory.java
│               ├── AddOperator.java
│               ├── SubtractOperator.java
│               ├── MultiplyOperator.java
│               ├── DivideOperator.java
│               ├── NegateOperator.java
│               └── SumOperator.java
|
├── src
│   └── test
│       └── java
│           └── org.example
│               ├── RPNCalculatorTest.java
│               └── StackTest.java
```

## 🛠️ Technologies Used

- Java 23
- Maven
- JUnit 5
- SOLID Principles
- Clean Code Practices

## 🚀 How to Run

Make sure you have Java and Maven installed.

```bash
# Compile the project
mvn compile

# Run tests
mvn test
```

## ✅ Example Expressions

```txt
"2 3 +"         => 5
"2 3 4 sum"     => 9
"5 1 2 + 4 * + 3 -" => 14
"4 negate"      => -4
"4 0 /"         => Exception (division by zero)
```

## 🧠 What I Learned

- Implementing abstract operators using interfaces and factories
- Writing robust unit tests using the Arrange-Act-Assert (AAA) pattern
- Clean object-oriented design for stack-based computation
- Building scalable and maintainable code using SOLID principles

## ✍ Author

Developed by [@qlpak](https://github.com/qlpak)

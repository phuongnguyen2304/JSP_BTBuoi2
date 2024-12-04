package Bai_Tap2;

public class Calculator {
    public double calculate(double firstOperand, double secondOperand, String operator)throws ArithmeticException{
        switch (operator){
            case "add":
                return firstOperand + secondOperand;
            case "subtract":
                return firstOperand - secondOperand;
            case "multiply":
                return firstOperand * secondOperand;
            case "divide":
                if (secondOperand == 0){
                    throw new ArithmeticException("cannot divide by zero");
                }
                return firstOperand / secondOperand;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }

    }
}

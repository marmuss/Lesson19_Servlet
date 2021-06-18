package tms.lesson19.calculator;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    public Calculator(int num1, int num2, String operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    public String calculate(){
        switch (operator){
            case "sum":
                return String.valueOf(sumUp());
            case "subtract":
                return String.valueOf(subtract());
            case "multi":
                return String.valueOf(multiply());
            case "divide":
                if (num2 == 0){
                    return "It is forbidden to divide by zero";
                } else {
                    return String.valueOf(divideUp());
                }
            default:
                return "Check input parameters";
        }
    }

    private int sumUp(){
        return num1 + num2;
    }

    private int subtract(){
        return num1 - num2;
    }

    private int multiply(){
        return num1 * num2;
    }

    private float divideUp(){
            return num1 / num2;
    }
}

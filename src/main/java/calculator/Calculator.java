package calculator;

// import basic.BasicOperations;
import java.util.Scanner;

public class Calculator {
    private String input;

    private double operator1;
    private double operator2;
    private double result;

    private String operationSymbol;

    private Scanner scanner = new Scanner(System.in);

    public Calculator() {
        operator1 = 0;
        operator2 = 0;
    }

    public void operation() {
        System.out.println("Write the operation symbol");
        input = scanner.nextLine();

        //BasicOperations

        switch(input) {
            case "+":
                operationSymbol = input;
                sum();
                break;
            case "-":
                operationSymbol = input;
                subtraction();
                break;
            case "*":
                operationSymbol = input;
                multiplication();
                break;
            case "/":
                operationSymbol = input;
                division();
                break;
            default:
                System.out.println("Operación no disponible o errónea");
        }
    }

    public void operatorsCatcher() {
        System.out.println("Write operator 1");
        input = scanner.nextLine();

        try {
            Double.parseDouble(input);
        } catch(NumberFormatException e) {
            throw new IllegalArgumentException(input + "is not a number");
        }
        operator1 = Double.parseDouble(input);

        System.out.println("Write operator 2");
        input = scanner.nextLine();

        try {
            Double.parseDouble(input);
        } catch(NumberFormatException e) {
            throw new IllegalArgumentException(input + "is not a number");
        }
        operator2 = Double.parseDouble(input);
    }


    public void sum() {
        operatorsCatcher();
        result = operator1 + operator2;
    }
    public void subtraction() {
        operatorsCatcher();
        result = operator1 - operator2;
    }
    public void multiplication() {
        operatorsCatcher();
        result = operator1 * operator2;
    }
    public void division() {
        operatorsCatcher();
        result = operator1 / operator2;
    }


    /*public void getConsole() {
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        System.out.println(input);
    }*/

    // Getter
    public double getResult() {
        return result;
    }

}



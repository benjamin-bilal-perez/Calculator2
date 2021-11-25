package calculator;

import basic.BasicOperations;
import matrix.Matrix3x3;

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
        System.out.println("INTEGER:\n" +
                "sum: +\n" +
                "subtraction: -\n" +
                "multiplication: *\n" +
                "division: / \n" +
                "\n" +
                "MATRIX 3x3:\n" +
                "sum: matrix3x3Sum\n" +
                "subtraction: matrix3x3Subtraction\n" +
                "multiply: matrix3x3Multiply\n" +
                "scalarMult: matrix3x3ScalarMult\n" +
                "division: matrix3x3Division\n" +
                "scalar division: matrix3x3ScalarDivision\n" +
                "equals: matrix3x3Equals\n" +
                "toString: matrix3x3ToString\n" +
                "\n" +
                "MATRIX 4x4:\n" +
                "sum: matrix4x4Sum\n" +
                "subtraction: matrix4x4Subtraction\n" +
                "multiply: matrix4x4Multiply\n" +
                "scalarMult: matrix4x4ScalarMult\n" +
                "division: matrix4x4Division\n" +
                "scalarDivision: matrix4x4ScalarDivision\n" +
                "equals: matrix3x3Equals\n" +
                "toString: matrix3x3ToString\n" +
                "");
        input = scanner.nextLine();

        //BasicOperations

        switch(input) {
            // Basic operations
            case "+":
                // operationSymbol = input;
                sum();
                break;
            case "-":
                //operationSymbol = input;
                subtraction();
                break;
            case "*":
                //operationSymbol = input;
                multiplication();
                break;
            case "/":
                //operationSymbol = input;
                division();
                break;
            // Matrix3x3
            case "matrix3x3Sum":
                sumMatrix3x3();
                break;
            case "matrix3x3Subtraction":
                subtractionMatrix3x3();
                break;
            case "matrix3x3Multiply":
                multiplicationMatrix3x3();
                break;
            case "matrix3x3Division":
                divisionMatrix3x3();
                break;
            case "matrix3x3ScalarDivision":
                scalarDivisionmatrix3x3();
                break;
            default:
                System.out.println("Operación no disponible o errónea");
        }
    }

    private void operatorsCatcher() {
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

    private double[][] matrix3x3Catcher() {
        double[][] result = {{0.0,0.0,0.0},{0.0,0.0,0.0},{0.0,0.0,0.0}};

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                input = scanner.nextLine();
                try {
                    Double.parseDouble(input);
                } catch(NumberFormatException e) {
                    throw new IllegalArgumentException(input + "is not a number");
                }
                result[i][j] = Double.parseDouble(input);
            }
        }

        return result;
    }

    private double scalarCatcher() {
        input = scanner.nextLine();

        try {
            Double.parseDouble(input);
        } catch(NumberFormatException e) {
            throw new IllegalArgumentException(input + "is not a number");
        }

        return Double.parseDouble(input);
    }


    public void sum() {
        operatorsCatcher();
        BasicOperations operation = new BasicOperations(operator1, operator2);
        operation.sum();
        System.out.println("Result: " + operation.getResult());
    }
    public void subtraction() {
        operatorsCatcher();
        BasicOperations operation = new BasicOperations(operator1, operator2);
        operation.subtraction();
        System.out.println("Result: " + operation.getResult());
    }
    public void multiplication() {
        operatorsCatcher();
        BasicOperations operation = new BasicOperations(operator1, operator2);
        operation.multiplication();
        System.out.println("Result: " + operation.getResult());
    }
    public void division() {
        operatorsCatcher();
        BasicOperations operation = new BasicOperations(operator1, operator2);
        operation.division();
        System.out.println("Result: " + operation.getResult());
    }

    // Matrix3x3

    public void sumMatrix3x3() {
        System.out.println("First matrix:");
        double[][] input1 = matrix3x3Catcher();
        System.out.println("Second matrix");
        double[][] input2 = matrix3x3Catcher();

        Matrix3x3 matrix1 = new Matrix3x3(input1[0][0],
                input1[0][1],
                input1[0][2],
                input1[1][0],
                input1[1][1],
                input1[1][2],
                input1[2][0],
                input1[2][1],
                input1[2][2]);

        Matrix3x3 matrix2 = new Matrix3x3(input2[0][0],
                input2[0][1],
                input2[0][2],
                input2[1][0],
                input2[1][1],
                input2[1][2],
                input2[2][0],
                input2[2][1],
                input2[2][2]);

        matrix1.sum(matrix2);

        System.out.println("Result: " + matrix1.toString());
    }

    public void subtractionMatrix3x3() {
        System.out.println("First matrix:");
        double[][] input1 = matrix3x3Catcher();
        System.out.println("Second matrix");
        double[][] input2 = matrix3x3Catcher();

        Matrix3x3 matrix1 = new Matrix3x3(input1[0][0],
                input1[0][1],
                input1[0][2],
                input1[1][0],
                input1[1][1],
                input1[1][2],
                input1[2][0],
                input1[2][1],
                input1[2][2]);

        Matrix3x3 matrix2 = new Matrix3x3(input2[0][0],
                input2[0][1],
                input2[0][2],
                input2[1][0],
                input2[1][1],
                input2[1][2],
                input2[2][0],
                input2[2][1],
                input2[2][2]);

        matrix1.subtraction(matrix2);

        System.out.println("Result: " + matrix1.toString());
    }

    public void multiplicationMatrix3x3() {
        System.out.println("First matrix:");
        double[][] input1 = matrix3x3Catcher();
        System.out.println("Second matrix");
        double[][] input2 = matrix3x3Catcher();

        Matrix3x3 matrix1 = new Matrix3x3(input1[0][0],
                input1[0][1],
                input1[0][2],
                input1[1][0],
                input1[1][1],
                input1[1][2],
                input1[2][0],
                input1[2][1],
                input1[2][2]);

        Matrix3x3 matrix2 = new Matrix3x3(input2[0][0],
                input2[0][1],
                input2[0][2],
                input2[1][0],
                input2[1][1],
                input2[1][2],
                input2[2][0],
                input2[2][1],
                input2[2][2]);

        matrix1.multiply(matrix2);

        System.out.println("Result: " + matrix1.toString());
    }

    public void divisionMatrix3x3() {
        System.out.println("First matrix:");
        double[][] input1 = matrix3x3Catcher();
        System.out.println("Second matrix");
        double[][] input2 = matrix3x3Catcher();

        Matrix3x3 matrix1 = new Matrix3x3(input1[0][0],
                input1[0][1],
                input1[0][2],
                input1[1][0],
                input1[1][1],
                input1[1][2],
                input1[2][0],
                input1[2][1],
                input1[2][2]);

        Matrix3x3 matrix2 = new Matrix3x3(input2[0][0],
                input2[0][1],
                input2[0][2],
                input2[1][0],
                input2[1][1],
                input2[1][2],
                input2[2][0],
                input2[2][1],
                input2[2][2]);

        matrix1.multiply(matrix2);

        System.out.println("Result: " + matrix1.toString());
    }

    public void scalarDivisionmatrix3x3() {
        System.out.println("Matrix:");
        double[][] input1 = matrix3x3Catcher();
        System.out.println("Scalar:");
        double scalar = scalarCatcher();

        Matrix3x3 matrix = new Matrix3x3(input1[0][0],
                input1[0][1],
                input1[0][2],
                input1[1][0],
                input1[1][1],
                input1[1][2],
                input1[2][0],
                input1[2][1],
                input1[2][2]);

        matrix.scalarDivision(scalar);

        System.out.println("Result: " + matrix.toString());
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



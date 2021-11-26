package calculator;

import basic.BasicOperations;
import matrix.Matrix3x3;
import matrix.Matrix4x4;
import vector.Vector2;
import vector.Vector3;
import vector.Vector4;

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
                "\n" +
                "VECTOR2:\n" +
                "module: moduleVector2" +
                "sum: sumVector2\n" +
                "number multiplication: numMultVector2\n" +
                "deny: denyVector2\n" +
                "ScalarProduct: ScalarProductVector2\n" +
                "equals: equalsVector2\n" +
                "to string: toStringVector2\n" +
                "\n" +
                "VECTOR3:\n" +
                "module: moduleVector3" +
                "sum: sumVector3\n" +
                "number multiplication: numMultVector3\n" +
                "deny: denyVector3\n" +
                "scalar product: scalarProductVector3\n" +
                "equals: equalsVector3\n" +
                "to string: toStringVector3\n" +
                "\n" +
                "VECTOR4:\n" +
                "module: moduleVector4" +
                "sum: sumVector4\n" +
                "number multiplication: numMultVector4\n" +
                "deny: denyVector4\n" +
                "ScalarProduct: ScalarProductVector4\n" +
                "equals: equalsVector4\n" +
                "to string: toStringVector4\n");
        input = scanner.nextLine();

        switch(input) {
            // Basic operations:
            case "+":
                sum();
                break;
            case "-":
                subtraction();
                break;
            case "*":
                multiplication();
                break;
            case "/":
                division();
                break;
            // Matrix3x3:
            case "matrix3x3Sum":
                sumMatrix3x3();
                break;
            case "matrix3x3Subtraction":
                subtractionMatrix3x3();
                break;
            case "matrix3x3Multiply":
                multiplicationMatrix3x3();
                break;
            case "matrix3x3ScalarMult:":
                scalarMultmatrix3x3();
            case "matrix3x3Division":
                divisionMatrix3x3();
                break;
            case "matrix3x3ScalarDivision":
                scalarDivisionmatrix3x3();
                break;
            case "matrix3x3Equals":
                equalsMatrix3x3();
                break;
            case "matrix3x3ToString":
                toStringMatrix3x3();
                // Matrix4x4
            case "matrix4x4Sum":
                sumMatrix4x4();
                break;
            case "matrix4x4Subtraction":
                subtractionMatrix4x4();
                break;
            case "matrix4x4Multiply":
                multiplicationMatrix4x4();
                break;
            case "Matrix4x4scalarMult:":
                scalarMultmatrix4x4();
            case "matrix4x4Division":
                divisionMatrix4x4();
                break;
            case "matrix4x4ScalarDivision":
                scalarDivisionmatrix4x4();
                break;
            case "matrix4x4Equals":
                equalsMatrix4x4();
                break;
            case "matrix4x4ToString":
                toStringMatrix4x4();
                break;
                // Vector2:
            case "moduleVector2":
                moduleVector2();
                break;
            case "sumVector2":
                sumVector2();
                break;
            case "numMultVector2":
                numMultVector2();
                break;
            case "denyVector2":
                denyVector2();
                break;
            case "ScalarProductVector2":
                ScalarProductVector2();
                break;
            case "equalsVector2":
                equalsVector2();
                break;
            case "toStringVector2":
                toStringVector2();
                break;
                // Vector3
            case "moduleVector3":
                moduleVector3();
                break;
            case "sumVector3":
                sumVector3();
                break;
            case "numMultVector3":
                numMultVector3();
                break;
            case "denyVector3":
                denyVector3();
                break;
            case "scalarProductVector3":
                scalarProductVector3();
                break;
            case "crossProductVector3":
                crossProductVector3();
                break;
            case "equalsVector3":
                equalsVector3();
                break;
            case "toStringVector3":
                toStringVector3();
                break;
                // Vector4:
            case "moduleVector4":
                moduleVector4();
                break;
            case "sumVector4":
                sumVector4();
                break;
            case "numMultVector4":
                numMultVector4();
                break;
            case "denyVector4":
                denyVector4();
                break;
            case "scalarProductVector4":
                scalarProductVector4();
                break;
            case "equalsVector4":
                equalsVector4();
                break;
            case "toStringVector4":
                toStringVector4();
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

    private Matrix3x3 matrix3x3Catcher() {
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

        Matrix3x3 matrix = new Matrix3x3(result[0][0],
                result[0][1],
                result[0][2],
                result[1][0],
                result[1][1],
                result[1][2],
                result[2][0],
                result[2][1],
                result[2][2]);

        return matrix;
    }

    private Matrix4x4 matrix4x4Catcher() {
        double[][] result = {{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}};

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

        Matrix4x4 matrix = new Matrix4x4(result[0][0],
                result[0][1],
                result[0][2],
                result[0][3],
                result[1][0],
                result[1][1],
                result[1][2],
                result[1][3],
                result[2][0],
                result[2][1],
                result[2][2],
                result[2][3],
                result[3][0],
                result[3][1],
                result[3][2],
                result[3][3]);

        return matrix;
    }

    private Vector2 vector2Catcher() {
        System.out.println("Write x point:");
        input = scanner.nextLine();

        try {
            Double.parseDouble(input);
        } catch(NumberFormatException e) {
            throw new IllegalArgumentException(input + "is not a number");
        }
        double x = Double.parseDouble(input);

        System.out.println("Write y point");
        input = scanner.nextLine();

        try {
            Double.parseDouble(input);
        } catch(NumberFormatException e) {
            throw new IllegalArgumentException(input + "is not a number");
        }
        double y = Double.parseDouble(input);

        Vector2 vector = new Vector2(x, y);
        return vector;
    }

    private Vector3 vector3Catcher() {
        System.out.println("Write x point:");
        input = scanner.nextLine();

        try {
            Double.parseDouble(input);
        } catch(NumberFormatException e) {
            throw new IllegalArgumentException(input + "is not a number");
        }
        double x = Double.parseDouble(input);

        System.out.println("Write y point");
        input = scanner.nextLine();

        try {
            Double.parseDouble(input);
        } catch(NumberFormatException e) {
            throw new IllegalArgumentException(input + "is not a number");
        }
        double y = Double.parseDouble(input);

        System.out.println("Write z point");
        input = scanner.nextLine();

        try {
            Double.parseDouble(input);
        } catch(NumberFormatException e) {
            throw new IllegalArgumentException(input + "is not a number");
        }
        double z = Double.parseDouble(input);

        Vector3 vector = new Vector3(x, y, z);
        return vector;
    }

    private Vector4 vector4Catcher() {
        System.out.println("Write x point:");
        input = scanner.nextLine();

        try {
            Double.parseDouble(input);
        } catch(NumberFormatException e) {
            throw new IllegalArgumentException(input + "is not a number");
        }
        double x = Double.parseDouble(input);

        System.out.println("Write y point");
        input = scanner.nextLine();

        try {
            Double.parseDouble(input);
        } catch(NumberFormatException e) {
            throw new IllegalArgumentException(input + "is not a number");
        }
        double y = Double.parseDouble(input);

        System.out.println("Write z point");
        input = scanner.nextLine();

        try {
            Double.parseDouble(input);
        } catch(NumberFormatException e) {
            throw new IllegalArgumentException(input + "is not a number");
        }
        double z = Double.parseDouble(input);

        System.out.println("Write w point");
        input = scanner.nextLine();

        try {
            Double.parseDouble(input);
        } catch(NumberFormatException e) {
            throw new IllegalArgumentException(input + "is not a number");
        }
        double w = Double.parseDouble(input);

        Vector4 vector = new Vector4(x, y, z, w);
        return vector;
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

    // MATRIX3X3

    public void sumMatrix3x3() {
        System.out.println("First matrix:");
        Matrix3x3 matrix1 = matrix3x3Catcher();
        System.out.println("Second matrix:");
        Matrix3x3 matrix2 = matrix3x3Catcher();

        matrix1.sum(matrix2);

        System.out.println("Result: " + matrix1.toString());
    }

    public void subtractionMatrix3x3() {
        System.out.println("First matrix:");
        Matrix3x3 matrix1 = matrix3x3Catcher();
        System.out.println("Second matrix:");
        Matrix3x3 matrix2 = matrix3x3Catcher();

        matrix1.subtraction(matrix2);

        System.out.println("Result: " + matrix1.toString());
    }

    public void multiplicationMatrix3x3() {
        System.out.println("First matrix:");
        Matrix3x3 matrix1 = matrix3x3Catcher();
        System.out.println("Second matrix:");
        Matrix3x3 matrix2 = matrix3x3Catcher();

        matrix1.multiply(matrix2);

        System.out.println("Result: " + matrix1.toString());
    }

    public void divisionMatrix3x3() {
        System.out.println("First matrix:");
        Matrix3x3 matrix1 = matrix3x3Catcher();
        System.out.println("Second matrix:");
        Matrix3x3 matrix2 = matrix3x3Catcher();

        matrix1.multiply(matrix2);

        System.out.println("Result: " + matrix1.toString());
    }

    public void scalarDivisionmatrix3x3() {
        System.out.println("First matrix:");
        Matrix3x3 matrix = matrix3x3Catcher();
        System.out.println("Scalar:");
        double scalar = scalarCatcher();

        matrix.scalarDivision(scalar);

        System.out.println("Result: " + matrix.toString());
    }

    public void scalarMultmatrix3x3() {
        System.out.println("First matrix:");
        Matrix3x3 matrix = matrix3x3Catcher();
        System.out.println("Scalar:");
        double scalar = scalarCatcher();

        matrix.scalarMult(scalar);

        System.out.println("Result: " + matrix.toString());
    }

    public void equalsMatrix3x3() {
        System.out.println("First matrix:");
        Matrix3x3 matrix1 = matrix3x3Catcher();
        System.out.println("Second matrix:");
        Matrix3x3 matrix2 = matrix3x3Catcher();

        System.out.println("Result: " + matrix1.equals(matrix2));
    }

    public void toStringMatrix3x3() {
        System.out.println("Matrix:");
        Matrix3x3 matrix = matrix3x3Catcher();

        System.out.println("Result: " + matrix.toString());
    }

    // MATRIX4X4

    public void sumMatrix4x4() {
        System.out.println("First matrix:");
        Matrix4x4 matrix1 = matrix4x4Catcher();
        System.out.println("Second matrix:");
        Matrix4x4 matrix2 = matrix4x4Catcher();

        matrix1.sum(matrix2);

        System.out.println("Result: " + matrix1.toString());
    }

    public void subtractionMatrix4x4() {
        System.out.println("First matrix:");
        Matrix4x4 matrix1 = matrix4x4Catcher();
        System.out.println("Second matrix:");
        Matrix4x4 matrix2 = matrix4x4Catcher();

        matrix1.subtraction(matrix2);

        System.out.println("Result: " + matrix1.toString());
    }

    public void multiplicationMatrix4x4() {
        System.out.println("First matrix:");
        Matrix4x4 matrix1 = matrix4x4Catcher();
        System.out.println("Second matrix:");
        Matrix4x4 matrix2 = matrix4x4Catcher();

        matrix1.multiply(matrix2);

        System.out.println("Result: " + matrix1.toString());
    }

    public void divisionMatrix4x4() {
        System.out.println("First matrix:");
        Matrix4x4 matrix1 = matrix4x4Catcher();
        System.out.println("Second matrix:");
        Matrix4x4 matrix2 = matrix4x4Catcher();

        matrix1.multiply(matrix2);

        System.out.println("Result: " + matrix1.toString());
    }

    public void scalarDivisionmatrix4x4() {
        System.out.println("First matrix:");
        Matrix4x4 matrix = matrix4x4Catcher();
        System.out.println("Scalar:");
        double scalar = scalarCatcher();

        matrix.scalarDivision(scalar);

        System.out.println("Result: " + matrix.toString());
    }

    public void scalarMultmatrix4x4() {
        System.out.println("First matrix:");
        Matrix4x4 matrix = matrix4x4Catcher();
        System.out.println("Scalar:");
        double scalar = scalarCatcher();

        matrix.scalarMult(scalar);

        System.out.println("Result: " + matrix.toString());
    }

    public void equalsMatrix4x4() {
        System.out.println("First matrix:");
        Matrix4x4 matrix1 = matrix4x4Catcher();
        System.out.println("Second matrix:");
        Matrix4x4 matrix2 = matrix4x4Catcher();

        System.out.println("Result: " + matrix1.equals(matrix2));
    }

    public void toStringMatrix4x4() {
        System.out.println("Matrix:");
        Matrix4x4 matrix = matrix4x4Catcher();

        System.out.println("Result: " + matrix.toString());
    }


    // VECTOR2
    public void moduleVector2() {
        Vector2 vector = vector2Catcher();

        System.out.println("Result: " + vector.module());
    }

    public void sumVector2() {
        Vector2 vector1 = vector2Catcher();
        Vector2 vector2 = vector2Catcher();

        vector1.sum(vector2);

        System.out.println("Result: " + vector1.toString());
    }

    public void numMultVector2() {
        Vector2 vector = vector2Catcher();
        double num = scalarCatcher();

        vector.numMult(num);

        System.out.println("Result: " + vector);
    }

    public void denyVector2() {
        Vector2 vector = vector2Catcher();

        vector.deny();

        System.out.println("Result: " + vector.toString());
    }

    public void ScalarProductVector2() {
        Vector2 vector1 = vector2Catcher();
        Vector2 vector2 = vector2Catcher();

        vector1.scalarProduct(vector2);

        System.out.println("Result: " + vector1.toString());
    }

    public void equalsVector2() {
        Vector2 vector1 = vector2Catcher();
        Vector2 vector2 = vector2Catcher();

        System.out.println("Result: " + vector1.equals(vector2));
    }

    public void toStringVector2() {
        Vector2 vector = vector2Catcher();

        System.out.println("Result: " + vector.toString());
    }


    // VECTOR3:

    public void moduleVector3() {
        Vector3 vector = vector3Catcher();

        System.out.println("Result: " + vector.module());
    }

    public void sumVector3() {
        Vector3 vector1 = vector3Catcher();
        Vector3 vector2 = vector3Catcher();

        vector1.sum(vector2);

        System.out.println("Result: " + vector1.toString());
    }

    public void numMultVector3() {
        Vector3 vector = vector3Catcher();
        double num = scalarCatcher();

        vector.numMult(num);

        System.out.println("Result: " + vector.toString());
    }

    public void denyVector3() {
        Vector3 vector = vector3Catcher();

        vector.deny();

        System.out.println("Result: " + vector.toString());
    }

    public void scalarProductVector3() {
        Vector3 vector1 = vector3Catcher();
        Vector3 vector2 = vector3Catcher();

        vector1.scalarProduct(vector2);

        System.out.println("Result: " + vector1.toString());
    }

    public void crossProductVector3() {
        Vector3 vector1 = vector3Catcher();
        Vector3 vector2 = vector3Catcher();

        vector1.crossProduct(vector2);

        System.out.println("Result: " + vector1.toString());
    }

    public void equalsVector3() {
        Vector3 vector1 = vector3Catcher();
        Vector3 vector2 = vector3Catcher();

        System.out.println("Result: " + vector1.equals(vector2));
    }

    public void toStringVector3() {
        Vector3 vector = vector3Catcher();

        System.out.println("Result: " + vector.toString());
    }


    // VECTOR4

    public void moduleVector4() {
        Vector4 vector = vector4Catcher();

        System.out.println("Result: " + vector.module());
    }

    public void sumVector4() {
        Vector4 vector1 = vector4Catcher();
        Vector4 vector2 = vector4Catcher();

        vector1.sum(vector2);

        System.out.println("Result: " + vector1.toString());
    }

    public void numMultVector4() {
        Vector4 vector = vector4Catcher();
        double num = scalarCatcher();

        vector.numMult(num);

        System.out.println("Result: " + vector);
    }

    public void denyVector4() {
        Vector4 vector = vector4Catcher();

        vector.deny();

        System.out.println("Result: " + vector.toString());
    }

    public void scalarProductVector4() {
        Vector4 vector1 = vector4Catcher();
        Vector4 vector2 = vector4Catcher();

        vector1.scalarProduct(vector2);

        System.out.println("Result: " + vector1.toString());
    }

    public void equalsVector4() {
        Vector4 vector1 = vector4Catcher();
        Vector4 vector2 = vector4Catcher();

        System.out.println("Result: " + vector1.equals(vector2));
    }

    public void toStringVector4() {
        Vector2 vector = vector2Catcher();

        System.out.println("Result: " + vector.toString());
    }









    // Getter
    public double getResult() {
        return result;
    }
}



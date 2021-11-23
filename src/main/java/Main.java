import calculator.Calculator;
import vector.Vector3;


public class Main {

    public static void main(String[] args) {
        System.out.println("This is a test");

        Vector3 vector = new Vector3();

        Calculator calculator = new Calculator();
        calculator.operation();

        //BasicOperations basic = new BasicOperations();

        System.out.println(calculator.getResult());
    }
}

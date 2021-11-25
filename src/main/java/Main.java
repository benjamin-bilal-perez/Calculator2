import calculator.Calculator;
import basic.BasicOperations;
import vector.Vector3;


public class Main {

    public static void main(String[] args) {
        System.out.println("This is a test");

        Vector3 vector = new Vector3();

        Calculator calculator = new Calculator();
        calculator.operation();



        System.out.println(calculator.getResult());

        // System.out.println(calculator.getResult());

        BasicOperations basic = new BasicOperations(1, 2);
        basic.sum();
        System.out.println(basic.getResult());
        System.out.println(basic.getOperator1());
        System.out.println(basic.getOperator2());
        /*System.out.println(basic.getOperator1());
        System.out.println(basic.getOperator2());*/
    }
}

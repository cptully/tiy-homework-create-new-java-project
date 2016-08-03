/**
 * Created by chris on 8/2/16.
 */
public class Main {
    public static void main(String [] args){
        int x1 = 5;
        int x2 = 45;
        double d1 = 5.43;
        double d2 = 99.321;

        // integer addition
        System.out.println("x1 plus x2: " + x1 + x2);

        // integer subtraction; to print out the result of subtraction
        // this way the operation has to be in parenthesis!
        System.out.println("x1 minus x2: " + (x1 - x2));

        // integer multiplication
        System.out.println("x1 times x2: " + x1 * x2);

        // integer division
        System.out.println("x1 divide by x2: " + x1 / x2);

        // double addition
        System.out.println("d1 plus d2: " + d1 + d2);

        // double subtraction
        System.out.println("d1 minus d2: " + (d1 - d2));

        // double multiplication
        System.out.println("d1 times d2: " + d1 * d2);

        // double division
        System.out.println("d1 divide by d2: " + d1 / d2);

        // adding a double to an integer
        System.out.println("x1 plus d2: " + x1 + d2);

        // multiplying a double with an integer
        System.out.println("d1 times x2: " + d1 * x2);

    }
}

package calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        // System.out.println("Hello World!");

        logger.info("Start of Execution");
        double num1, num2;

        // Take input from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers:");

        // Take the inputs
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        System.out.println("Enter the operator (+,-,*,/):");

        char op = sc.next().charAt(0);
        double o = 0;

        switch (op) {
            // case to add two numbers
            case '+':
                o = num1 + num2;
                break;

            // case to subtract two numbers
            case '-':
                o = num1 - num2;
                break;

            // case to multiply two numbers
            case '*':
                o = num1 * num2;
                break;

            // case to divide two numbers
            case '/':
                o = num1 / num2;
                break;

            default:
                logger.error("You enter wrong input");
                System.out.println("You enter wrong input");
        }

        System.out.println("The final result:");
        System.out.println();

        // print the final result
        System.out.println(num1 + " " + op + " " + num2 + " = " + o);

        logger.info("End of Execution");
        sc.close();
    }
    public double add(double a,double b) 
    {
        double sum = 0;
        logger.info("Adding numbers");
        // for (double number : numbers) 
        // {
        //     sum += number;
        // }
        sum = a + b;
        logger.info("Result : " + sum);
        return sum;
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operator;
        double num1, num2, result;

        System.out.println("Choose an operator: +, -, *, /");
        operator = scanner.next().charAt(0);

        System.out.println("Enter first number:");
        num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("The result of " + num1 + " + " + num2 + " is: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("The result of " + num1 + " - " + num2 + " is: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("The result of " + num1 + " * " + num2 + " is: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The result of " + num1 + " / " + num2 + " is: " + result);
                } else {
                    System.out.println("Error! Division by zero.");
                }
                break;

            default:
                System.out.println("Error! Operator is not correct.");
                break;
        }
        
        scanner.close();
    }
}

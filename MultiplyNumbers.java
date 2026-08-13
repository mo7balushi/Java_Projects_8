package Java_Projects_8;

import java.util.Scanner;
public class MultiplyNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();
        int result = multiply(firstNumber, secondNumber);
        System.out.println("Result: " + result);
        input.close();
    }
    public static int multiply(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return 0;
        }
        if (secondNumber < 0) {
            return -multiply(firstNumber, -secondNumber);
        }
        return firstNumber + multiply(firstNumber, secondNumber - 1);
    }
}
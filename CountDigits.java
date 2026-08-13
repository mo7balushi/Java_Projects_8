package Java_Projects_8;

import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter positive number: ");
        int number = input.nextInt();
        if (number < 0) {
            number = -number;
        }
        System.out.println("Number of digits: " + countDigits(number));
        input.close();
    }
    public static int countDigits(int number) {
        if (number < 10) {
            return 1;
        }
        return 1 + countDigits(number / 10);
    }
}
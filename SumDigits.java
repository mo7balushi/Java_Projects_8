package Java_Projects_8;
import java.util.Scanner;
public class SumDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        if (number < 0) {
            number = -number;
        }
        System.out.println("Sum of digits: " + sumDigits(number));
        input.close();
    }

    public static int sumDigits(int number) {
        if (number == 0) {
            return 0;
        }
        return number % 10 + sumDigits(number / 10);
    }
}
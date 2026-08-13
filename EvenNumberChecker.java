package Java_Projects_8;
import java.util.Scanner;
public class EvenNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        if (number < 0) {
            number = -number;
        }
        System.out.println("Even number: " + isEven(number));
        input.close();
    }
    public static boolean isEven(int number) {
        if (number == 0) {
            return true;
        }
        if (number == 1) {
            return false;
        }
        return isEven(number - 2);
    }
}
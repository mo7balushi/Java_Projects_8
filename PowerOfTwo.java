package Java_Projects_8;
import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        System.out.println("Power of two: " + isPowerOfTwo(number));
        input.close();
    }
    public static boolean isPowerOfTwo(int number) {
        if (number == 1) {
            return true;
        }
        if (number <= 0 || number % 2 != 0) {
            return false;
        }
        return isPowerOfTwo(number / 2);
    }
}
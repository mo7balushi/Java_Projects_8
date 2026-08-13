package Java_Projects_8;
import java.util.Scanner;
public class PrintNumbersUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        printUp(number);
        input.close();
    }
    public static void printUp(int number) {
        if (number <= 0) {
            return;
        }
        printUp(number - 1);
        System.out.println(number);
    }
}
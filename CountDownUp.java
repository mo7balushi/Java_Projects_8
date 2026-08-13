package Java_Projects_8;

import java.util.Scanner;
public class CountDownUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        countDownUp(number);
        input.close();
    }
    public static void countDownUp(int number) {
        if (number <= 0) {
            return;
        }
        System.out.println(number);
        countDownUp(number - 1);
        if (number != 1) {
            System.out.println(number);
        }
    }
}
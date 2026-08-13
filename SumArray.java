package Java_Projects_8;

import java.util.Scanner;
public class SumArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = input.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number: ");
            numbers[i] = input.nextInt();
        }
        System.out.println("Array sum: " + sumArray(numbers, 0));
        input.close();
    }
    public static int sumArray(int[] numbers, int index) {
        if (index == numbers.length) {
            return 0;
        }
        return numbers[index] + sumArray(numbers, index + 1);
    }
}
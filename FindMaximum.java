package Java_Projects_8;

import java.util.Scanner;
public class FindMaximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = input.nextInt();
        if (size <= 0) {
            System.out.println("Invalid size");
            input.close();
            return;
        }
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number: ");
            numbers[i] = input.nextInt();
        }
        System.out.println("Maximum number: " + findMax(numbers, 0));
        input.close();
    }
    public static int findMax(int[] numbers, int index) {
        if (index == numbers.length - 1) {
            return numbers[index];
        }
        int maximum = findMax(numbers, index + 1);
        if (numbers[index] > maximum) {
            return numbers[index];
        }
        return maximum;
    }
}
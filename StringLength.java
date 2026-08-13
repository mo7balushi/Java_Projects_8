package Java_Projects_8;

import java.util.Scanner;
public class StringLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.nextLine();
        System.out.println("String length: " + findLength(text));
        input.close();
    }
    public static int findLength(String text) {
        if (text.isEmpty()) {
            return 0;
        }
        return 1 + findLength(text.substring(1));
    }
}
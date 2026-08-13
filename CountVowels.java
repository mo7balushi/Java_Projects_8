package Java_Projects_8;

import java.util.Scanner;
public class CountVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.nextLine().toLowerCase();
        System.out.println("Vowel count: " + countVowels(text));
        input.close();
    }
    public static int countVowels(String text) {
        if (text.isEmpty()) {
            return 0;
        }
        char letter = text.charAt(0);
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            return 1 + countVowels(text.substring(1));
        }
        return countVowels(text.substring(1));
    }
}
package Java_Projects_8;

import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = input.nextLine();
        System.out.println("Palindrome: " + isPalindrome(word));
        input.close();
    }
    public static boolean isPalindrome(String word) {
        if (word.length() <= 1) {
            return true;
        }
        if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return false;
        }
        return isPalindrome(word.substring(1, word.length() - 1));
    }
}
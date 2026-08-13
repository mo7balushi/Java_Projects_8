package Java_Projects_8;
import java.util.Scanner;
public class CountCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.nextLine();
        System.out.print("Enter character: ");
        char letter = input.next().charAt(0);
        System.out.println("Character count: " + countChar(text, letter));
        input.close();
    }
    public static int countChar(String text, char letter) {
        if (text.isEmpty()) {
            return 0;
        }
        if (text.charAt(0) == letter) {
            return 1 + countChar(text.substring(1), letter);
        }
        return countChar(text.substring(1), letter);
    }
}
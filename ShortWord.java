
import java.io.IOException;
import java.util.Scanner;

public class ShortWord {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any word:");
        String userInput = scanner.nextLine();
        char[] result = userInput.toCharArray();

        System.out.println("Your entered word is: " + userInput + "\n" +
                "This word consists of " + userInput.length() + " characters.\n" +
                "Enter number of character that you want to see: ");
        int numberOf = scanner.nextInt();
        System.out.println("Selected character is: " + result[numberOf - 1]);

        System.out.println("Your word is spelled backwards:");
        for (int i = 1; i <= userInput.length(); i++) {
            System.out.print(result[userInput.length() - i]);
        }
    }
}
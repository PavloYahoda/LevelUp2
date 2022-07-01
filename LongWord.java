
import java.util.Scanner;

public class LongWord {
    public static void main(String[] args) {

        String word = "абстрагирование";
        char[] array = word.toCharArray();

        Scanner userInput = new Scanner(System.in);

        System.out.println("Our word is \"абстрагирование\". " +
                "Enter the beginning of the interval, k:");
        int k = userInput.nextInt();
        System.out.println("Enter the end of the interval, s:");
        int s = userInput.nextInt();
        System.out.println("Our word after changing is:");
        int i;
        for (i = 0; i < k; i++) {
            System.out.print(array[i]);
        }
        int count = 0;
        for (i = k; i <= s - 2; i++) {
            System.out.print(array[s - 2 - count]);
            count++;
        }
        for (i = s - 1; i < word.length(); i++){
            System.out.print(array[i]);
        }
    }
}


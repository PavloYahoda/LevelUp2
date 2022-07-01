
import java.io.IOException;
import java.io.InputStreamReader;

public class Phrase {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        int read;
        System.out.println("Введите ваше предложение:");
        while ((read = inputStreamReader.read()) != -1) {
            char ch = (char) read;
            if (ch == 1077) {
                ch = 1080;
            }
            if (ch == '\n') {
                break;
            }
            System.out.print(ch);
        }
    }
}


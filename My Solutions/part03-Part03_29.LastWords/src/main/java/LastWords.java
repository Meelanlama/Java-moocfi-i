
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String value = scanner.nextLine();
            if (value.equals("")) {
                break;
            }
            String[] arrayOfWords = value.split(" ");
            System.out.println(arrayOfWords[arrayOfWords.length - 1]); //Printing the last words
        }
    }
}

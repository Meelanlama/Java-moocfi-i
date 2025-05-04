
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] array = input.split(" "); //Splitting input in the array
            System.out.println(array[0]); // Print array of first index
        }
    }
}

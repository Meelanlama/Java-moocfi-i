
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int count = 0;

        while (true) {
            input = scanner.nextLine();
            count++; // Taking data of how much string words is added and counting it.

            if (input.equals("end")) {
                break;
            }
        }
        System.out.println(count - 1);
    }
}


import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            array = input.split(" ");
            //Using for each loop to iterate the array
            for (String text : array) {
                if (text.contains("av")) {
                    System.out.println(text);
                } //end of for loop
            } //end of while loop
        }
    }
}

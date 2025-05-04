
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Initialising the variable with initial value 0
        int sum = 0, count = 0;
        // Empty string
        String longestName = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] array = input.split(",");
            // Adding the value of index 1(year) in sum
            sum = sum + Integer.valueOf(array[1]);
            // Adding the count of value each time sum is added with another value
            count++;

            // Initialising the name variable with the value of index 0 of array
            String name = String.valueOf(array[0]);
            // Using length method to check if first name is larger then in initial
            // name(empty) we declared
            if (name.length() > longestName.length()) {
                // variable value is of index[0] until it stops checking
                longestName = array[0];
            }
        }
        // Printings
        System.out.println("Longest name:" + longestName);
        if (count > 0) {
            System.out.println("Average age of the birth years:" + (1.0 * sum / count));
        } else {
            System.out.println("No average here");
        }
    }
}

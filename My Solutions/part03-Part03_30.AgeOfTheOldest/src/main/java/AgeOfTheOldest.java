
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] array = input.split(","); // Splitting input in an array
            int age = Integer.valueOf(array[1]); // Getting the age in index 1 in array and comparing it with initial oldest
            if (age > oldest) {
                oldest = age;
            }
        }
        System.out.println("Age of the oldest:" + oldest);
    }
}

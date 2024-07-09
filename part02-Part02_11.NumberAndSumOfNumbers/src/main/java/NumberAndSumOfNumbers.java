
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaring variables 
        int count = 0, sum = 0, input;

        while (true) {
            System.out.println("Give a number:");
            input = Integer.valueOf(scanner.nextLine());

            // If number is 0 loop breaks and end
            if (input == 0) {
                break;
            }

            // If the given input is not equal to 0 then count of number is increased by 1 and sum is added with given input,
            if (input != 0) {
                sum += input;
                count++;
            }
        }  // End of while loop

        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);
    }
}

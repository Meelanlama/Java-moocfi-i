
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        //Creating object
        Statistics allNum = new Statistics();
        Statistics evenNum = new Statistics();
        Statistics oddNum = new Statistics();

        //Start of while loop
        while (true) {
            System.out.println("Enter numbers:");
            int value = Integer.valueOf(scanner.nextLine());
            // If the input is -1 then loop breaks and prints other wise it adds the number
            if (value == -1) {
                System.out.println("Sum: " + allNum.sum());
                System.out.println("Sum of even numbers: " + evenNum.sum());
                System.out.println("Sum of odd numbers: " + oddNum.sum());
                break;
            } else {
                allNum.addNumber(value);
            } // end of if

            if (value % 2 == 0) {
                evenNum.addNumber(value);
            } else {
                oddNum.addNumber(value);
            }
        } // End of while loop

    }
}

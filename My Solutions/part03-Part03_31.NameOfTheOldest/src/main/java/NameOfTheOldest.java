
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Initialising the variable here
        int oldest = 0;
        String oldestName = ""; // Empty string variable

        while (true) {
            String input = scanner.nextLine();
            //If input is empty
            if (input.isEmpty()) {
                break;
            }

            //Initialising array and splitting the input in this
            String[] array = input.split(",");
            int age = Integer.valueOf(array[1]); //Value of age variable is of array 1 which is age
            if (age > oldest) {
                oldest = age;
                oldestName = array[0]; // if the age is oldest then the value of oldestName is in array index 0 and initialise it with this value
            }
        }
        System.out.println("Name of the oldest:" + oldestName);
    }
}


import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Initialising the array here
        String[] array;
        
        //While loop always run as condition is true
        //Taking input from user
        //Checks if the input is empty or not otherwise it breaks out of loop
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            //spliting the array with the input
            array = input.split(" ");  //Space is necessary
            
            for (int i = 0; i < array.length; i++) {
               //Iterating and printing 
                System.out.println(array[i]);
            }  //End of for loop
        } // End of while loop
    }
}

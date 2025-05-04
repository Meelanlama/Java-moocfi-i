
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        //For storing if the number has been found in line
        int lines = 0;
        //Creating scanner for reading the file
        try ( Scanner sc = new Scanner(Paths.get(file))) {
            // Reading all the lines of file
            while (sc.hasNextLine()) {
                // converting the string into int
                int line = Integer.valueOf(sc.nextLine());
                //Checking the condition and if number is found then lines is increased by 1
                if (lowerBound <= line && upperBound >= line) {
                    lines++;
                }
            } // End of while loop
        } catch (Exception e) {
            System.out.println("Error: File not found!");
        }
        System.out.println("Numbers: "+lines);
    }
}

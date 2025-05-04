
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         // Declaring the variables and assigning user input to them
        int firstNum = Integer.valueOf(scanner.nextLine());
        int secNum = Integer.valueOf(scanner.nextLine());
        int sum = firstNum + secNum;
        
        // Identifying the operation and declaring a variable for the result
        double squareRoot = Math.sqrt(sum);

        System.out.println(squareRoot);
    }
}

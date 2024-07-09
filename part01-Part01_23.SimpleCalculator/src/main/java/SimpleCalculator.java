
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        // Type casting int to double
        //results stored 
        int add = (first + second);
        int diff = (first - second);
        int multi = (first * second);
        double divide = (double) (first) / (second);
        
        // Printing result
        System.out.println((first) + " + " + (second) + " = " + (add));
        System.out.println((first) + " - " + (second) + " = " + (diff));
        System.out.println((first) + " * " + (second) + " = " + (multi));
        System.out.println((first) + " / " + (second) + " = " + (divide));
    }
}

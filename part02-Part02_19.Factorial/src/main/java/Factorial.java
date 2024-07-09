
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int number = scanner.nextInt();
        int multiply = 1;
        
        for (int i = 1;  i<=number;  i++){
            multiply *= i;
        }
        System.out.println("The sum is" + multiply);
    }
}

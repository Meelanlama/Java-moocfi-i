
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaring the variables and assigning user input to them
        int num = Integer.valueOf(scanner.nextLine());

        //conditional operation to check
        if (num < 0) {
            System.out.println(num * -1);
        } else {
            System.out.println(num);
        }
    }
}

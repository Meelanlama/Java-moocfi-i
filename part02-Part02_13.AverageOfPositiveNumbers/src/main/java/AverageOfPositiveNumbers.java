
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0, count = 0, number;

        while (true) {
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }
            if (number > 0) {
                count++;
                sum += number;
            }
        }  // End of while loop

        if (count == 0) {
            System.out.println("Cannot calculate the average");
        }

        System.out.println((double) sum / count);
    }
}

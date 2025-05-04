
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0, even = 0, odd = 0;
        double avg;

        while (true) {
            System.out.println("Give numbers:");
            int number = scanner.nextInt();

            //PART 1
            if (number == -1) {
                break;
            }

            //PART 2,3,4
            if (number > 0) {
                sum += number;
                count++;
            }

            //PART 5 (Even Odd)
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }  // End of while loop
        
        //declaring avg value
        avg = 1.0 * sum / count;

        System.out.println("Thx! Bye!");
        System.out.println("Sum:" + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}


import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(3, 9);
    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        //Loop through the numbers
        for (int i = beginning; i <= end; i++) {
            //Check if it is divisible by 3
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}

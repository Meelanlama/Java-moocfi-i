
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0, count = 0, number;
       
        while (true) {
            System.out.println("Give a number:");
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }
            
            if(number!=0){
                sum += number;
                count++;
            }
        }
        System.out.println("Average of the numbers: " + (double)sum / count);
    }
}

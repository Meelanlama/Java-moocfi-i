
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year: ");
        int year = Integer.valueOf(scan.nextLine());
        
        // Year should be divisible by 4 and should not be divisible by 100(For years)  OR year should be divisible by 400 and 100 to be leap year(Century)
        if (year % 4 ==0 && year%100 !=0 || year%100 ==0 && year %400==0) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}


import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        System.out.println("From where?");
        int num1 = scanner.nextInt();
        
        System.out.println("To where?");
        int num2 = scanner.nextInt();
        
        System.out.println(numbers.get(num1)); 
        System.out.println(numbers.get(num2));
        
        // Suggested solution
//        while(num2 >= num1){
//            int number = numbers.get(num1);
//            System.out.println(number);
//            num1++;
//        }
    }
}

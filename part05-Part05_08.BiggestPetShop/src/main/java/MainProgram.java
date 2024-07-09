
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pet lucy = new Pet("Lucy", "Golden retriever");
        Person leo = new Person("Leo", lucy);
        Person test = new Person();

        System.out.println(leo);
        System.out.println(test);
    }
}

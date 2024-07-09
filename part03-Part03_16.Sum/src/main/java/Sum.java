
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-2);
        System.out.println(sum(numbers));
    }

    public static int sum(ArrayList<Integer> list) {
        int total = 0;
        for (int number : list) {
            total = total + number;
        }
        return total;
    }
}

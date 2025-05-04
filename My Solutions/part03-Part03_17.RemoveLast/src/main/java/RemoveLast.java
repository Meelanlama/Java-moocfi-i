
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");
        strings.add("Fourth");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }

    public static void removeLast(ArrayList<String> strings) {
        // If the value is 0 then it should return void
        if (strings.size() == 0) {
            return;
        }
        // To remove the elements from last string
        strings.remove(strings.size() - 1);
    }
}

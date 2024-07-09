
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = { 5, 1, 3, 4, 2, 9 };
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            System.out.print(number);
            // Print number and checks this condition if its true
            // As array length is 5 and we minus 1 from it so it becomes 4
            // i checks the condition and runs within it reaches 3
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
    }
}


import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        // int[] array = {17, 3, 1, 3, 99, 3, 12};
        // int[] array = {6, 3, 0, -1, 4};
        // int[] array = {-1, 3, 1, 2};
        int[] array = { -18, -5, 6, 1, 7, 1, 3, 7, 5 };
        // int[] array = {3, 5, 6, 2, 7, 1, 3, 7, -12};
        // int[] array = {8, 3, 7, 9, 1, 2, 4};

        // System.out.println("Smallest: " + MainProgram.smallest(array));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
        // System.out.println(MainProgram.indexOfSmallestFrom(array, 3));
        // System.out.println(Arrays.toString(array));
        // MainProgram.swap(array, 1, 0);
        // System.out.println(Arrays.toString(array));
        // MainProgram.swap(array, 0, 3);
        // System.out.println(Arrays.toString(array));
        // MainProgram.sort(array);
        // System.out.println("Sorting of array");
        // System.out.println(Arrays.toString(array));
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i <= array.length - 1; i++) {
            int check = array[i];
            if (smallest > check) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = -1;
        for (int i = 0; i < array.length - 1; i++) {
            int check = array[i];
            if (smallest > check) {
                smallest = array[i];
            }
            if (smallest == array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = array[startIndex];
        int index = -1;
        for (int i = startIndex; i <= array.length - 1; i++) {
            int check = array[i];
            if (smallest > check) {
                smallest = array[i];
            }
            if (smallest == array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        // Storing the value of array[index1] in temp variable
        int temp = array[index1];

        // Assigning the value of array[index2] to array[index1];
        array[index1] = array[index2];

        // Assisgning the value of index1 stored in temp to index2;
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallestIndex = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, i, smallestIndex);
            // System.out.println(Arrays.toString(array));
        }
    }
}

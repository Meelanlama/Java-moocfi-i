
public class StarSign {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    // you can print one star with the command
    // System.out.print("*");
    // call the print command n times
    // in the end print a line break with the comand
    // System.out.println("");
    public static void printStars(int number) {
        // first part of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        // second part of the exercise
        for (int i = 0; i < size; i++) {
            //   printStars(size);
            // can be done this way with the help of nested loop or call printStars method which is same
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        for (int i = 0; i < height; i++) {
            //      printStars(width);
            // Nested loop/ can be done this way too
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        for (int i = 0; i < size; i++) {
            //   printStars(i);

            // Nested loop or simply call method above and pass i as parameter
//            //For  using nested loop in outer for loop set i = 0; and j= 0; too
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

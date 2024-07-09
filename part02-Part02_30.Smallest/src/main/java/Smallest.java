
public class Smallest {

    public static int smallest(int number1, int number2) {
        // Write some code here
        // don't print anything inside this method
        // there must be a return in the end of the method
        if (number1 < number2) { // if condiition for checking smallest number and returning small number
            return number1;
        } else {
            return number2;
        } // if its false then returning greater number
    }

    public static void main(String[] args) {
        int result = smallest(2, 7); // Passing the argument in method
        System.out.println("Smallest: " + result);
    }
}

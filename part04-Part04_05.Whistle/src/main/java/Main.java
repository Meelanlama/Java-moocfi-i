
public class Main {

    public static void main(String[] args) {
        // This is just an empty main method you can use to test
        // the Whistle class. Try for example:
        
        //Creating a new object and passing sound as argument to constructor
        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");
        
        //Calling method sound to print it
        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();

    }
}


public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        
        Counter test = new Counter(7);
        test.increase(7);
        System.out.println(test.value());
    }
}

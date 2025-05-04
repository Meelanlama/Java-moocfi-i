
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message test = new Message("Milan", "Hello world");
        MessagingService testing = new MessagingService();
        testing.add(test);
        System.out.println(testing.getMessages());

    }
}

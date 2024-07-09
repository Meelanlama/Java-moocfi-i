
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
        PaymentCard paulCard = new PaymentCard(20);
        PaymentCard mattCard = new PaymentCard(30);

        paulCard.eatHeartily();
        System.out.println("Paul: " + paulCard);

        mattCard.eatAffordably();
        System.out.println("Matt: " + mattCard);

        paulCard.addMoney(20);
        System.out.println("Paul: " + paulCard);

        mattCard.eatHeartily();
        System.out.println("Matt: " + mattCard);

        paulCard.eatAffordably();
        paulCard.eatAffordably();
        System.out.println("Paul: " + paulCard);

        mattCard.addMoney(50);
        System.out.println("Matt: " + mattCard);

//        card.eatHeartily();
//        System.out.println(card);
//
//        card.eatHeartily();
//        System.out.println(card);
//        card.addMoney(-15);
//        System.out.println(card);
//        card.addMoney(10);
//        System.out.println(card);
//        
//        card.addMoney(200);
//        System.out.println(card);
    }
}

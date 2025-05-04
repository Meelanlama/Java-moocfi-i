
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!
        Item book = new Item("The lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

//        System.out.println("The book's name: " + book.getName());
//        System.out.println("The book's weight: " + book.getWeight());
//        System.out.println("Book: " + book);
//        System.out.println("Phone: " + phone);
        Suitcase suitcase = new Suitcase(10);
//        System.out.println(suitcase);

        suitcase.addItem(book);
//        System.out.println(suitcase);

        suitcase.addItem(phone);
//        System.out.println(suitcase);

//        suitcase.addItem(brick);
//        System.out.println(suitcase);
//        suitcase.printItems();
//
//        Item heavy = suitcase.heaviestItem();
//        System.out.println("Heaviest item: " + heavy);
        Suitcase milanSuitCase = new Suitcase(6);
        milanSuitCase.addItem(brick);

        Hold hold = new Hold(500);
        hold.addSuitcase(suitcase);
        hold.addSuitcase(milanSuitCase);

        System.out.println(hold);
        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
    }
}

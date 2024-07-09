
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Meelan
 */
public class UserInterface {

    private Scanner scan;
    private BirdDatabase database;

    public UserInterface(Scanner scan) {
        this.scan = scan;
        this.database = new BirdDatabase();
    }

    public void start() {
        while (true) {
            System.out.println("?");
            String cmd = scan.nextLine();

            if (cmd.equals("Quit")) {
                return;
            } else if (cmd.equals("Add")) {
                System.out.println("Name: ");
                String name = scan.nextLine();
                System.out.println("Name in Latin: ");
                String latin = scan.nextLine();
                this.database.add(new Bird(name, latin));
            } else if (cmd.equals("Observation")) {
                System.out.println("Bird?");
                String name = scan.nextLine();
                this.database.increaseObservations(name);
            } else if (cmd.equals("All")) {
                this.database.printAll();
            } else if (cmd.equals("One")) {
                System.out.println("Bird?");
                String name = scan.nextLine();
                this.database.printOne(name);
            }
        }
    }
}

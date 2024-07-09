
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

    private Scanner scanner;
    private JokeManager funnyJokes;

    public UserInterface(JokeManager funnyJokes, Scanner scanner) {
        this.funnyJokes = funnyJokes;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");

            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            }
            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String add = scanner.nextLine();
                funnyJokes.addJoke(add);
                continue;
            }
            if (command.equals("2")) {
                System.out.println(funnyJokes.drawJoke());
                continue;
            }
            if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                funnyJokes.printJokes();
                continue;
            }
        }
    }
}

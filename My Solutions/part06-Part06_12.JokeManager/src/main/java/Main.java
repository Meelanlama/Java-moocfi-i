
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
public class Main {

    public static void main(String[] args) {
        JokeManager manager = new JokeManager();
        manager.addJoke("What is red and smells of blue paint? - Red paint.");
        manager.addJoke("What is blue and smells of red paint? - Blue paint.");
        manager.addJoke("Test joke");
        manager.addJoke("Test 2 joke");
//
//        System.out.println("Drawing jokes:");
//        for (int i = 0; i < 5; i++) {
//            System.out.println(manager.drawJoke());
//        }
//
//        System.out.println("");
//        System.out.println("Printing jokes:");
//        manager.printJokes();

           System.out.println(manager.drawJoke());
        Scanner scanner = new Scanner(System.in);

//        UserInterface ui = new UserInterface(manager, scanner);
//        ui.start();
    }
}

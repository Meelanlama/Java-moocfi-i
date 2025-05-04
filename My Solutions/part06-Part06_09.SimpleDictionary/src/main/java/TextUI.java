
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
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.print("Command:");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
                //return; can use both as break terminated loop while return terminates method
            }
            if (command.equals("add")) {
                System.out.print("Word:");
                String word = scanner.nextLine();
                System.out.print("Translation:");
                String translation = scanner.nextLine();
                this.dictionary.add(word, translation);
                continue;
            }
            if (command.equals("search")) {
                System.out.print("To be translated:");
                String translatedWord = scanner.nextLine();
                if (this.dictionary.translate(translatedWord) == null) {
                    //  System.out.println("null");
                    System.out.println("Word " + translatedWord + " was not found");
                    continue;
                }
                System.out.println(this.dictionary.translate(translatedWord));
                continue;
            }
            System.out.println("Unknown command");
            continue;
        }
    }
}

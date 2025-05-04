/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meelan
 */
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private ArrayList<String> words;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.words = new ArrayList<String>();
    }

    public void start() {
        while (true) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            if (alreadyEntered(word)) {
                break;
            }
            // adding the word to the list of previous words
            this.words.add(word);
        }
        for (String wordPrint : this.words) {
            System.out.println(wordPrint);
        }
        System.out.println("You gave the same word twice!");
    }

    public boolean alreadyEntered(String word) {
        return this.words.contains(word);
//        if (word.equals("end")) {
//            return true;
//        }
//        return false;
    }
}

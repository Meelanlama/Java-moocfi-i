/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meelan
 */
public class Quantifier {

    public static void main(String[] args) {
        String string = "You have to accidentally delete de the whole meme";

        if (string.matches("You have to accidentally (delete )?de the whole meme")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }
    }

}

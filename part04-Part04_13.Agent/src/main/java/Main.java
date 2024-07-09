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

        Agent bond = new Agent("James", "Bond");
        Agent ionic = new Agent("Ionic", "Bond");

        bond.toString(); // Prints nothing
        System.out.println(bond);
        System.out.println(ionic);
    }
}

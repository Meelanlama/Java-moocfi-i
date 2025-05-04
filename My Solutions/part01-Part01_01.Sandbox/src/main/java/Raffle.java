
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Meelan
 */
public class Raffle {

    public static void main(String[] args) {
        Random rdm = new Random();

        for (int i = 0; i < 10; i++) {
            //random number
            int randomNumber = rdm.nextInt(10);
            System.out.println(randomNumber);
        }
    }
}

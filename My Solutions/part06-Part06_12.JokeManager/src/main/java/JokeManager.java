
import java.util.ArrayList;
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
public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            //Creating a instance of Random. It is used to generate random numbers.
            Random draw = new Random();
            // Generates a random Integer within the range from 0 to size of jokes list.
            //It's done using the nextInt(int bound) method of the Random class. 
            int index = draw.nextInt(jokes.size());
            return this.jokes.get(index);
        }
    }

    public void printJokes() {
        for (String print : this.jokes) {
            System.out.println(print);
        }
    }
}


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Meelan
 */
public class BirdDatabase {

    private ArrayList<Bird> birds;

    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }

    public void add(Bird name) {
        this.birds.add(name);
    }

    public void printAll() {
        for (Bird all : this.birds) {
            System.out.println(all);
        }
    }

    public void printOne(String birdName) {
        for (Bird bird : this.birds) {
            if (bird.getName().equals(birdName)) {
                System.out.println(bird);
            }
        }
    }

    public void increaseObservations(String nameOfBird) {
        for (Bird bird : this.birds) {
            if (bird.getName().equals(nameOfBird)) {
                bird.increaseObservations();
                return;
            }
        }
        System.out.println("Not a bird!");
    }
}

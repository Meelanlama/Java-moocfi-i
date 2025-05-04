
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
public class Weather {

    private Random random;

    public Weather() {
        this.random = new Random();
    }

    public String forecast() {
        double probability = this.random.nextDouble();

        if (probability <= 0.1) {
            return "It rains";
        } else if (probability <= 0.4) {
            return "It snows";
        } else { // 1.0 - 0.4 = 0.6
            return "It sunshine";
        }
    }

    public int makeAForeCast() {
        return (int) (4 * this.random.nextGaussian() - 3);
    }
}

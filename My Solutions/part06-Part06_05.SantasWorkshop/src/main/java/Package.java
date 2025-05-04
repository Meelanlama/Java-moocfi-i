
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
public class Package {

    private ArrayList<Gift> gifts;

    public Package() {
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }

    public int totalWeight() {
        int countWeight = 0;
        for (Gift weights : gifts) {
            countWeight += weights.getWeight();
        }
        return countWeight;
    }
}

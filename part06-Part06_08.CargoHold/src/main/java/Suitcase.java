
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
public class Suitcase {

    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        int totalWeight = 0;
        for (Item weight : this.items) {
            totalWeight += weight.getWeight();
        }
        if (totalWeight + item.getWeight() <= this.maximumWeight) {
            this.items.add(item);
        }
    }

    public void printItems() {
        for (Item printItems : this.items) {
            System.out.println(printItems);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item weight : this.items) {
            totalWeight += weight.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item objectHeavy = this.items.get(0);
        for (int i = 0; i < this.items.size(); i++) {
            Item currentObject = this.items.get(i);
            if (objectHeavy.getWeight() < currentObject.getWeight()) {
                objectHeavy = currentObject;
            }
        }
        return objectHeavy;
    }

    public String toString() {
        int totalWeight = 0;
        int numOfItems = 0;
        for (Item weight : this.items) {
            numOfItems++;
            totalWeight += weight.getWeight();
        }
        if (numOfItems == 0) {
            return "no items  (" + totalWeight + "kg)";
        } else if (numOfItems == 1) {
            return "1 item (" + totalWeight + "kg)";
        }
        return numOfItems + " items(" + totalWeight + "kg)";
    }
}


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
public class Hold {

    private int maxmWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxmWeight) {
        this.maxmWeight = maxmWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalSuitWeight = 0;
        for (Suitcase weights : this.suitcases) {
            totalSuitWeight += weights.totalWeight();
        }
        if (totalSuitWeight + suitcase.totalWeight() <= maxmWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase printSuitCase : this.suitcases) {
            printSuitCase.printItems();
        }
    }

    public String toString() {
        int totalWeights = 0;
        int numOfSuitCases = 0;
        for (Suitcase weights : this.suitcases) {
            numOfSuitCases++;
            totalWeights += weights.totalWeight();
        }
        if (numOfSuitCases == 0) {
            return numOfSuitCases + " suitcase " + "(" + totalWeights + "kg)";
        } else if (numOfSuitCases == 1) {
            return numOfSuitCases + " suitcase " + "(" + totalWeights + "kg)";
        }
        return numOfSuitCases + " suitcases " + "(" + totalWeights + "kg)";
    }
}

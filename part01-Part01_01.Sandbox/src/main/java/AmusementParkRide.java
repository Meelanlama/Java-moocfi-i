
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
public class AmusementParkRide {

    private String name;
    private int lowestHeight;
    private int visitors;
    private ArrayList<Person> riding;

    public AmusementParkRide(String name, int lowestHeight) {
        this.name = name;
        this.lowestHeight = lowestHeight;
        this.riding = new ArrayList<>();
    }

    public boolean allowedToRide(Person person) {
        if (person.getHeight() < this.lowestHeight) {
            return false;
        }
        this.visitors++;
        this.riding.add(person);
        return true;
    }

    public void removeEveryoneOnRide() {
        this.riding.clear();
    }

    public double averageHeight() {
        if (riding.isEmpty()) {
            return 0;
        }
        int sumHeight = 0;
        for (Person sum : riding) {
            sumHeight += sum.getHeight();
        }
        return 1.0 * sumHeight / riding.size();
    }

    public Person getTallest() {
        // Returning a null reference if no one has taken the ride
        if (this.riding.isEmpty()) {
            return null;
        }
        // Here, creating an object reference for the object to be returned
        // its first value is the first object on the list
        Person returnObject = this.riding.get(0);

        //for each loop to go through the list
        for (Person prsn : this.riding) {
            //Comparing the each object on riding list
            // to return the object we compare height

            if (returnObject.getHeight() < prsn.getHeight()) {
                returnObject = prsn;
            }
        }

        return returnObject;
    }

    public String toString() {
        //Creating a string from all the people on the list
//        String onTheRide = "";
//        for (Person person : riding) {
//            onTheRide = onTheRide + person.getName() + "\n"; //adding the people to the list who took ride from riding arraylist
//        }
//        return this.name + ", minimum height: " + this.lowestHeight + ", visitors: " + this.visitors + "\n" + "Riding:\n" + onTheRide;

        String printOutput = this.name + ", minimum height requirement: " + this.lowestHeight + ", visitors: " + this.visitors + "\n";

        if (riding.isEmpty()) {
            return printOutput + "no one is on the ride.";
        }

        String onTheRide = "";

        for (Person person : riding) {
            onTheRide = onTheRide + person.getName() + "\n";
        }

        return printOutput + "\n"
                + "on the ride:\n" + onTheRide;
    }

}

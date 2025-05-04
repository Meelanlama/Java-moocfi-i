
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
public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        return this.persons.isEmpty();
    }

    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }
        Person objectReturn = this.persons.get(0);
        for (Person printing : this.persons) {
            if (objectReturn.getHeight() > printing.getHeight()) {
                objectReturn = printing;
            }
        }
        this.persons.remove(objectReturn);
        return objectReturn;
    }

    public Person take() {
        //if the persons list is empty then returning null
        if (this.persons.isEmpty()) {
            return null;
        }
        // creating object reference to return the value of other object
        // first value is first object 
        Person objectRemove = this.persons.get(0);
        for (Person printing : this.persons) {
            if (objectRemove.getHeight() > printing.getHeight()) {
                objectRemove = printing;
            }
        }
        // by iterating through loop we found shortest person which is stored in objectRemove and removing it using.remove
        this.persons.remove(objectRemove);
        return objectRemove;
    }

    //**Other type to remove shortestPerson**
    // Iterate through the remaining persons to find the shortest person
    // Person shortestPerson = this.persons.get(0);
    // Iterate through the remaining persons to find the shortest person
//    for(int i = 1; i< this.persons.size(); i++){
//Person currentPerson = this.persons.get(i);
//if(currentPerson.getHeight() < shortestPerson.getHeight()){
//shortestPerson = currentPerson;
//}
//}
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
}

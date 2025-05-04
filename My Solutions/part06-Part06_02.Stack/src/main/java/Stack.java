/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meelan
 */
import java.util.ArrayList;

public class Stack {

    private ArrayList<String> list;

    public Stack() {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public void add(String value) {
        this.list.add(value);
    }

    public ArrayList<String> values() {
        return list;
    }

    //returns the topmost value (i.e., the last value added to the deque) and removes it from the stack.
    public String take() {
        String latestValue = this.list.get(list.size() - 1); // Storing the value of latest entry in String, .get() fetches the value from list as we need to fetch the value of latest entry so the latest entry is stored in last index of list so list.size()-1 is last index; 
        this.list.remove(list.size() - 1); // now after fetching the latest value, we need to remove it
        return latestValue;
    }
}


import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        // if the elements in list is empty then returning null
        if (this.elements.isEmpty()) {
            return null;
        }

        // creating an object reference for the object to be returned
        // first value is the first object on the list
        String returnObject = this.elements.get(0);

        // iterating through the for each loop
        for (String obj : this.elements) {
            // comparing the length of each object on the list
            if (returnObject.length() < obj.length()) {
                returnObject = obj; // if the object length is greater then assiginingit to object reference;
            }
        }
        return returnObject;
    }
}

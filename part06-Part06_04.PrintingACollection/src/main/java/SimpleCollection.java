
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

    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        int listSize = this.elements.size();
        String message = "";
        if (listSize > 1) {
            message = "The collection " + this.name + " has " + listSize + " elements:";
        } else {
            message = "The collection " + this.name + " has " + 1 + " element:";
        }

        String listName = "";
        for (String name : this.elements) {
            listName = listName + "\n" + name;
        }
        return message + listName;
    }
}

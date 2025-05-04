
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal) {
        if (!(meals.contains(meal))) {
            this.meals.add(meal);
        }
    }

    public void printMeals() {
        for(String printMeal : meals){
            System.out.println(printMeal);
        }
    }
    
    public void clearMenu(){
    this.meals.clear();
    }
}

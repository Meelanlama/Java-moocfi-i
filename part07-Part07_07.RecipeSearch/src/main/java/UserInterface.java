
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Meelan
 */
public class UserInterface {

    private Scanner myScan;
    //Creating arraylist of Recipe to store the txt file
    private ArrayList<Recipe> recipeBook;

    public UserInterface(Scanner myScan) {
        this.myScan = myScan;
        this.recipeBook = new ArrayList<>();
    }

    public void start() {
        System.out.println("Files to read: ");
        String fileName = this.myScan.nextLine();
        this.readFile(fileName);
        while (true) {
            System.out.println("Commands:\n"
                    + "list- lists the recipes\n"
                    + "stop - stops the program\n"
                    + "find name - searches recipes by name\n"
                    + "find cooking time - searches recipes by cooking time\n"
                    + "find ingredient - searches recipes by ingredient\n");
            System.out.println("Enter command:");
            String command = myScan.nextLine();

            if (command.equals("stop")) {
                return;
            } else if (command.equals("list")) {
                this.printingList();
            } else if (command.equals("find name")) {
                this.searchName();
            } else if (command.equals("find cooking time")) {
                this.findTime();
            } else if (command.equals("find ingredient")) {
                this.findIngredients();
            }
        }
    }

    // Reading the txt file given as input from the user
    public void readFile(String readFile) {
        try ( Scanner fileRead = new Scanner(Paths.get(readFile))) {
            String nameOfRecipe = ""; // storing the name,time and ingredients empty at first
            int time = 0;
            ArrayList<String> ingredients = new ArrayList<>();

            // at first,the name is set to true and other false as it reads the file line by line
            boolean isName = true;
            boolean isCookingTime = false;
            boolean isIngredients = false;

            while (fileRead.hasNextLine()) {
                String readLine = fileRead.nextLine();

                // true so one line name is read and cooking set true and cooking time read
                if (isName) {
                    nameOfRecipe = readLine;
                    isName = false;
                    isCookingTime = true;
                } else if (isCookingTime) {
                    time = Integer.valueOf(readLine); // converting from string to integer
                    isCookingTime = false;
                    isIngredients = true;
                    // ingredients is set to true and line is not empty then all the lines will be added in arraylist
                } else if (isIngredients && !readLine.isEmpty()) { 
                    ingredients.add(readLine);
                    // after all ingredients is over and line is empty then again name is set to true to continue for other recipe
                } else if (readLine.isEmpty() || readLine.equals("") || readLine.equals(" ")) {
                    isIngredients = false;
                    isName = true;
                    //After all recipe is read then adding to arraylist by creating new object of Recipe
                    recipeBook.add(new Recipe(nameOfRecipe, time, ingredients));
                    //and reset the arraylist to store new ingredients
                    ingredients = new ArrayList<>();
                }
            }
            //incase, adding the last recipe in the file as it doesnot ends with empty line
            recipeBook.add(new Recipe(nameOfRecipe, time, ingredients));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void printingList() {
        System.out.println("Recipes:\n");
        for (Recipe list : this.recipeBook) {
            System.out.println(list);
        }
        System.out.println("");
    }

    public void searchName() {
        System.out.println("Searched word: ");
        String search = myScan.nextLine();
        System.out.println("Recipes:\n");
        for (Recipe recipe : this.recipeBook) {
            if (recipe.getName().contains(search)) {
                System.out.println(recipe);
            }
        }
    }

    public void findTime() {
        System.out.println("Max cooking time: ");
        int time = Integer.valueOf(myScan.nextLine());
        System.out.println("Recipes: ");
        for (Recipe recipe : this.recipeBook) {
            if (recipe.getTime() <= time) {
                System.out.println(recipe);
            }
        }
    }

    public void findIngredients() {
        System.out.println("Ingredient: ");
        String search = myScan.nextLine();

        System.out.println("Recipes: ");
        // Iterating through recipe list outer loop and then inner loop iterates through ingredients list
        for (Recipe recipe : this.recipeBook) {
            for (String ingredients : recipe.getIngredients()) {
                if (ingredients.equals(search)) {
                    System.out.println(recipe);
                }
            }
        }
    }
}

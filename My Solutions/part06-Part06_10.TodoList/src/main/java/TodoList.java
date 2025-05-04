
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
public class TodoList {

    private ArrayList<String> workToDo;

    public TodoList() {
        this.workToDo = new ArrayList<>();
    }

    public void add(String task) {
        this.workToDo.add(task);
    }

    public void print() {
        for (int i = 0; i <= workToDo.size() - 1; i++) {
            System.out.println(i + 1 + ": " + workToDo.get(i));
        }
    }

    public void remove(int number) {
        if (number >= 0 && number < workToDo.size()) {
            this.workToDo.remove(number - 1);
        }
    }
}

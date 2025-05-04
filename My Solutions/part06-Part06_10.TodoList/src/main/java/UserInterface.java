
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

    private TodoList lists;
    private Scanner scanner;

    public UserInterface(TodoList lists, Scanner scanner) {
        this.lists = lists;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command:");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                return;
            }
            if(command.equals("add")){
                System.out.print("To add:");
                String addList = scanner.nextLine();
                this.lists.add(addList);
                continue;
            }
            if(command.equals("list")){
            this.lists.print();
            continue;
            }
            if(command.equals("remove")){
                System.out.print("Which one is removed?:");
                int number = scanner.nextInt();
                this.lists.remove(number);
                continue;
            }
        }
    }
}


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

    private Scanner scan;
    private ArrayList<Integer> lists;

    public UserInterface(Scanner scanner) {
        this.scan = scanner;
        this.lists = new ArrayList<>();
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int number = this.scan.nextInt();
            if (number == -1) {
                System.out.println("Point average (all): " + this.average());
                System.out.println("Point average (passing): " + this.passingAverage());
                if (this.passPercentage() > 0) {
                    System.out.println("Pass percentage: " + this.passPercentage());
                } else {
                    System.out.println("Pass percentage: -");
                }
                this.printGrade();
                break;
            }

            //adding the number[0-100] only in lists
            if (number >= 0 && number <= 100) {
                this.lists.add(number);
            }
        }
    }

    public double average() {
        int sum = 0;
        for (int numbers : this.lists) {
            sum += numbers;
        }
        return 1.0 * sum / this.lists.size();
    }

    //For the passing average number should be greater than 50, if its > 50 than, adding to sumof pass and increase counter by 1.
    public double passingAverage() {
        int passSum = 0;
        int passCount = 0;
        for (int numbers : this.lists) {
            if (numbers >= 50) {
                passSum += numbers;
                passCount++;
            }
        }
        return 1.0 * passSum / passCount;
    }

    public double passPercentage() {
        int passCount = 0;
        for (int numbers : this.lists) {
            if (numbers >= 50) {
                passCount++;
            }
        }
        return 100.00 * passCount / this.lists.size();
    }

    public void printGrade() {
        System.out.println("Grade distribution:");
        System.out.print("5: ");
        for (int numbers : this.lists) {
            if (numbers >= 90) {
                System.out.print("*");
            }
        }
        System.out.print("\n4: ");
        for (int numbers : this.lists) {
            if (numbers < 90 && numbers >= 80) {
                System.out.print("*");
            }
        }
        System.out.print("\n3: ");
        for (int numbers : this.lists) {
            if (numbers < 80 && numbers >= 70) {
                System.out.print("*");
            }
        }
        System.out.print("\n2: ");
        for (int numbers : this.lists) {
            if (numbers < 70 && numbers >= 60) {
                System.out.print("*");
            }
        }
        System.out.print("\n1: ");
        for (int numbers : this.lists) {
            if (numbers < 60 && numbers >= 50) {
                System.out.print("*");
            }
        }
        System.out.print("\n0: ");
        for (int numbers : this.lists) {
            if (numbers < 50) {
                System.out.print("*");
            }
        }
    }
}

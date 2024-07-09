
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
public class GradeUserInterface {

    private Scanner scanner;
    private GradeRegister register;

    public GradeUserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        System.out.println("");
        printGradeDistribution();
    }

    public void readPoints() {
        while (true) {
            System.out.println("Points: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            int points = Integer.valueOf(input);

            if (points < 0 || points > 100) {
                System.out.println("Impossible number.");
                continue;
            }

            this.register.addGradeBasedOnPoints(points);
        }
    }

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.println(grade + ": ");
            printStars(stars);
            System.out.println("");
            grade--;
        }
    }

    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.println("*");
            stars--;
        }
    }
}

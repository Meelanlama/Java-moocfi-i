
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name:");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }  // End of if  statement

            System.out.println("Duration:");
            int time = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(name, time));
        }  // End of while loop

        System.out.println("Program's maximum duration?");
        int timeInput = scanner.nextInt();

        // FOR EACH for printing
        for (TelevisionProgram info : programs) {
            if (info.getDuration() <= timeInput) {
                System.out.println(info);
            }
        }
    }
}

//Suggested solution
//         int index = 0;
//        while (index < programs.size()) {
//            if (programs.get(index).getDuration() <= maxDuration) {
//                System.out.println(programs.get(index));
//            }
//            index++;
//        }


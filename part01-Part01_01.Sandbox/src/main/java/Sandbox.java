
import java.util.ArrayList;
import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        // Write your program here
        //ARRAY
//        Scanner scanner = new Scanner(System.in);
//        String[] arrayOfStrings = {"Matti L.", "Matti P.", "Matti V."};
//        double[] arrayOfFloatingpoints = {1.20, 3.14, 100.0, 0.6666666667};
//
//        for (int i = 0; i < arrayOfFloatingpoints.length; i++) {
//            System.out.println(arrayOfStrings[i] + " " + arrayOfFloatingpoints[i]);
        //    }

//        Person pekka = new Person("Pekka");
//        Person antti = new Person("Antti");
//
//        int i = 0;
//        while (i < 30) {
//            pekka.growOlder();
//            i = i + 1;
//        }
//
//        antti.growOlder();
//
//        System.out.println("");
//        
//        System.out.println(antti); // same as System.out.println(antti.toString());
//        
//        if (antti.isOfLegalAge()) {
//            System.out.println(antti.getName() + " is of legal age ");
//        } else {
//            System.out.println(antti.getName() + " is underage ");
//        }
//
//        if (pekka.isOfLegalAge()) {
//            System.out.println(pekka.getName() + " is of legal age ");
//        } else {
//            System.out.println(pekka.getName() + " is under age ");
//        }
//        Person matti = new Person("Matti");
//        Person juhana = new Person("Juhana");
//
//        matti.setHeight(180);
//        matti.setWeight(86);
//
//        juhana.setHeight(175);
//        juhana.setWeight(64);
//
//        System.out.println(matti.getName() + ", body mass index is " + matti.bodyMassIndex());
//        System.out.println(juhana.getName() + ", body mass index is " + juhana.bodyMassIndex());
//        ArrayList<Person> persons = new ArrayList<>();
//
//        System.out.println("Enter details, eg: milan , 20");
//        while (true) {
//            System.out.println("Enter the details, empty will stop: ");
//            String details = scanner.nextLine();
//            if (details.isEmpty()) {
//                break;
//            }
//
//            String[] parts = details.split(",");
//            String name = parts[0];
//            int age = Integer.valueOf(parts[1]);
//            persons.add(new Person(name, age));
//        } //End of while loop
//
//        System.out.println();
//        System.out.println("Total number of persons: " + persons.size());
//
//        for (Person info : persons) {
//            System.out.println(info);
//        }
//    }
//}
//Reading files
//ArrayList<String> lines = new ArrayList<>();
//
//try(Scanner sc = new Scanner(Paths.get("text.txt"))) {
//    while(scanner.hasNextLine()){
//    lines.add(scanner.hasNextLine());
//} catch (Exception e){
//    sout("Error: " + e.getMessage());
//}
//        Person milan = new Person("Milan Tamang");
//        System.out.println(milan);
//        
//        Person test = milan;
//        test.growOlder();
//        test.growOlder();
//        
//        System.out.println(test);
//        System.out.println(milan);
//        
//        milan = new Person("Milan Lama");
//        System.out.println(milan);
//        System.out.println(test);
//        
//        test = null;
//        System.out.println(test);
//        test.getAge();
        // Person test2= milan;
        // System.out.println(test2);
        /////
//        Person matt = new Person("Matt");
//        matt.setHeight(170);
//        matt.setWeight(86);
//
//        Person jasper = new Person("Jasper");
//        jasper.setHeight(136);
//        jasper.setWeight(50);
//
//        Person milan = new Person("Milan");
//        milan.setHeight(192);
//
//        AmusementParkRide waterTrack = new AmusementParkRide("Water track", 140);
//        System.out.println(waterTrack);
//
//        if (waterTrack.allowedToRide(jasper)) {
//            System.out.println(jasper.getName() + " may enter the ride");
//        } else {
//            System.out.println(jasper.getName() + " may not enter the ride");
//        }
//
//        if (waterTrack.allowedToRide(matt)) {
//            System.out.println(matt.getName() + " may enter the ride");
//        } else {
//            System.out.println(matt.getName() + " may not enter the ride");
//        }
//
//        waterTrack.allowedToRide(milan);
//        
//        System.out.println(waterTrack);
//        System.out.println(waterTrack.getTallest().getName());
//        Person tallest = waterTrack.getTallest();
//        System.out.println(tallest.getName());
//    }
//        SimpleDate date = new SimpleDate(29, 7, 2002);
//        Person milan = new Person("Milan Tamang", date);
//        Person ram = new Person("Ram Lama", 7, 9, 1997);
//        System.out.println(milan);
//        System.out.println(ram);
//
//        SimpleDate d1 = new SimpleDate(12, 2, 2002);
//        SimpleDate d2 = new SimpleDate(21, 2, 2011);
//
//        System.out.println(d1 + " is earlier than " + d2 + ": " + d1.before(d2));
//        System.out.println(d2 + " is earlier than " + d1 + ": " + d2.before(d1));
//        Scanner scanner = new Scanner(System.in);
//        UserInterface userInterface = new UserInterface(scanner);
//        userInterface.start();
        GradeRegister register = new GradeRegister();
        register.addGradeBasedOnPoints(90);
        register.addGradeBasedOnPoints(86);
        
        //CHECKING THE GRADE STORED
        System.out.println("Number of students with grade 4 (should be 1): " + register.numberOfGrades(4));
        System.out.println("Number of students with grade 5 (should be 1): " + register.numberOfGrades(5));

    }
}

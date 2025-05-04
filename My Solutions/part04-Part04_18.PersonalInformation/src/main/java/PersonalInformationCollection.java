
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("First name:");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Last name:");
            String lastname = scanner.nextLine();

            System.out.println("Identification number:");
            String identi = scanner.nextLine();

            infoCollection.add(new PersonalInformation(name, lastname, identi)); // Adding the data using object of list
                                                                                 // and making new object
        } // end of while loop

        // Printing using for each loop
        for (PersonalInformation person : infoCollection) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }
    }
}


import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        boolean isFound = false;
        String row = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try ( Scanner sc = new Scanner(Paths.get(file))) {
            while (sc.hasNextLine()) {
                row = sc.nextLine();

                if (searchedFor.equals(row)) {
                    isFound = true;
                }  // end of if
            } // end of while
            if (isFound) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}

//Suggested 
// ArrayList<String> list = new ArrayList<>();
//        // implement reading the file here.
//        try (Scanner fileReader = new Scanner(Paths.get(file))) {
//            while (fileReader.hasNextLine()) {
//                list.add(fileReader.nextLine());
//            }
//        } catch (Exception e) {
//            System.out.println("Reading the file " + file + " failed.");
//        }
// 
//        System.out.println("");
// 
//        System.out.println("Enter names, an empty line quits.");
//        while (true) {
//            String name = scanner.nextLine();
//            if (name.isEmpty()) {
//                break;
//            }
// 
//            if (list.contains(name)) {
//                System.out.println("The name is on the list.");
//            } else {
//                System.out.println("The name is not on the list.");
//            }
//        }
// 
//        System.out.println("Thank you!");

import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try ( Scanner sc = new Scanner(Paths.get(file))) {
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                
                //Creating an array parts and splitting data of the file seprated by ,
                String[] parts = data.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                //Printing
                System.out.println(name + "," + "age:" + age + " years");
            } // end of while
        } catch (Exception e) {
            System.out.println("Error: " + file + " not found.");
        }
    }
}

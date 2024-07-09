
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        //Here we create a scanner for reading the file with path
        try ( Scanner sc = new Scanner(Paths.get("data.txt"))) {
            
          // Reading the files from file until all the lines have been read
            while (sc.hasNextLine()) {
                // Here reading the one line
                String data = sc.nextLine();
                //Printing the data of text file
                System.out.println(data);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

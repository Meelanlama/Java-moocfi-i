
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String input = sc.nextLine();

        // Scanner for reading the file
        try ( Scanner scanner = new Scanner(Paths.get(input))) {

            // Reading data line by line  in file until all data have been read
            while (scanner.hasNextLine()) {
                // read one line
                String data = scanner.nextLine();
                System.out.println(data);
            }
        } catch (Exception e) {
            System.out.println("Execption: " + e.getMessage());
        }

    }
}

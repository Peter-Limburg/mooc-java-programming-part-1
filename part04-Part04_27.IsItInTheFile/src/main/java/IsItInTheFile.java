
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();



// example relic:

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
// to retrieve the heart of gueston
            boolean found = false;
            while (fileScanner.hasNextLine()) {
                // to read the lines in gueston if (file.contains(searchedFor)) {
                //                    System.out.println("Found!");
                String line = fileScanner.nextLine();
                if (line.contains(searchedFor)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        }
         catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }



        }


    }



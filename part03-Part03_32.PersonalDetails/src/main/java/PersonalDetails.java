
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = "";
        int nameSize = 0;
        int count = 0;
        int sum = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");

            count += 1;
            int nameLength = pieces[0].length();
            if (nameLength > nameSize) {
                nameSize = nameLength;
                name = pieces[0];
            }

            sum += Integer.valueOf(pieces[1]);

        }

        System.out.println("Longest name: " + name);
        double average = 1.0 * sum / count;
        System.out.println("Average of the birth years: " + average);


    }
}


import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());

            if (value == 0) {
                break;
            } else {
                number = number + 1;
                sum = sum + value;
            }
        }
        double average = 1.0 * sum / number;
        System.out.println("Average of the numbers: " + average);
    }
}

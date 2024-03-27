
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());

            if (value == 0) {
                break;
            }

            if (value > 0) {
                number = number + 1;
                sum = sum + value;
            }
        }

        if (number <= 0) {
            System.out.println("Cannot calculate the average");
        }
        if (number > 0) {
            double average = 1.0 * sum / number;
            System.out.println(average);
        }


    }
}

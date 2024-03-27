
import java.util.Scanner;

public class NumberAndSumOfNumbers {

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
        System.out.println("Number of numbers: " + number);
        System.out.println("Sum of the numbers: " + sum);
    }
}


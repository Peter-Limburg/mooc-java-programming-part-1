
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            numbers.add(input);
        }

        int i = 0; int sum = 0;
        for (i = 0; i < numbers.size(); i++) {
            int digit = numbers.get(i);
            sum += digit;
        }
        System.out.println("Average: " + 1.0*sum/numbers.size());
    }
}

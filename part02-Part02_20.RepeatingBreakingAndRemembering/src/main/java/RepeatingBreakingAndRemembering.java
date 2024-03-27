
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int i = 0;
        int even = 0;
        System.out.println("Write numbers:");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            sum += number;
            i++;
            if (number % 2 == 0) {
                even++;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + i);
        System.out.println("Average: " + (1.0*sum/i));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + (i - even));
    }
}

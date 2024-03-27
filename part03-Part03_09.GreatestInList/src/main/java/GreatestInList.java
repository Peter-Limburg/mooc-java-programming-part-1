
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");


        int biggest = list.get(0);
        int i = 0;

        for (i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (number > biggest) {
                biggest = number;
            }
        }
        System.out.println(biggest);
    }
}

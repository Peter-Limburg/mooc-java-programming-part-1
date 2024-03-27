
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();


        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            numbers.add(number);
            if (number == 9999) {
                break;
            }
        }

        int i = 0;
        int smallestIndex = 0;
        int smallest = numbers.get(0);
        for (i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (smallest > number) {
                smallest = number;
                smallestIndex = i;
            }
        }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Smallest index: " + smallestIndex);
        System.out.println("Thank you, my good sir. By the power of friendship.");
//        for (i = 0; i < numbers.size(); i++){
//            int digit = numbers.get(i);
//            if (digit == smallest) {
//                break;
//            }
//        }
//        System.out.println("Found at index: " + i);

    }
}

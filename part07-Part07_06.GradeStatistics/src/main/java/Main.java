
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> pointList = new ArrayList<>();
        ArrayList<Integer> passingList = new ArrayList<>();
        int total = 0;

        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            if (input >= 0 && input <= 100) {
                pointList.add(input);
                total += input;
                if (input >= 50) {
                    passingList.add(input);
//                    passingTotal += input;
                }
            }
        }


        PointCalculator pointCalculator = new PointCalculator(pointList, passingList);
        double allAvg = pointCalculator.calculateAverages(pointList);
        double passAvg = pointCalculator.calculateAverages(passingList);
        double passPercent = 100 * ((double) passingList.size() / pointList.size());

        System.out.println("Point average (all): " + allAvg);
        System.out.println("Point average (passing): " + passAvg);
        System.out.println("Pass percentage: " + passPercent);
        pointCalculator.distribution();
    }
}














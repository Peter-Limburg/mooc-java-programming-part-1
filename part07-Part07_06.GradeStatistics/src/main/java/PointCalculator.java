import java.util.ArrayList;
import java.util.Scanner;

public class PointCalculator {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Integer> pointList;
    private ArrayList<Integer> passingList;
    int[] gradeDist = new int[6];

    public PointCalculator(ArrayList<Integer> pointList, ArrayList<Integer> passingList) {
        this.pointList = pointList;
        this.passingList = passingList;
    }


    public double calculateAverages(ArrayList<Integer> list) {
        double total = 0;
        for (int num : list) {
            total += num;
        }
        return total / list.size();
    }

    public void distribution() {


        for (int piece : pointList) {
            if (piece < 50) {
                gradeDist[0]++;
            } else if (piece < 60) {
                gradeDist[1]++;
            } else if (piece < 70) {
                gradeDist[2]++;
            } else if (piece < 80) {
                gradeDist[3]++;
            } else if (piece < 90) {
                gradeDist[4]++;
            } else if (piece <= 100) {
                gradeDist[5]++;
            }
        }

        for (int i = 0; i < gradeDist.length; i++) {
            int count = gradeDist[i];
            System.out.print(i + ": ");
            if (count > 0) {
                for (int j = 0; j < count; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
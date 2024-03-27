
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        double giftValue = Integer.valueOf(scan.nextLine());
        if (giftValue < 5000) {
            System.out.println("No tax!");
        } else if (giftValue >= 5000 && giftValue <= 25000) {
            double tax = 100 + ((giftValue - 5000) * .08);
            System.out.println("Tax: " + tax);
        } else if (giftValue > 25000 && giftValue <= 55000) {
            double tax = 1700 + ((giftValue - 25000) * .1);
            System.out.println("Tax: " + tax);
        }  else if (giftValue > 55000 && giftValue <= 200000) {
            double tax = 4700 + ((giftValue - 55000) * .12);
            System.out.println("Tax: " + tax);
        }  else if (giftValue > 200000 && giftValue <= 1000000) {
            double tax = 22100 + ((giftValue - 200000) * .15);
            System.out.println("Tax: " + tax);
        }  else if (giftValue > 1000000) {
            double tax = 142100 + ((giftValue - 1000000) * .17);
            System.out.println("Tax: " + tax);
        }


    }
}

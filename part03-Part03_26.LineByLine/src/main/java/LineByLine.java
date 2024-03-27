
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(" ");
            int i = 0;
            for (i = 0; i < pieces.length; i++) {
                System.out.println(pieces[i]);
            }
        }
    }
}
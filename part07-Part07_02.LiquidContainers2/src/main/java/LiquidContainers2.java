
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container con1 = new Container();
        Container con2 = new Container();

        while (true) {
            System.out.println("First: "+ con1.getVolume() + "/100");
            System.out.println("Second: "+ con2.getVolume() + "/100");

            String input = scan.nextLine();

            String[] parts = input.split(" ");
            if (parts.length == 1) {
                    if (parts[0].equals("quit")) {
                        break;
                    }
                } else {
                    String command = parts[0];
                    int amount = Integer.valueOf(parts[1]);
                    switch (command) {
                        case "add":
                           con1.add(amount);
                            break;
                        case "move":
                          int toMove = Math.min(con1.getVolume(), amount);
                            con2.add(toMove);
                            con1.remove(toMove);
                            break;
                        case "remove":
                            con2.remove(amount);
                    }
                }

            }
    }

}

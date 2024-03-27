
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<Item> items = new ArrayList<>();

        //class of Item with two var
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            // Check if item with same id already exists
            boolean found = false;
            for (Item item : items) {
                if (item.getIdentifier().equals(id)) {
                    found = true;
                }
            }
            if (!found) {
                items.add(new Item(id, name));
            }
        }

        for (Item item : items) {
                System.out.println(item.getIdentifier() + ": " + item.getName());
            }
        }
    }



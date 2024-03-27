import java.util.Scanner;
public class UserInterface {

    private TodoList toDoList;

    private Scanner scanner;

    public UserInterface(TodoList toDoList, Scanner scanner) {
        this.toDoList = toDoList;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.println("Command:");
            String input = scanner.nextLine();

            if (input.equals("stop")) {
                break;
            } else if (input.equals("add")) {
                System.out.println("To add:");
                String next = scanner.nextLine();
                toDoList.add(next);
            } else if (input.equals("list")) {
                toDoList.print();
            } else if (input.equals("remove")) {
                System.out.println("Which one is removed?");
                int gonerID = Integer.valueOf(scanner.nextLine());
                toDoList.remove(gonerID);
            }


        }

    }


}

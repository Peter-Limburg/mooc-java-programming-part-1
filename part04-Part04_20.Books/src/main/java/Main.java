//import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Title:");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year:");
            int year = Integer.valueOf(scanner.nextLine());
            books.add(new Book(title, pages, year));
        }
        System.out.println("What information will be printed?");
        String answer = scanner.nextLine();
        if (answer.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        } else if (answer.equals("everything")){
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

}


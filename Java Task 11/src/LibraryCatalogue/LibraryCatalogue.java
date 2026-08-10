package LibraryCatalogue;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalogue {

    /*
     * Abstraction is provided by the LibraryItem interface.
     * Encapsulation is provided by private fields and validated setters.
     */

    public static void main(String[] args) {
        LibraryCatalogue app = new LibraryCatalogue();
        app.run();
    }

    private void run() {

        List<LibraryItem> catalogue = new ArrayList<>();

        System.out.println("--- Single item created at startup ---");

        Book firstBook = new Book();
        firstBook.setTitle("Clean Code");
        firstBook.setAuthor("Robert Martin");
        firstBook.setPages(464);

        firstBook.printAllInfo();

        catalogue.add(firstBook);

        boolean exit = false;

        while (!exit) {

            System.out.println("\n--- LIBRARY MENU ---");
            System.out.println("1. Add book");
            System.out.println("2. Add magazine");
            System.out.println("3. Print all");
            System.out.println("4. Count");
            System.out.println("5. Exit");

            int choice = Integer.parseInt(
                    IO.readln("Choose: ")
            );

            switch (choice) {

                case 1:
                    catalogue.add(addBook());
                    System.out.println("Added.");
                    break;

                case 2:
                    catalogue.add(addMagazine());
                    System.out.println("Added.");
                    break;

                case 3:
                    printAll(catalogue);
                    break;

                case 4:
                    System.out.println(
                            "Total items: " + catalogue.size()
                    );
                    break;

                case 5:
                    exit = true;
                    System.out.println("Goodbye.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private Book addBook() {

        Book book = new Book();

        book.setTitle(
                IO.readln("Enter title: ")
        );

        book.setAuthor(
                IO.readln("Enter author: ")
        );

        book.setPages(
                Integer.parseInt(
                        IO.readln("Enter pages: ")
                )
        );

        return book;
    }

    private Magazine addMagazine() {

        Magazine magazine = new Magazine();

        magazine.setName(
                IO.readln("Enter magazine name: ")
        );

        magazine.setIssueNumber(
                Integer.parseInt(
                        IO.readln("Enter issue number: ")
                )
        );

        magazine.setMonth(
                IO.readln("Enter month: ")
        );

        return magazine;
    }

    private void printAll(List<LibraryItem> catalogue) {

        int number = 1;

        for (LibraryItem item : catalogue) {

            System.out.print(number + ". ");
            item.printAllInfo();

            number++;
        }
    }
}
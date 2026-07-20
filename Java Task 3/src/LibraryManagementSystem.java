import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {

    public static void main(String[] args) {

            // Declare variables
            int choice;
            String bookName;

            // Create lists
            List<String> bookNames = new ArrayList<>();
            List<String> authorNames = new ArrayList<>();
            List<Boolean> availabilityStatus = new ArrayList<>();


            // Add books
            bookNames.add("Java Programming");
            authorNames.add("James Gosling");
            availabilityStatus.add(true);

            bookNames.add("Clean Code");
            authorNames.add("Robert C. Martin");
            availabilityStatus.add(true);

            bookNames.add("The Hobbit");
            authorNames.add("J.R.R. Tolkien");
            availabilityStatus.add(false);

            bookNames.add("Harry Potter");
            authorNames.add("J.K. Rowling");
            availabilityStatus.add(true);

            bookNames.add("Database Systems");
            authorNames.add("Thomas Connolly");
            availabilityStatus.add(true);

            bookNames.add("Computer Networks");
            authorNames.add("Andrew Tanenbaum");
            availabilityStatus.add(false);

            bookNames.add("Operating Systems");
            authorNames.add("Abraham Silberschatz");
            availabilityStatus.add(true);

            bookNames.add("Data Structures");
            authorNames.add("Mark Allen Weiss");
            availabilityStatus.add(true);

            bookNames.add("Artificial Intelligence");
            authorNames.add("Stuart Russell");
            availabilityStatus.add(false);

            bookNames.add("Software Engineering");
            authorNames.add("Ian Sommerville");
            availabilityStatus.add(true);

        }


    // Loop to keep displaying menu until user selects Exit
    do {

        IO.println("\n===== Library Management System =====");
        IO.println("1: Display all books");
        IO.println("2: Search for a book");
        IO.println("3: Borrow a book");
        IO.println("4: Return a book");
        IO.println("5: Display library report");
        IO.println("6: Exit");

        choice = Integer.parseInt(IO.readln("Enter your choice: "));


        // Menu options using switch case
        switch (choice) {

            case 1:
                IO.println("Display all books selected");
                break;


            case 2:
                IO.println("Search for a book selected");
                break;


            case 3:
                IO.println("Borrow a book selected");
                break;


            case 4:
                IO.println("Return a book selected");
                break;


            case 5:
                IO.println("Display library report selected");
                break;


            case 6:
                IO.println("Exiting Library System...");
                break;


            default:
                IO.println("Invalid choice. Please try again.");

        }


    }   while (choice != 6);



    // Method to display all books
    public static void displayBooks(List<String> bookNames,
                                    List<String> authorNames,
                                    List<Boolean> availabilityStatus) {

        IO.println("\n===== All Books =====");

        // Loop through all books
        for (int i = 0; i < bookNames.size(); i++) {

            IO.println("--------------------");
            IO.println("Book Name: " + bookNames.get(i));
            IO.println("Author: " + authorNames.get(i));

            String status = availabilityStatus.get(i) ? "Available" : "Unavailable";

            IO.println("Status: " + status);
        }
    }
    }


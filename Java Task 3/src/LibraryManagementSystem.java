import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        // Declare variables
        int choice;
        String bookName;


        // Create lists to store book information
        List<String> bookNames = new ArrayList<>();
        List<String> authorNames = new ArrayList<>();
        List<Boolean> availabilityStatus = new ArrayList<>();


        // Add 10 books to the lists
        bookNames.add("Java Programming");
        authorNames.add("James Gosling");
        availabilityStatus.add(true);

        bookNames.add("Clean Code");
        authorNames.add("Robert Martin");
        availabilityStatus.add(true);

        bookNames.add("The Hobbit");
        authorNames.add("J.R.R Tolkien");
        availabilityStatus.add(false);

        bookNames.add("Harry Potter");
        authorNames.add("J.K Rowling");
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



        // Display menu until user selects exit
        do {

            IO.println("\n===== Library Management System =====");
            IO.println("1: Display all books");
            IO.println("2: Search for a book");
            IO.println("3: Borrow a book");
            IO.println("4: Return a book");
            IO.println("5: Display library report");
            IO.println("6: Exit");


            choice = Integer.parseInt(IO.readln("Enter your choice: "));


            // Menu using switch case
            switch (choice) {


                case 1:

                    displayBooks(bookNames, authorNames, availabilityStatus);

                    break;


                case 2:

                    bookName = IO.readln("Enter book name to search: ");

                    searchBook(bookName, bookNames, authorNames, availabilityStatus);

                    break;


                case 3:

                    bookName = IO.readln("Enter book name to borrow: ");

                    borrowBook(bookName, bookNames, availabilityStatus);

                    break;


                case 4:

                    bookName = IO.readln("Enter book name to return: ");

                    returnBook(bookName, bookNames, availabilityStatus);

                    break;


                case 5:

                    displayReport(bookNames, availabilityStatus);

                    break;


                case 6:

                    IO.println("Exiting system...");

                    break;


                default:

                    IO.println("Invalid choice.");

            }


        } while (choice != 6);


    }



    // Method to display all books
    public static void displayBooks(List<String> bookNames,
                                    List<String> authorNames,
                                    List<Boolean> availabilityStatus) {


        IO.println("\n===== Books List =====");


        for (int i = 0; i < bookNames.size(); i++) {


            IO.println("----------------------");

            IO.println("Book Name: " + bookNames.get(i));

            IO.println("Author: " + authorNames.get(i));

            IO.println("Status: " +
                    (availabilityStatus.get(i) ? "Available" : "Unavailable"));

        }

    }



    // Method to search for a book
    public static void searchBook(String bookName,
                                  List<String> bookNames,
                                  List<String> authorNames,
                                  List<Boolean> availabilityStatus) {


        boolean found = false;


        for (int i = 0; i < bookNames.size(); i++) {


            if (bookNames.get(i).equalsIgnoreCase(bookName)) {


                IO.println("\nBook Found");

                IO.println("Name: " + bookNames.get(i));

                IO.println("Author: " + authorNames.get(i));

                IO.println("Status: " +
                        (availabilityStatus.get(i)
                                ? "Available"
                                : "Unavailable"));


                found = true;

                break;

            }

        }


        if (!found) {

            IO.println("Book not found.");

        }

    }



    // Method to borrow a book
    public static void borrowBook(String bookName,
                                  List<String> bookNames,
                                  List<Boolean> availabilityStatus) {


        for (int i = 0; i < bookNames.size(); i++) {


            if (bookNames.get(i).equalsIgnoreCase(bookName)) {


                if (availabilityStatus.get(i)) {


                    availabilityStatus.set(i, false);

                    IO.println("Book borrowed successfully.");


                } else {


                    IO.println("Book is unavailable.");

                }


                return;

            }

        }


        IO.println("Book not found.");

    }



    // Method to return a book
    public static void returnBook(String bookName,
                                  List<String> bookNames,
                                  List<Boolean> availabilityStatus) {


        for (int i = 0; i < bookNames.size(); i++) {


            if (bookNames.get(i).equalsIgnoreCase(bookName)) {


                availabilityStatus.set(i, true);

                IO.println("Book returned successfully.");

                return;

            }

        }


        IO.println("Book not found.");

    }



    // Method to count books
    public static int countBooks(List<Boolean> availabilityStatus,
                                 boolean status) {


        int count = 0;


        for (boolean available : availabilityStatus) {


            if (available == status) {

                count++;

            }

        }


        return count;

    }



    // Method to display library report
    public static void displayReport(List<String> bookNames,
                                     List<Boolean> availabilityStatus) {


        int availableBooks = countBooks(availabilityStatus, true);

        int unavailableBooks = countBooks(availabilityStatus, false);


        IO.println("\n===== Library Report =====");

        IO.println("Total Number of Books: " + bookNames.size());

        IO.println("Available Books: " + availableBooks);

        IO.println("Unavailable Books: " + unavailableBooks);

    }

}
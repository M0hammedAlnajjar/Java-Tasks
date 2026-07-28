import java.util.HashMap;
import java.util.HashSet;

public class LibraryBookTracker {


    public static void main() {
        // Create HashSet to store unique book IDs
        HashSet<Integer> bookIds = new HashSet<>();

        // Create HashMap to store book IDs and titles
        HashMap<Integer, String> bookTitles = new HashMap<>();


// Declare variables
        String n = IO.readln("Enter number of books: ");
        int numberOfBooks = Integer.parseInt(n);

        int bookId;
        String bookTitle;
        int searchBookId;
        String libraryClassification;
// Check if number of books is valid
        if (numberOfBooks <= 0) {

            System.out.println("Invalid number of books.");

        } else {

            // Read book records
            for (int i = 0; i < numberOfBooks; i++) {

                String id = IO.readln("Enter book ID " + (i + 1) + ": ");
                bookId = Integer.parseInt(id);

                bookTitle = IO.readln("Enter book title: ");
// Check if book ID already exists
                if (bookIds.contains(bookId)) {

                    System.out.println("Duplicate Book ID. Record not added.");
    }
            } else {

                // Add book ID to HashSet
                bookIds.add(bookId);

                // Add ID and title to HashMap
                bookTitles.put(bookId, bookTitle);

            }


            // Search for a book
            String searchId = IO.readln("Enter book ID to search: ");
            searchBookId = Integer.parseInt(searchId);
            // Check if book exists
            if (bookTitles.containsKey(searchBookId)) {

                System.out.println("Book ID: " + searchBookId);
                System.out.println("Book Title: " + bookTitles.get(searchBookId));

            } else {

                System.out.println("Book not found.");

            }

            // Classify library size
            if (bookIds.size() < 5) {

                libraryClassification = "Small Library";

            } else if (bookIds.size() <= 10) {

                libraryClassification = "Medium Library";

            } else {

                libraryClassification = "Large Library";

            }


            // Display library report
            System.out.println("\n----- Library Book Report -----");
            System.out.println("Total book records entered: " + numberOfBooks);
            System.out.println("Total unique books: " + bookIds.size());
            System.out.println("All book IDs: " + bookIds);
            System.out.println("Book IDs with titles: " + bookTitles);
            System.out.println("Library classification: " + libraryClassification);


        }
}

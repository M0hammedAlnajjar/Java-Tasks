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

        }
}

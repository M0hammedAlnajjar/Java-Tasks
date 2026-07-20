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
    }


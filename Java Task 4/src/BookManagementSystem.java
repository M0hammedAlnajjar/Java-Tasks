import java.util.ArrayList;

public class LibraryBookManagementSystem {

    public static void main(String[] args) {

        // Create ArrayLists
        ArrayList<String> bookTitles = new ArrayList<>();
        ArrayList<String> authors = new ArrayList<>();
        ArrayList<Boolean> availability = new ArrayList<>();

        // Add book data
        bookTitles.add("Java Programming");
        authors.add("James");
        availability.add(true);

        bookTitles.add("Python Basics");
        authors.add("Robert");
        availability.add(false);

        bookTitles.add("Database Systems");
        authors.add("Thomas");
        availability.add(true);

        bookTitles.add("Web Development");
        authors.add("Sarah");
        availability.add(true);

        bookTitles.add("Computer Networks");
        authors.add("Andrew");
        availability.add(false);

        bookTitles.add("Data Structures");
        authors.add("Mark");
        availability.add(true);

        bookTitles.add("Artificial Intelligence");
        authors.add("David");
        availability.add(false);

        bookTitles.add("Software Engineering");
        authors.add("John");
        availability.add(true);

        bookTitles.add("Operating Systems");
        authors.add("William");
        availability.add(true);

        bookTitles.add("Cyber Security");
        authors.add("Michael");
        availability.add(false);


        // Display Book Information
        System.out.println("Library Book List");
        System.out.println("-----------------");

        for (int i = 0; i < bookTitles.size(); i++) {

            System.out.println("Book " + i + ":");
            System.out.println("Title: " + bookTitles.get(i));
            System.out.println("Author: " + authors.get(i));
            System.out.println("Available: " + availability.get(i));
            System.out.println();
        }

        // Display Library Books

        System.out.println("Library Books Information");
        System.out.println("-------------------------");

        for (int i = 0; i < bookTitles.size(); i++) {

            System.out.println("Book " + i + ":");
            System.out.println("Title: " + bookTitles.get(i));
            System.out.println("Author: " + authors.get(i));

            if (availability.get(i)) {
                System.out.println("Available: Yes");
            } else {
                System.out.println("Available: No");
            }

            System.out.println();
        }
    }
}
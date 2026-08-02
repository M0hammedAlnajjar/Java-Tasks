import java.util.Stack;

public class BookStackManager {


    public static void main(String[] args) {

        String Books = IO.readln("Enter the number of books : ");
        int BookStack = Integer.parseInt(Books);

        Stack<String> books = new Stack<>();

        // Check number of books
        if (BookStack <= 0) {
            System.out.println("Invalid number of books");
        }

        else {

            // Add initial books to stack
            for (int i = 0; i < BookStack; i++) {

                String BookTitle = IO.readln("Enter book title : ");
                books.push(BookTitle);

            }

            int choice;

            // Display menu
            do {

                System.out.println("1. Add Book");
                System.out.println("2. Remove Top Book");
                System.out.println("3. View Top Book");
                System.out.println("4. Search Book");
                System.out.println("5. Display All Books");
                System.out.println("6. Display Stack Statistics");
                System.out.println("7. Exit");

                choice = Integer.parseInt(IO.readln("Enter your choice : "));


                // Process menu selection
                switch (choice) {

                    // Add Book
                    case 1:
                        String NewBook = IO.readln("Enter book title : ");
                        books.push(NewBook);
                        System.out.println("Book added successfully.");
                        break;


                    // Remove Top Book
                    case 2:
                        if (books.isEmpty()) {
                            System.out.println("No books available.");
                        }
                        else {
                            System.out.println("Removed book: " + books.pop());
                        }
                        break;


                    // View Top Book
                    case 3:
                        if (books.isEmpty()) {
                            System.out.println("No books available.");
                        }
                        else {
                            System.out.println("Top book: " + books.peek());
                        }
                        break;


                    // Search Book
                    case 4:
                        String SearchBook = IO.readln("Enter book title to search : ");

                        int position = books.search(SearchBook);

                        if (position != -1) {
                            System.out.println("Book position from top: " + position);
                        }
                        else {
                            System.out.println("Book not found.");
                        }
                        break;


                    // Display All Books
                    case 5:
                        System.out.println("Books in stack: " + books);
                        break;


                    // Display Stack Statistics
                    case 6:
                        System.out.println("Total number of books: " + books.size());

                        if (books.isEmpty()) {
                            System.out.println("Top book: No books available.");
                        }
                        else {
                            System.out.println("Top book: " + books.peek());
                        }

                        System.out.println("Stack is empty: " + books.isEmpty());
                        break;


                    // Exit
                    case 7:
                        System.out.println("Exit");
                        break;


                    default:
                        System.out.println("Invalid choice.");

                }

            } while (choice != 7);

        }


    }
}
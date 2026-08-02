import java.util.Stack;

public class BookStackManager {


    public static void main(String[] args) {

        String Books = IO.readln("Enter the number of books : ");
        int BookStack = Integer.parseInt(Books);

        Stack<String> books = new Stack<>();

        if (BookStack <= 0) {
            IO.println("Invalid number of books");
        }

        else {
            for (int i =0;i<BookStack ; i++){

                String BookTitle = IO.readln("Enter book title : ");
                books.push(BookTitle);

            }
        }


    }
}
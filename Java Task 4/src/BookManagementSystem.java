import java.util.ArrayList;
public class BookManagementSystem {

        public class LibraryBookManagementSystem {

            public static void main(String[] args) {


                // 1. Create Book Lists

                ArrayList<String> bookTitles = new ArrayList<>();

                ArrayList<String> authors = new ArrayList<>();

                ArrayList<Boolean> availability = new ArrayList<>();



                // Add 10 Books

                bookTitles.add("Java Programming");
                authors.add("James Gosling");
                availability.add(true);


                bookTitles.add("Clean Code");
                authors.add("Robert Martin");
                availability.add(false);


                bookTitles.add("Python Basics");
                authors.add("Mark Lutz");
                availability.add(true);


                bookTitles.add("Database Systems");
                authors.add("Thomas Connolly");
                availability.add(true);


                bookTitles.add("Artificial Intelligence");
                authors.add("Stuart Russell");
                availability.add(false);


                bookTitles.add("Web Development");
                authors.add("Jon Duckett");
                availability.add(true);


                bookTitles.add("Computer Networks");
                authors.add("Andrew Tanenbaum");
                availability.add(false);


                bookTitles.add("Software Engineering");
                authors.add("Ian Sommerville");
                availability.add(true);


                bookTitles.add("Data Structures");
                authors.add("Mark Weiss");
                availability.add(true);


                bookTitles.add("Algorithms");
                authors.add("Robert Sedgewick");
                availability.add(false);



                // Display Books

                System.out.println("===== Library Books =====");


                for (int i = 0; i < bookTitles.size(); i++) {


                    System.out.println("Book " + (i + 1));

                    System.out.println("Title: " + bookTitles.get(i));

                    System.out.println("Author: " + authors.get(i));

                    System.out.println("Available: " + availability.get(i));

                    System.out.println("---------------------");

                }


            }
        }

    }


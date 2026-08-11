package src.YourFirstClass;

public class Main {
    static void main(String[] args) {
        Book b = new Book();
        b.title = "Java Basics ";
//      b.author = " Maryam ";
        b.author = "Ishaq";

        Book book2 = new Book();
        book2.title = "OOP Fundamentals";

        b.printInfo();
    }



}

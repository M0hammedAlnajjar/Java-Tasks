package src.YourFirstClass;

public class Main {
    static void main(String[] args) {
        Book b = new Book();
        b.title = "Java Basics ";
//      b.author = " Maryam ";
        b.author = "Ishaq";

        Book book2 = new Book();
        book2.title = "OOP Fundamentals";
        book2.author = "Fatma";

        Book book3 = new Book();
        book3.title = "Advanced Java";
        book3.author = "Salim";

        b.printInfo();
        book2.printInfo();
        book3.printInfo();
    }



}

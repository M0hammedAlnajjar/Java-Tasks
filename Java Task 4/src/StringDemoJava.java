public class StringDemoJava {

    public static void main(String[] args) {

        String greeting = "Hello";
        String callName = " Ali ";
        String A1 = "Hello Codeline ";
        String A2 = "  Hello Codeline  ";
        String A3 = "     ";

        String upperCase = greeting.toUpperCase();
        IO.println(upperCase);

        String upperCase1 = callName.toUpperCase();
        IO.println("UpperCase it is : " + upperCase1);

        int lenSort = A1.length();
        IO.println("The length it is : " + lenSort);

        int lenSor2 = A2.strip().length();
        IO.println("Print without spaces length: " + lenSor2);

        boolean lenSo3 = (A3.strip().isEmpty());
        IO.println("Is empty after strip: " + lenSo3);

        boolean lenSo4 = (A3.strip().isBlank());
        IO.println("Is blank after strip: " + lenSo4);


        String input=IO.readln("Enter your name is :").strip();
        if (input.isBlank()){
            IO.println("Nmae is reqwied ");
        }
    }
}
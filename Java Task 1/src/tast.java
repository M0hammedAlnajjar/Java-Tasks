public class tast {

    public static void main(String[] args) {
        String name = IO.readln("Enter your name: \n");

        IO.println("Hello World " + name);
        IO.println("Size of string " + name.length());

        for (int i = name.length() - 1; i > -1; i--) {
            IO.println(i + " " + name.charAt(i));
        }
    }
}
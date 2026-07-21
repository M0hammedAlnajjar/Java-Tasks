import java.util.Arrays;

public class StringDemoJava {

    public static void main(String[] args) {
//
//        String greeting = "Hello";
//        String callName = " Ali ";
//        String A1 = "Hello Codeline ";
//        String A2 = "  Hello Codeline  ";
//        String A3 = "     ";
//
//        String upperCase = greeting.toUpperCase();
//        IO.println(upperCase);
//
//        String upperCase1 = callName.toUpperCase();
//        IO.println("UpperCase it is : " + upperCase1);
//
//        int lenSort = A1.length();
//        IO.println("The length it is : " + lenSort);
//
//        int lenSor2 = A2.strip().length();
//        IO.println("Print without spaces length: " + lenSor2);
//
//        boolean lenSo3 = (A3.strip().isEmpty());
//        IO.println("Is empty after strip: " + lenSo3);
//
//        boolean lenSo4 = (A3.strip().isBlank());
//        IO.println("Is blank after strip: " + lenSo4);
//
//
//        String input=IO.readln("Enter your name is :").strip();
//        if (input.isBlank()){
//            IO.println("Nmae is reqwied ");
//        }
//
//        String email =IO.readln("Enter your eamil : ").strip();
//        IO.println(email.indexOf("@"));
//        IO.println(email.indexOf("$"));
//
//
//        String t = "Hello Codeline World";
//
//        IO.println(t.indexOf("Codeline"));
//        IO.println(t.indexOf("Java"));
//        IO.println(t.lastIndexOf("Wo"));
//        IO.println(t.contains("World"));
//        IO.println(t.startsWith("Hello"));
//        IO.println(t.endsWith("World"));
//
//
//        String t = "Hello Codeline World";
//        IO.println(t.charAt(1));
//        IO.println(t.substring(6));
//        IO.println(t.substring(6,13));

//String flie = "report.pdf";
//Integer dot= flie.lastIndexOf(".");
//IO.println("file name is "+flie.substring(0,dot));
//IO.println("Fromating is "+ flie.substring(dot +1));
//
//        String t = " Hello codeline world";
//
//        IO.println(t.replace("o", "0"));
//        IO.println(t.replace("Hello  ", "Hi"));
//
//        String[] part = t.split(" ");
//
//        for (String p : part) {
//            IO.println(p);
//        }
        String CsvRow = "Mohammed,25,4158749876";

        String[] g = CsvRow.split(",");

        System.out.println(g[0]);
        System.out.println(g[1]);
        System.out.println(g[2]);





    }}
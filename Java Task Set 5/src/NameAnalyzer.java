public class NameAnalyzer {
    static void main() {

        String FileName = IO.readln("Enter the file name: ");

        if (FileName.isEmpty() ||
                FileName.charAt(0) == '.' ||
                FileName.charAt(FileName.length() - 1) == '.') {

            IO.println("Invalid file name");
            return;
        }

        IO.println("Valid file name.");
    }
}
public class NameAnalyzer {
    static void main() {

        String FileName = IO.readln("Enter the file name: ");

        if (FileName.isEmpty() ||
                FileName.charAt(0) == '.' ||
                FileName.charAt(FileName.length() - 1) == '.') {

            IO.println("Invalid file name");
            return;
        }
        int dotPosition = FileName.lastIndexOf('.');
        String baseName = FileName.substring(0, dotPosition);

        String extension = FileName.substring(dotPosition + 1).toLowerCase();
        IO.println("Base name: " + baseName);
        IO.println("Extension: " + extension);

        String category;

        if (extension.equals("txt") || extension.equals("pdf") || extension.equals("docx")) {
            category = "Document";
        }
        else if (extension.equals("jpg") || extension.equals("png") || extension.equals("gif")) {
            category = "Image";
        }
        else if (extension.equals("mp3") || extension.equals("wav")) {
            category = "Audio";
        }
        else {
            category = "Other";
        }

        IO.println("Base name: " + baseName);
        IO.println("Extension: " + extension);
        IO.println("Category: " + category);

    }
}
public class NameAnalyzer {

    public static void main(String[] args) {

        int documentCount = 0;
        int imageCount = 0;
        int audioCount = 0;
        int otherCount = 0;
        int totalFiles = 0;

        String fileName;

        while (true) {

            fileName = IO.readln("Enter file name (or stop to finish): ");

            // Stop the program when the user enters "stop"
            if (fileName.equals("stop")) {
                break;
            }

            // Check for invalid file names
            if (fileName.isEmpty() ||
                    fileName.charAt(0) == '.' ||
                    fileName.charAt(fileName.length() - 1) == '.') {

                IO.println("Invalid file name");
                continue;
            }

            int dotPosition = fileName.lastIndexOf('.');

            String baseName = fileName.substring(0, dotPosition);
            String extension = fileName.substring(dotPosition + 1).toLowerCase();

            String category;

            // Classify the file by extension
            if (extension.equals("txt") || extension.equals("pdf") || extension.equals("docx")) {
                category = "Document";
                documentCount++;
            }
            else if (extension.equals("jpg") || extension.equals("png") || extension.equals("gif")) {
                category = "Image";
                imageCount++;
            }
            else if (extension.equals("mp3") || extension.equals("wav")) {
                category = "Audio";
                audioCount++;
            }
            else {
                category = "Other";
                otherCount++;
            }

            totalFiles++;

            // Print file information
            IO.println(fileName + " -> " + category);
        }

        // Print summary
        IO.println("\nTotal files: " + totalFiles);
        IO.println("Documents: " + documentCount);
        IO.println("Images: " + imageCount);
        IO.println("Audio: " + audioCount);
        IO.println("Other: " + otherCount);
    }
}
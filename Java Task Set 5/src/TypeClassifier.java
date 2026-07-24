import java.util.ArrayList;
import java.util.List;

public class  TypeClassifier{

    public static void main(String[] args) {

        // Store file names
        List<String> fileNames = new ArrayList<>();

        fileNames.add("report.pdf");
        fileNames.add("photo.jpg");
        fileNames.add("program.java");
        fileNames.add("README");

        // File type counters
        int documentCount = 0;
        int imageCount = 0;
        int codeCount = 0;
        int otherCount = 0;

        // Check every file
        for (String fileName : fileNames) {

            String type = "Other";

            int dotIndex = fileName.lastIndexOf('.');

            // Check file extension
            if (dotIndex != -1) {

                String extension = fileName.substring(dotIndex + 1).toLowerCase();

                if (extension.equals("txt") ||
                        extension.equals("pdf") ||
                        extension.equals("docx")) {

                    type = "Document";
                    documentCount++;

                } else if (extension.equals("jpg") ||
                        extension.equals("png")) {

                    type = "Image";
                    imageCount++;

                } else if (extension.equals("java") ||
                        extension.equals("py") ||
                        extension.equals("js")) {

                    type = "Code";
                    codeCount++;

                } else {
                    otherCount++;
                }

            } else {
                otherCount++;
            }

            // Print file and its category
            System.out.println(fileName + " -> " + type);
        }

        // Print summary
        System.out.println("\nTotal Files: " + fileNames.size());
        System.out.println("Document: " + documentCount);
        System.out.println("Image: " + imageCount);
        System.out.println("Code: " + codeCount);
        System.out.println("Other: " + otherCount);
    }
}
import java.util.ArrayList;
import java.util.List;

public class  TypeClassifier {
    public static void main(String[] args) {

        List<String> fileNames = new ArrayList<>();

        fileNames.add("report.pdf");
        fileNames.add("photo.jpg");
        fileNames.add("music.mp3");
        fileNames.add("video.mp4");
        fileNames.add("document.docx");
        fileNames.add("data.csv");
        fileNames.add("program.java");
        fileNames.add("README");

        // Counters
        int documentCount = 0;
        int imageCount = 0;
        int codeCount = 0;
        int otherCount = 0;


        for (String fileName : fileNames) {

            int dotIndex = fileName.lastIndexOf('.');

            if (dotIndex == -1) {
                otherCount++;
                continue;
            }

            String extension = fileName.substring(dotIndex + 1).toLowerCase();

            // Compare the extension here
        }

        for (String fileName : fileNames) {

            int dotIndex = fileName.lastIndexOf('.');

            if (dotIndex == -1) {
                otherCount++;
                continue;
            }

            String extension = fileName.substring(dotIndex + 1).toLowerCase();

            if (extension.equals("txt") ||
                    extension.equals("pdf") ||
                    extension.equals("docx")) {

                documentCount++;

            } else if (extension.equals("jpg") ||
                    extension.equals("png")) {

                imageCount++;

            } else if (extension.equals("java") ||
                    extension.equals("py") ||
                    extension.equals("js")) {

                codeCount++;

            } else {

                otherCount++;
            }
        }
    }
}
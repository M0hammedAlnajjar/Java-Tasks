import java.util.ArrayList;
import java.util.List;

public class TypeClassifier {

    static void main() {

        List<String> fileNames = new ArrayList<>();

        fileNames.add("report.pdf");
        fileNames.add("photo.jpg");
        fileNames.add("music.mp3");
        fileNames.add("video.mp4");
        fileNames.add("document.docx");
        fileNames.add("data.csv");
        fileNames.add("program.java");
        fileNames.add("README"); // No extension

        System.out.println(fileNames);

    }
}

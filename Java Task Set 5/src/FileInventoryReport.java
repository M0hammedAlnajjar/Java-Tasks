public class FileInventoryReport {

    public static void main(String[] args) {

        // Store CSV file records
        String[] files = {
                "photo.png,340",
                "report.pdf,120",
                "music.mp3,500",
                "Main.java,80",
                "data.xlsx,200",
                "unknown.xyz,50"
        };


        // Total size
        int totalSize = 0;

        // File type counters
        int documentCount = 0;
        int imageCount = 0;
        int audioCount = 0;
        int codeCount = 0;
        int otherCount = 0;

        // Largest file information
        String largestFile = "";
        int largestSize = 0;


        // Process every CSV record
        for (String record : files) {

            String[] parts = record.split(",");

            // Check if record has two fields
            if (parts.length != 2) {
                System.out.println("Invalid record skipped: " + record);
                continue;
            }


            String fileName = parts[0].trim();
            int size = Integer.parseInt(parts[1].trim());

        }
    }}
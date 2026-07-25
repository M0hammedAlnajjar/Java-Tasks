public class FileInventoryReport {

    public static void main(String[] args) {

        // CSV file records: fileName,sizeInKb
        String[] files = {
                "photo.png,340",
                "app.java,8",
                "report.pdf,120",
                "song.mp3,5000",
                "notes.txt,50",
                "data.xlsx,200",
                "unknown.xyz,70",
                "wrongRecord"
        };

        int totalSize = 0;

        // Category counters
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


            // Get file extension
            String extension = "";

            int dotIndex = fileName.lastIndexOf(".");

            if (dotIndex != -1) {
                extension = fileName.substring(dotIndex + 1).toLowerCase();
            }


            // Classify file type
            String type;

            switch (extension) {

                case "txt":
                case "pdf":
                case "docx":
                case "xlsx":
                    type = "Document";
                    documentCount++;
                    break;

                case "jpg":
                case "png":
                case "gif":
                    type = "Image";
                    imageCount++;
                    break;

                case "mp3":
                case "wav":
                    type = "Audio";
                    audioCount++;
                    break;

                case "java":
                case "py":
                case "js":
                    type = "Code";
                    codeCount++;
                    break;

                default:
                    type = "Other";
                    otherCount++;
            }


            // Add size to total
            totalSize += size;


            // Find largest file
            if (size > largestSize) {
                largestSize = size;
                largestFile = fileName;
            }


            // Print file details
            System.out.println("File Name: " + fileName);
            System.out.println("Extension: " + extension);
            System.out.println("Type: " + type);
            System.out.println("Size: " + size + " KB");
            System.out.println("----------------------");
        }


        // Summary report
        System.out.println("\n===== File Inventory Summary =====");

        System.out.println("Total Files: " + (files.length - 1));
        System.out.println("Total Size: " + totalSize + " KB");

        System.out.println("\nCategory Counts:");
        System.out.println("Documents: " + documentCount);
        System.out.println("Images: " + imageCount);
        System.out.println("Audio: " + audioCount);
        System.out.println("Code: " + codeCount);
        System.out.println("Other: " + otherCount);

        System.out.println("\nLargest File:");
        System.out.println("Name: " + largestFile);
        System.out.println("Size: " + largestSize + " KB");
    }
}
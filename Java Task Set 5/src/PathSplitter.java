public class PathSplitter {

    public static void main(String[] args) {

        String path = IO.readln("Enter the file path: ");

        // Check if path is blank
        if (path.trim().isEmpty()) {
            System.out.println("Invalid path.");
            return;
        }

        // Check original path type
        boolean isWindows = path.contains("\\");

        // Replace backslash with slash
        path = path.replace("\\", "/");



        // Get folder and file name
        int lastSlash = path.lastIndexOf("/");

        String folder = path.substring(0, lastSlash);
        String fileName = path.substring(lastSlash + 1);

        // Get extension
        int dotIndex = fileName.lastIndexOf(".");

        String extension;

        if (dotIndex != -1) {
            extension = fileName.substring(dotIndex + 1);
        } else {
            extension = "none";
        }



        // Decide path style
        String pathStyle;

        if (isWindows) {
            pathStyle = "Windows Path";
        } else {
            pathStyle = "Unix Path";
        }

        // Print result
        System.out.println("Path: " + path);
        System.out.println("Folder: " + folder);
        System.out.println("File Name: " + fileName);
        System.out.println("Extension: " + extension);
        System.out.println("Path Style: " + pathStyle);
    }
}





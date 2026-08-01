public class CsvLineParser {

    public static void main(String[] args) {

        // Read CSV line
        String read = IO.readln("Enter your name, age and city in one line: ");

        // Split data using comma
        String[] fields = read.split(",");

        // Check if there are exactly 3 fields
        if (fields.length != 3) {
            System.out.println("Invalid record.");
            return;
        }

        // Trim each field
        String name = fields[0].trim();
        int age = Integer.parseInt(fields[1].trim());
        String city = fields[2].trim();

        // Classify age
        String ageGroup;

        if (age < 18) {
            ageGroup = "Minor";
        } else if (age <= 64) {
            ageGroup = "Adult";
        } else {
            ageGroup = "Senior";
        }

        // Print information
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Age Group: " + ageGroup);
    }
}
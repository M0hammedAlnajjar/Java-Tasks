public class CsvLineParser {

    public static void main(String[] args) {

        String read = IO.readln("Enter your name, age and city in one line: ");

        // Split data using comma
        String[] data = read.split(",");

        // Get fields
        String name = data[0].trim();
        int age = Integer.parseInt(data[1].trim());
        String city = data[2].trim();

        // Display information
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);

        // Classify age
        if (age < 18) {
            System.out.println("Classification: Minor");
        } else if (age < 60) {
            System.out.println("Classification: Adult");
        } else {
            System.out.println("Classification: Senior");
        }
    }
}
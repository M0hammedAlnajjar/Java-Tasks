public class CsvLineParser {

    static void main() {


        String Read=IO.readln(" Enter your name ,age and city in one line ");
        double d1  = Double.parseDouble(Read);

        // Split data using comma
        String[] data = read.split(",");

        // Get fields
        String name = data[0].trim();
        int age = Integer.parseInt(data[1].trim());
        String city = data[2].trim();

    }

}

import java.util.TreeSet;

public class CityDirectorySet {

    public static void main() {
        // Create TreeSet to store unique city names
        TreeSet<String> cityDirectory = new TreeSet<>();

        // Declare variables
        String n = IO.readln("Enter number of cities: ");
        int numberOfCities = Integer.parseInt(n);

        String cityName;
        String searchCity;
        String searchResult;
        String directoryClassification;


        // Check if number is valid
        if (numberOfCities <= 0) {

            System.out.println("Invalid number of cities.");

        } else {

            // Read city names
            for (int i = 0; i < numberOfCities; i++) {

                cityName = IO.readln("Enter city name " + (i + 1) + ": ");

                if (!cityDirectory.add(cityName)) {

                    System.out.println("City already exists. Duplicate entries are not allowed.");

                }

                // Search for a city
                searchCity = IO.readln("Enter city name to search: ");

                if (cityDirectory.contains(searchCity)) {

                    searchResult = "City found in the directory.";

                } else {

                    searchResult = "City not found in the directory.";

                }
                    // Classify directory
                if (cityDirectory.size() < 5) {

                    directoryClassification = "Small Directory";

                } else if (cityDirectory.size() <= 10) {

                    directoryClassification = "Medium Directory";

                } else {

                    directoryClassification = "Large Directory";

                }
                // Display results
                System.out.println("\n----- City Directory Report -----");
                System.out.println("Total cities entered: " + numberOfCities);
                System.out.println("Total unique cities: " + cityDirectory.size());
                System.out.println("Cities in alphabetical order: " + cityDirectory);
                System.out.println("Search result: " + searchResult);
                System.out.println("Directory classification: " + directoryClassification);
            }
        }
    }}




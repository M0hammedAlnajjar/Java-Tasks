import java.util.HashSet;

public class ProductInventorySet {

    public static void main(String[] args) {

        HashSet<Integer> productIDs = new HashSet<>();

        String number = IO.readln("Enter number of products: ");
        int totalProducts = Integer.parseInt(number);

        if (totalProducts <= 0) {
            IO.println("Invalid number of products ");

        } else {
            for (int i = 1; i <= totalProducts; i++) {
                String b1 = IO.readln("Enter  your totalProducts :");
                int n1 = Integer.parseInt(b1);


                if (productIDs.add(n1)) {
                    IO.println("Product already exists");

                } else {
                    IO.println("Duplicate entries are not allowed");
                }
            }

        }
    }
}
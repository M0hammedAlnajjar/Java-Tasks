import java.util.Queue;
import java.util.LinkedList;
public class TicketQueueManager {

    static void main(String[] args) {

        Queue<String> CustomerNames = new LinkedList<>();

        String  customers =IO.readln("Enter the number of customers : ");
        int number =Integer.parseInt(customers);


        if (number<=0){
            IO.println("Invalid number of customers");
        }
    }
}

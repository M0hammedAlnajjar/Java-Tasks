import java.util.Queue;
import java.util.LinkedList;
public class CustomerQueueManager {

    static void main(String[] args) {

        Queue<String> customerQueue = new LinkedList<>();

        String customers =IO.readln("Enter the number of customers : ");
        int number =Integer.parseInt(customers);

    if (number<=0){
        IO.print(" Invalid number of customers ");

    }else {
        for (int i=0 ; i< number ; i ++ ){
            String name = IO.readln("Enter customer name");
            customerQueue.add(name);
        }
    }


    }
}

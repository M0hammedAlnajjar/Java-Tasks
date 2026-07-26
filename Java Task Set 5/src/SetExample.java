import java.util.HashSet;
import java.util.Set;
public class SetExample {

    static void main() {
                HashSet<String> f1 = new HashSet<>();

                f1.add("Ali");
                f1.add("Mohammed");
                f1.add("NOOR");
                IO.println(f1);
                IO.println(f1.size());
                Boolean isPreaent=f1.contains("mohammed");
                IO.println(isPreaent);
            }
        }




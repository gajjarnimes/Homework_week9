import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Programme_9 {
    public static void main(String[] args) {
        Map<Integer, String> list = new HashMap<>();
        list.put(1, "Allen");
        list.put(2, "Jack");
        list.put(3, "Steve");
        list.put(4, "Mark");
        list.put(5, "Darren");

        //for (Map.Entry<Integer, String> peopleName : list.entrySet()) {
            Iterator<String> itr = list.values().iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
    }





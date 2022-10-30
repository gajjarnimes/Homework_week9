import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Programme_5 {

    public static void main(String[] args) {
        Set<String>list = new HashSet<>();
        //add some elements
        list.add("Nimesh");
        list.add("Gajjar");
        list.add("Learn");
        list.add("Java");
        list.add("From");
        list.add("Prime");
        list.add("Testing");

        Iterator<String> itr= list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}

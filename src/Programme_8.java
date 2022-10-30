import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.HashSet;
import java.util.Set;

public class Programme_8 {
    public static void main(String[] args) {
        // creating object
        HashSet<Integer> number = new HashSet<>();
        // add the elements
        number.add(4);
        number.add(7);
        number.add(8);

        // Show which numbers are between 1 to 10 in the set
        for (int i = 1; i <=10; i++) ;
        if (number.contains(number)){
            System.out.println(number + "was found in the set.");
        }
        else {
            System.out.println((number+"was not found in the set."));
        }
    }



    }




